import com.mojang.serialization.MapCodec;

public class dhv extends dgf {
   public static final MapCodec<dhv> a = b(dhv::new);
   protected static final float b = 6.0F;
   protected static final exp c = dfw.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dhv> a() {
      return a;
   }

   protected dhv(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return c;
   }

   @Override
   protected boolean b(dta $$0, dca $$1, jd $$2) {
      return $$0.a(awd.cl);
   }
}
