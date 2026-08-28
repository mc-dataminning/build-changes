import it.unimi.dsi.fastutil.Stack;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Optional;
import java.util.function.Predicate;

public class amg {
   private static final int a = 2;

   private static amg.b a(ai $$0, boolean $$1) {
      Optional<av> $$2 = $$0.c();
      if ($$2.isEmpty()) {
         return amg.b.b;
      } else if ($$1) {
         return amg.b.a;
      } else {
         return $$2.get().j() ? amg.b.b : amg.b.c;
      }
   }

   private static boolean a(Stack<amg.b> $$0) {
      for (int $$1 = 0; $$1 <= 2; $$1++) {
         amg.b $$2 = (amg.b)$$0.peek($$1);
         if ($$2 == amg.b.a) {
            return true;
         }

         if ($$2 == amg.b.b) {
            return false;
         }
      }

      return false;
   }

   private static boolean a(ak $$0, Stack<amg.b> $$1, Predicate<ak> $$2, amg.a $$3) {
      boolean $$4 = $$2.test($$0);
      amg.b $$5 = a($$0.a(), $$4);
      boolean $$6 = $$4;
      $$1.push($$5);

      for (ak $$7 : $$0.e()) {
         $$6 |= a($$7, $$1, $$2, $$3);
      }

      boolean $$8 = $$6 || a($$1);
      $$1.pop();
      $$3.accept($$0, $$8);
      return $$6;
   }

   public static void a(ak $$0, Predicate<ak> $$1, amg.a $$2) {
      ak $$3 = $$0.d();
      Stack<amg.b> $$4 = new ObjectArrayList();

      for (int $$5 = 0; $$5 <= 2; $$5++) {
         $$4.push(amg.b.c);
      }

      a($$3, $$4, $$1, $$2);
   }

   @FunctionalInterface
   public interface a {
      void accept(ak var1, boolean var2);
   }

   static enum b {
      a,
      b,
      c;
   }
}
