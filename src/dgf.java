import com.mojang.serialization.MapCodec;

public abstract class dgf extends dfw {
   protected dgf(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dgf> a();

   protected boolean b(dta $$0, dca $$1, jd $$2) {
      return $$0.a(awd.af) || $$0.a(dfy.cC);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return !$$0.a($$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      jd $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean a_(dta $$0, dca $$1, jd $$2) {
      return $$0.u().c();
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return $$1 == epn.c && !this.aG ? true : super.a($$0, $$1);
   }
}
