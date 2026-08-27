import it.unimi.dsi.fastutil.Stack;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Optional;
import java.util.function.Predicate;

public class ags {
   private static final int a = 2;

   private static ags.b a(ae $$0, boolean $$1) {
      Optional<aq> $$2 = $$0.d();
      if ($$2.isEmpty()) {
         return ags.b.b;
      } else if ($$1) {
         return ags.b.a;
      } else {
         return $$2.get().j() ? ags.b.b : ags.b.c;
      }
   }

   private static boolean a(Stack<ags.b> $$0) {
      for (int $$1 = 0; $$1 <= 2; $$1++) {
         ags.b $$2 = (ags.b)$$0.peek($$1);
         if ($$2 == ags.b.a) {
            return true;
         }

         if ($$2 == ags.b.b) {
            return false;
         }
      }

      return false;
   }

   private static boolean a(ag $$0, Stack<ags.b> $$1, Predicate<ag> $$2, ags.a $$3) {
      boolean $$4 = $$2.test($$0);
      ags.b $$5 = a($$0.a(), $$4);
      boolean $$6 = $$4;
      $$1.push($$5);

      for (ag $$7 : $$0.e()) {
         $$6 |= a($$7, $$1, $$2, $$3);
      }

      boolean $$8 = $$6 || a($$1);
      $$1.pop();
      $$3.accept($$0, $$8);
      return $$6;
   }

   public static void a(ag $$0, Predicate<ag> $$1, ags.a $$2) {
      ag $$3 = $$0.d();
      Stack<ags.b> $$4 = new ObjectArrayList();

      for (int $$5 = 0; $$5 <= 2; $$5++) {
         $$4.push(ags.b.c);
      }

      a($$3, $$4, $$1, $$2);
   }

   @FunctionalInterface
   public interface a {
      void accept(ag var1, boolean var2);
   }

   static enum b {
      a,
      b,
      c;
   }
}
