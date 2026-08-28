import it.unimi.dsi.fastutil.Stack;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Optional;
import java.util.function.Predicate;

public class amz {
   private static final int a = 2;

   private static amz.b a(ag $$0, boolean $$1) {
      Optional<at> $$2 = $$0.c();
      if ($$2.isEmpty()) {
         return amz.b.b;
      } else if ($$1) {
         return amz.b.a;
      } else {
         return $$2.get().j() ? amz.b.b : amz.b.c;
      }
   }

   private static boolean a(Stack<amz.b> $$0) {
      for (int $$1 = 0; $$1 <= 2; $$1++) {
         amz.b $$2 = (amz.b)$$0.peek($$1);
         if ($$2 == amz.b.a) {
            return true;
         }

         if ($$2 == amz.b.b) {
            return false;
         }
      }

      return false;
   }

   private static boolean a(ai $$0, Stack<amz.b> $$1, Predicate<ai> $$2, amz.a $$3) {
      boolean $$4 = $$2.test($$0);
      amz.b $$5 = a($$0.a(), $$4);
      boolean $$6 = $$4;
      $$1.push($$5);

      for (ai $$7 : $$0.e()) {
         $$6 |= a($$7, $$1, $$2, $$3);
      }

      boolean $$8 = $$6 || a($$1);
      $$1.pop();
      $$3.accept($$0, $$8);
      return $$6;
   }

   public static void a(ai $$0, Predicate<ai> $$1, amz.a $$2) {
      ai $$3 = $$0.d();
      Stack<amz.b> $$4 = new ObjectArrayList();

      for (int $$5 = 0; $$5 <= 2; $$5++) {
         $$4.push(amz.b.c);
      }

      a($$3, $$4, $$1, $$2);
   }

   @FunctionalInterface
   public interface a {
      void accept(ai var1, boolean var2);
   }

   static enum b {
      a,
      b,
      c;
   }
}
