import com.mojang.serialization.MapCodec;

public class dlb extends dgf {
   public static final MapCodec<dlb> a = b(dlb::new);
   protected static final exp b = dfw.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dlb> a() {
      return a;
   }

   public dlb(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return b;
   }

   @Override
   protected boolean b(dta $$0, dca $$1, jd $$2) {
      return $$0.a(awd.aL) || $$0.a(dfy.dX) || super.b($$0, $$1, $$2);
   }
}
