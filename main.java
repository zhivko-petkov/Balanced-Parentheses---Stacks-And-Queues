package Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        boolean stackInf = false;
        String[] par = sc.nextLine().split("");

        for (int i = 0; i < par.length; i++) {
            if(par[i].equals("{") || par[i].equals("(") || par[i].equals("[")){
                stack.push(par[i]);

            }
            else if (par[i].equals("}") || par[i].equals(")") || par[i].equals("]")){
                if(stack.isEmpty()) {
                    stackInf = false;
                    break;
                }
                    String scope = stack.peek();
                    if (scope.equals("(") && par[i].equals(")")) {
                        stackInf = true;
                        stack.pop();
                    } else if (scope.equals("{") && par[i].equals("}")) {
                        stackInf = true;
                        stack.pop();
                    } else if (scope.equals("[") && par[i].equals("]")) {
                        stackInf = true;
                        stack.pop();
                    } else {
                        stackInf = false;
                        break;
                    }

                }
            }

        if(stackInf){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
