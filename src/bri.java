import java.util.Set;
import java.util.function.Predicate;

public interface bri extends brg {
   float q_ = 4.0F;

   int b();

   boolean c();

   cvp a(int var1);

   cvp a(int var1, int var2);

   cvp b(int var1);

   void a(int var1, cvp var2);

   default int ak_() {
      return 99;
   }

   default int f_(cvp $$0) {
      return Math.min(this.ak_(), $$0.k());
   }

   void e();

   boolean a(cnu var1);

   default void d_(cnu $$0) {
   }

   default void c(cnu $$0) {
   }

   default boolean b(int $$0, cvp $$1) {
      return true;
   }

   default boolean a(bri $$0, int $$1, cvp $$2) {
      return true;
   }

   default int a_(cvk $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cvp $$3 = this.a($$2);
         if ($$3.h().equals($$0)) {
            $$1 += $$3.J();
         }
      }

      return $$1;
   }

   default boolean a_(Set<cvk> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<cvp> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cvp $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(drs $$0, cnu $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(drs $$0, cnu $$1, float $$2) {
      deg $$3 = $$0.i();
      je $$4 = $$0.aB_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
