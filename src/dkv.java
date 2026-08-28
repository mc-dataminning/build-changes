import com.mojang.serialization.MapCodec;

public class dkv extends dfw {
   public static final MapCodec<dkv> a = b(dkv::new);
   protected static final exp b = dfw.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   @Override
   public MapCodec<dkv> a() {
      return a;
   }

   public dkv(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected exp b(dta $$0, dca $$1, jd $$2, exb $$3) {
      return b;
   }

   @Override
   protected exp b_(dta $$0, dca $$1, jd $$2) {
      return exm.b();
   }

   @Override
   protected exp c(dta $$0, dca $$1, jd $$2, exb $$3) {
      return exm.b();
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }

   @Override
   protected float d(dta $$0, dca $$1, jd $$2) {
      return 0.2F;
   }
}
