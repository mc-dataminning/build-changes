import com.mojang.serialization.MapCodec;

public class dmi extends dgf {
   public static final MapCodec<dmi> a = b(dmi::new);
   protected static final float b = 6.0F;
   protected static final exp c = dfw.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dmi> a() {
      return a;
   }

   protected dmi(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return c;
   }

   @Override
   protected boolean b(dta $$0, dca $$1, jd $$2) {
      return $$0.a(awd.aL) || $$0.a(dfy.dX) || super.b($$0, $$1, $$2);
   }
}
