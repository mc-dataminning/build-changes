import java.util.Set;
import java.util.function.Predicate;

public interface btc extends bta {
   float r_ = 4.0F;

   int b();

   boolean c();

   cxp a(int var1);

   cxp a(int var1, int var2);

   cxp b(int var1);

   void a(int var1, cxp var2);

   default int ao_() {
      return 99;
   }

   default int e_(cxp $$0) {
      return Math.min(this.ao_(), $$0.k());
   }

   void e();

   boolean a(cpx var1);

   default void c_(cpx $$0) {
   }

   default void c(cpx $$0) {
   }

   default boolean b(int $$0, cxp $$1) {
      return true;
   }

   default boolean a(btc $$0, int $$1, cxp $$2) {
      return true;
   }

   default int a_(cxl $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cxp $$3 = this.a($$2);
         if ($$3.h().equals($$0)) {
            $$1 += $$3.L();
         }
      }

      return $$1;
   }

   default boolean a(Set<cxl> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<cxp> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cxp $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dux $$0, cpx $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dux $$0, cpx $$1, float $$2) {
      dhi $$3 = $$0.i();
      jh $$4 = $$0.aB_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
