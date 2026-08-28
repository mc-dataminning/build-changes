import it.unimi.dsi.fastutil.Stack;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Optional;
import java.util.function.Predicate;

public class alq {
   private static final int a = 2;

   private static alq.b a(af $$0, boolean $$1) {
      Optional<as> $$2 = $$0.c();
      if ($$2.isEmpty()) {
         return alq.b.b;
      } else if ($$1) {
         return alq.b.a;
      } else {
         return $$2.get().j() ? alq.b.b : alq.b.c;
      }
   }

   private static boolean a(Stack<alq.b> $$0) {
      for (int $$1 = 0; $$1 <= 2; $$1++) {
         alq.b $$2 = (alq.b)$$0.peek($$1);
         if ($$2 == alq.b.a) {
            return true;
         }

         if ($$2 == alq.b.b) {
            return false;
         }
      }

      return false;
   }

   private static boolean a(ah $$0, Stack<alq.b> $$1, Predicate<ah> $$2, alq.a $$3) {
      boolean $$4 = $$2.test($$0);
      alq.b $$5 = a($$0.a(), $$4);
      boolean $$6 = $$4;
      $$1.push($$5);

      for (ah $$7 : $$0.e()) {
         $$6 |= a($$7, $$1, $$2, $$3);
      }

      boolean $$8 = $$6 || a($$1);
      $$1.pop();
      $$3.accept($$0, $$8);
      return $$6;
   }

   public static void a(ah $$0, Predicate<ah> $$1, alq.a $$2) {
      ah $$3 = $$0.d();
      Stack<alq.b> $$4 = new ObjectArrayList();

      for (int $$5 = 0; $$5 <= 2; $$5++) {
         $$4.push(alq.b.c);
      }

      a($$3, $$4, $$1, $$2);
   }

   @FunctionalInterface
   public interface a {
      void accept(ah var1, boolean var2);
   }

   static enum b {
      a,
      b,
      c;
   }
}
