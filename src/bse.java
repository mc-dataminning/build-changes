import java.util.Set;
import java.util.function.Predicate;

public interface bse extends bsc {
   float r_ = 4.0F;

   int b();

   boolean c();

   cwq a(int var1);

   cwq a(int var1, int var2);

   cwq b(int var1);

   void a(int var1, cwq var2);

   default int an_() {
      return 99;
   }

   default int e_(cwq $$0) {
      return Math.min(this.an_(), $$0.k());
   }

   void e();

   boolean a(coy var1);

   default void c_(coy $$0) {
   }

   default void c(coy $$0) {
   }

   default boolean b(int $$0, cwq $$1) {
      return true;
   }

   default boolean a(bse $$0, int $$1, cwq $$2) {
      return true;
   }

   default int a_(cwm $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cwq $$3 = this.a($$2);
         if ($$3.h().equals($$0)) {
            $$1 += $$3.M();
         }
      }

      return $$1;
   }

   default boolean a(Set<cwm> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<cwq> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cwq $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dua $$0, coy $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dua $$0, coy $$1, float $$2) {
      dgj $$3 = $$0.i();
      ji $$4 = $$0.aA_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
