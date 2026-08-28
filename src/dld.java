import com.mojang.serialization.MapCodec;

public class dld extends dgh {
   public static final MapCodec<dld> a = b(dld::new);
   protected static final exv b = dfy.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dld> a() {
      return a;
   }

   public dld(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return b;
   }

   @Override
   protected boolean b(dtc $$0, dcc $$1, jd $$2) {
      return $$0.a(awe.aM) || $$0.a(dga.dX) || super.b($$0, $$1, $$2);
   }
}
