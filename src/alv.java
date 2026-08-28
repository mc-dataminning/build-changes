import it.unimi.dsi.fastutil.Stack;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Optional;
import java.util.function.Predicate;

public class alv {
   private static final int a = 2;

   private static alv.b a(ah $$0, boolean $$1) {
      Optional<au> $$2 = $$0.c();
      if ($$2.isEmpty()) {
         return alv.b.b;
      } else if ($$1) {
         return alv.b.a;
      } else {
         return $$2.get().j() ? alv.b.b : alv.b.c;
      }
   }

   private static boolean a(Stack<alv.b> $$0) {
      for (int $$1 = 0; $$1 <= 2; $$1++) {
         alv.b $$2 = (alv.b)$$0.peek($$1);
         if ($$2 == alv.b.a) {
            return true;
         }

         if ($$2 == alv.b.b) {
            return false;
         }
      }

      return false;
   }

   private static boolean a(aj $$0, Stack<alv.b> $$1, Predicate<aj> $$2, alv.a $$3) {
      boolean $$4 = $$2.test($$0);
      alv.b $$5 = a($$0.a(), $$4);
      boolean $$6 = $$4;
      $$1.push($$5);

      for (aj $$7 : $$0.e()) {
         $$6 |= a($$7, $$1, $$2, $$3);
      }

      boolean $$8 = $$6 || a($$1);
      $$1.pop();
      $$3.accept($$0, $$8);
      return $$6;
   }

   public static void a(aj $$0, Predicate<aj> $$1, alv.a $$2) {
      aj $$3 = $$0.d();
      Stack<alv.b> $$4 = new ObjectArrayList();

      for (int $$5 = 0; $$5 <= 2; $$5++) {
         $$4.push(alv.b.c);
      }

      a($$3, $$4, $$1, $$2);
   }

   @FunctionalInterface
   public interface a {
      void accept(aj var1, boolean var2);
   }

   static enum b {
      a,
      b,
      c;
   }
}
