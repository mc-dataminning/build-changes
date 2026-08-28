import java.util.Set;
import java.util.function.Predicate;

public interface brr extends brp {
   float q_ = 4.0F;

   int b();

   boolean c();

   cvx a(int var1);

   cvx a(int var1, int var2);

   cvx b(int var1);

   void a(int var1, cvx var2);

   default int am_() {
      return 99;
   }

   default int e_(cvx $$0) {
      return Math.min(this.am_(), $$0.k());
   }

   void e();

   boolean a(coh var1);

   default void d_(coh $$0) {
   }

   default void c(coh $$0) {
   }

   default boolean b(int $$0, cvx $$1) {
      return true;
   }

   default boolean a(brr $$0, int $$1, cvx $$2) {
      return true;
   }

   default int a_(cvt $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cvx $$3 = this.a($$2);
         if ($$3.h().equals($$0)) {
            $$1 += $$3.L();
         }
      }

      return $$1;
   }

   default boolean a_(Set<cvt> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<cvx> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cvx $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dsg $$0, coh $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dsg $$0, coh $$1, float $$2) {
      dev $$3 = $$0.i();
      jg $$4 = $$0.aC_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
