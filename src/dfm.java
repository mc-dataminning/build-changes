import com.mojang.serialization.MapCodec;

public abstract class dfm extends dfw {
   protected static final int a = 2;
   protected static final exp b = dfw.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected dfm(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfm> a();

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return b;
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return $$1 == ji.a && !this.a($$0, $$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return a($$1, $$2.d(), ji.b);
   }
}
