import com.mojang.serialization.MapCodec;

public class dhx extends dgh {
   public static final MapCodec<dhx> a = b(dhx::new);
   protected static final float b = 6.0F;
   protected static final exv c = dfy.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dhx> a() {
      return a;
   }

   protected dhx(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return c;
   }

   @Override
   protected boolean b(dtc $$0, dcc $$1, jd $$2) {
      return $$0.a(awe.cm);
   }
}
