import it.unimi.dsi.fastutil.Stack;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Optional;
import java.util.function.Predicate;

public class amd {
   private static final int a = 2;

   private static amd.b a(ah $$0, boolean $$1) {
      Optional<au> $$2 = $$0.c();
      if ($$2.isEmpty()) {
         return amd.b.b;
      } else if ($$1) {
         return amd.b.a;
      } else {
         return $$2.get().j() ? amd.b.b : amd.b.c;
      }
   }

   private static boolean a(Stack<amd.b> $$0) {
      for (int $$1 = 0; $$1 <= 2; $$1++) {
         amd.b $$2 = (amd.b)$$0.peek($$1);
         if ($$2 == amd.b.a) {
            return true;
         }

         if ($$2 == amd.b.b) {
            return false;
         }
      }

      return false;
   }

   private static boolean a(aj $$0, Stack<amd.b> $$1, Predicate<aj> $$2, amd.a $$3) {
      boolean $$4 = $$2.test($$0);
      amd.b $$5 = a($$0.a(), $$4);
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

   public static void a(aj $$0, Predicate<aj> $$1, amd.a $$2) {
      aj $$3 = $$0.d();
      Stack<amd.b> $$4 = new ObjectArrayList();

      for (int $$5 = 0; $$5 <= 2; $$5++) {
         $$4.push(amd.b.c);
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
