import it.unimi.dsi.fastutil.Stack;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Optional;
import java.util.function.Predicate;

public class amj {
   private static final int a = 2;

   private static amj.b a(ag $$0, boolean $$1) {
      Optional<at> $$2 = $$0.c();
      if ($$2.isEmpty()) {
         return amj.b.b;
      } else if ($$1) {
         return amj.b.a;
      } else {
         return $$2.get().j() ? amj.b.b : amj.b.c;
      }
   }

   private static boolean a(Stack<amj.b> $$0) {
      for (int $$1 = 0; $$1 <= 2; $$1++) {
         amj.b $$2 = (amj.b)$$0.peek($$1);
         if ($$2 == amj.b.a) {
            return true;
         }

         if ($$2 == amj.b.b) {
            return false;
         }
      }

      return false;
   }

   private static boolean a(ai $$0, Stack<amj.b> $$1, Predicate<ai> $$2, amj.a $$3) {
      boolean $$4 = $$2.test($$0);
      amj.b $$5 = a($$0.a(), $$4);
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

   public static void a(ai $$0, Predicate<ai> $$1, amj.a $$2) {
      ai $$3 = $$0.d();
      Stack<amj.b> $$4 = new ObjectArrayList();

      for (int $$5 = 0; $$5 <= 2; $$5++) {
         $$4.push(amj.b.c);
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
