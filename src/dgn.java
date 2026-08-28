import com.mojang.serialization.MapCodec;

public class dgn extends dfw {
   public static final MapCodec<dgn> a = b(dgn::new);
   protected static final exp b = dfw.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends dgn> a() {
      return a;
   }

   public dgn(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return b;
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return !$$0.a($$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return !$$1.u($$2.d());
   }
}
