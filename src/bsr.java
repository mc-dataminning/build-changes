import java.util.Set;
import java.util.function.Predicate;

public interface bsr extends bsp {
   float r_ = 4.0F;

   int b();

   boolean c();

   cxh a(int var1);

   cxh a(int var1, int var2);

   cxh b(int var1);

   void a(int var1, cxh var2);

   default int an_() {
      return 99;
   }

   default int e_(cxh $$0) {
      return Math.min(this.an_(), $$0.k());
   }

   void e();

   boolean a(cpr var1);

   default void c_(cpr $$0) {
   }

   default void c(cpr $$0) {
   }

   default boolean b(int $$0, cxh $$1) {
      return true;
   }

   default boolean a(bsr $$0, int $$1, cxh $$2) {
      return true;
   }

   default int a_(cxd $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cxh $$3 = this.a($$2);
         if ($$3.h().equals($$0)) {
            $$1 += $$3.M();
         }
      }

      return $$1;
   }

   default boolean a(Set<cxd> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<cxh> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cxh $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dus $$0, cpr $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dus $$0, cpr $$1, float $$2) {
      dgz $$3 = $$0.i();
      ji $$4 = $$0.aA_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
