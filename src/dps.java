import com.mojang.serialization.MapCodec;

public class dps extends dkv {
   public static final MapCodec<dps> a = b(dps::new);
   protected static final fcr b = dkl.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dps> a() {
      return a;
   }

   public dps(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return b;
   }

   @Override
   protected boolean b(dxu $$0, dgm $$1, jh $$2) {
      return $$0.a(axu.aO) || $$0.a(dkn.ek) || super.b($$0, $$1, $$2);
   }
}
