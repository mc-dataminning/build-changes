import com.mojang.serialization.MapCodec;

public class dnw extends dfw {
   public static final MapCodec<dnw> a = b(dnw::new);
   private static final double b = 5.0;
   private static final exp c = dfw.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dnw> a() {
      return a;
   }

   protected dnw(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.a;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return c;
   }

   @Override
   protected float d(dta $$0, dca $$1, jd $$2) {
      return 1.0F;
   }
}
