import it.unimi.dsi.fastutil.Stack;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.function.Predicate;

public class afl {
   private static final int a = 2;

   private static afl.b a(ae $$0, boolean $$1) {
      an $$2 = $$0.d();
      if ($$2 == null) {
         return afl.b.b;
      } else if ($$1) {
         return afl.b.a;
      } else {
         return $$2.j() ? afl.b.b : afl.b.c;
      }
   }

   private static boolean a(Stack<afl.b> $$0) {
      for (int $$1 = 0; $$1 <= 2; $$1++) {
         afl.b $$2 = (afl.b)$$0.peek($$1);
         if ($$2 == afl.b.a) {
            return true;
         }

         if ($$2 == afl.b.b) {
            return false;
         }
      }

      return false;
   }

   private static boolean a(ae $$0, Stack<afl.b> $$1, Predicate<ae> $$2, afl.a $$3) {
      boolean $$4 = $$2.test($$0);
      afl.b $$5 = a($$0, $$4);
      boolean $$6 = $$4;
      $$1.push($$5);

      for (ae $$7 : $$0.g()) {
         $$6 |= a($$7, $$1, $$2, $$3);
      }

      boolean $$8 = $$6 || a($$1);
      $$1.pop();
      $$3.accept($$0, $$8);
      return $$6;
   }

   public static void a(ae $$0, Predicate<ae> $$1, afl.a $$2) {
      ae $$3 = $$0.c();
      Stack<afl.b> $$4 = new ObjectArrayList();

      for (int $$5 = 0; $$5 <= 2; $$5++) {
         $$4.push(afl.b.c);
      }

      a($$3, $$4, $$1, $$2);
   }

   @FunctionalInterface
   public interface a {
      void accept(ae var1, boolean var2);
   }

   static enum b {
      a,
      b,
      c;
   }
}
