import java.util.Set;
import java.util.function.Predicate;

public interface bsc extends bsa {
   float r_ = 4.0F;

   int b();

   boolean c();

   cwo a(int var1);

   cwo a(int var1, int var2);

   cwo b(int var1);

   void a(int var1, cwo var2);

   default int an_() {
      return 99;
   }

   default int e_(cwo $$0) {
      return Math.min(this.an_(), $$0.k());
   }

   void e();

   boolean a(cow var1);

   default void c_(cow $$0) {
   }

   default void c(cow $$0) {
   }

   default boolean b(int $$0, cwo $$1) {
      return true;
   }

   default boolean a(bsc $$0, int $$1, cwo $$2) {
      return true;
   }

   default int a_(cwk $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cwo $$3 = this.a($$2);
         if ($$3.h().equals($$0)) {
            $$1 += $$3.M();
         }
      }

      return $$1;
   }

   default boolean a(Set<cwk> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<cwo> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cwo $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dty $$0, cow $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dty $$0, cow $$1, float $$2) {
      dgh $$3 = $$0.i();
      ji $$4 = $$0.aA_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
