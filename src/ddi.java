import com.mojang.serialization.MapCodec;

public class ddi extends cxh {
   public static final MapCodec<ddi> a = b(ddi::new);
   protected static final float b = 6.0F;
   protected static final emv c = cwy.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<ddi> a() {
      return a;
   }

   protected ddi(djo.d $$0) {
      super($$0);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return c;
   }

   @Override
   protected boolean b(djp $$0, ctd $$1, hx $$2) {
      return $$0.a(asi.aK) || $$0.a(cxa.dX) || super.b($$0, $$1, $$2);
   }
}
