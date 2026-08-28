import it.unimi.dsi.fastutil.Stack;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Optional;
import java.util.function.Predicate;

public class amh {
   private static final int a = 2;

   private static amh.b a(af $$0, boolean $$1) {
      Optional<as> $$2 = $$0.c();
      if ($$2.isEmpty()) {
         return amh.b.b;
      } else if ($$1) {
         return amh.b.a;
      } else {
         return $$2.get().j() ? amh.b.b : amh.b.c;
      }
   }

   private static boolean a(Stack<amh.b> $$0) {
      for (int $$1 = 0; $$1 <= 2; $$1++) {
         amh.b $$2 = (amh.b)$$0.peek($$1);
         if ($$2 == amh.b.a) {
            return true;
         }

         if ($$2 == amh.b.b) {
            return false;
         }
      }

      return false;
   }

   private static boolean a(ah $$0, Stack<amh.b> $$1, Predicate<ah> $$2, amh.a $$3) {
      boolean $$4 = $$2.test($$0);
      amh.b $$5 = a($$0.a(), $$4);
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

   public static void a(ah $$0, Predicate<ah> $$1, amh.a $$2) {
      ah $$3 = $$0.d();
      Stack<amh.b> $$4 = new ObjectArrayList();

      for (int $$5 = 0; $$5 <= 2; $$5++) {
         $$4.push(amh.b.c);
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
