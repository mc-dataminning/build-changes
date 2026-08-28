import java.util.Set;
import java.util.function.Predicate;

public interface bsa extends bry {
   float q_ = 4.0F;

   int b();

   boolean c();

   cwf a(int var1);

   cwf a(int var1, int var2);

   cwf b(int var1);

   void a(int var1, cwf var2);

   default int am_() {
      return 99;
   }

   default int e_(cwf $$0) {
      return Math.min(this.am_(), $$0.k());
   }

   void e();

   boolean a(cor var1);

   default void d_(cor $$0) {
   }

   default void c(cor $$0) {
   }

   default boolean b(int $$0, cwf $$1) {
      return true;
   }

   default boolean a(bsa $$0, int $$1, cwf $$2) {
      return true;
   }

   default int a_(cwb $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cwf $$3 = this.a($$2);
         if ($$3.h().equals($$0)) {
            $$1 += $$3.L();
         }
      }

      return $$1;
   }

   default boolean a(Set<cwb> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<cwf> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cwf $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dsr $$0, cor $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dsr $$0, cor $$1, float $$2) {
      dff $$3 = $$0.i();
      jh $$4 = $$0.aB_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
