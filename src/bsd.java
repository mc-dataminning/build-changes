import java.util.Set;
import java.util.function.Predicate;

public interface bsd extends bsb {
   float r_ = 4.0F;

   int b();

   boolean c();

   cwp a(int var1);

   cwp a(int var1, int var2);

   cwp b(int var1);

   void a(int var1, cwp var2);

   default int an_() {
      return 99;
   }

   default int e_(cwp $$0) {
      return Math.min(this.an_(), $$0.k());
   }

   void e();

   boolean a(cox var1);

   default void c_(cox $$0) {
   }

   default void c(cox $$0) {
   }

   default boolean b(int $$0, cwp $$1) {
      return true;
   }

   default boolean a(bsd $$0, int $$1, cwp $$2) {
      return true;
   }

   default int a_(cwl $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cwp $$3 = this.a($$2);
         if ($$3.h().equals($$0)) {
            $$1 += $$3.M();
         }
      }

      return $$1;
   }

   default boolean a(Set<cwl> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<cwp> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cwp $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dtz $$0, cox $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dtz $$0, cox $$1, float $$2) {
      dgi $$3 = $$0.i();
      ji $$4 = $$0.aA_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
