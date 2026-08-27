import java.util.Set;
import java.util.function.Predicate;

public interface bje extends bjc {
   int m_ = 64;
   int n_ = 8;

   int b();

   boolean ai_();

   cmh a(int var1);

   cmh a(int var1, int var2);

   cmh b(int var1);

   void a(int var1, cmh var2);

   default int ak_() {
      return 64;
   }

   void e();

   boolean a(cer var1);

   default void d_(cer $$0) {
   }

   default void c(cer $$0) {
   }

   default boolean b(int $$0, cmh $$1) {
      return true;
   }

   default boolean a(bje $$0, int $$1, cmh $$2) {
      return true;
   }

   default int a_(cmc $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cmh $$3 = this.a($$2);
         if ($$3.d().equals($$0)) {
            $$1 += $$3.L();
         }
      }

      return $$1;
   }

   default boolean a(Set<cmc> $$0) {
      return this.a_($$1 -> !$$1.b() && $$0.contains($$1.d()));
   }

   default boolean a_(Predicate<cmh> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cmh $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dgd $$0, cer $$1) {
      return a($$0, $$1, 8);
   }

   static boolean a(dgd $$0, cer $$1, int $$2) {
      csy $$3 = $$0.i();
      hv $$4 = $$0.aB_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.i((double)$$4.u() + 0.5, (double)$$4.v() + 0.5, (double)$$4.w() + 0.5) <= (double)($$2 * $$2);
      }
   }
}
