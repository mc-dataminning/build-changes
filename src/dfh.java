import com.mojang.serialization.MapCodec;

public class dfh extends dfi {
   public static final MapCodec<dfh> a = b(dfh::new);
   protected static final float b = 6.0F;
   protected static final exv c = dfy.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dfh> a() {
      return a;
   }

   protected dfh(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return c;
   }
}
