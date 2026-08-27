import com.mojang.serialization.MapCodec;

public class dcc extends cxh {
   public static final MapCodec<dcc> a = b(dcc::new);
   protected static final emv b = cwy.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dcc> a() {
      return a;
   }

   public dcc(djo.d $$0) {
      super($$0);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return b;
   }

   @Override
   protected boolean b(djp $$0, ctd $$1, hx $$2) {
      return $$0.a(asi.aK) || $$0.a(cxa.dX) || super.b($$0, $$1, $$2);
   }
}
