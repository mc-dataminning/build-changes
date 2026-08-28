import java.util.Set;
import java.util.function.Predicate;

public interface bsb extends brz {
   float r_ = 4.0F;

   int b();

   boolean c();

   cwn a(int var1);

   cwn a(int var1, int var2);

   cwn b(int var1);

   void a(int var1, cwn var2);

   default int an_() {
      return 99;
   }

   default int e_(cwn $$0) {
      return Math.min(this.an_(), $$0.k());
   }

   void e();

   boolean a(cov var1);

   default void c_(cov $$0) {
   }

   default void c(cov $$0) {
   }

   default boolean b(int $$0, cwn $$1) {
      return true;
   }

   default boolean a(bsb $$0, int $$1, cwn $$2) {
      return true;
   }

   default int a_(cwj $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cwn $$3 = this.a($$2);
         if ($$3.h().equals($$0)) {
            $$1 += $$3.M();
         }
      }

      return $$1;
   }

   default boolean a(Set<cwj> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<cwn> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cwn $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dtx $$0, cov $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dtx $$0, cov $$1, float $$2) {
      dgg $$3 = $$0.i();
      ji $$4 = $$0.aA_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
