import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class diq extends djs {
   public static final dty<dtl> K = dtq.U;

   protected diq(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends diq> a();

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(dcx $$0, jd $$1, ji $$2) {
      jd $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      for (ji $$1 : $$0.f()) {
         dta $$2;
         if ($$1.o() == ji.a.b) {
            $$2 = this.o().a(K, $$1 == ji.b ? dtl.c : dtl.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, dtl.b).a(aE, $$1.g());
         }

         if ($$2.a((dcx)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static ji m(dta $$0) {
      switch ((dtl)$$0.c(K)) {
         case c:
            return ji.a;
         case a:
            return ji.b;
         default:
            return $$0.c(aE);
      }
   }
}
