import com.mojang.serialization.MapCodec;

public class dqz extends dkv {
   public static final MapCodec<dqz> a = b(dqz::new);
   protected static final float b = 6.0F;
   protected static final fcr c = dkl.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dqz> a() {
      return a;
   }

   protected dqz(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return c;
   }

   @Override
   protected boolean b(dxu $$0, dgm $$1, jh $$2) {
      return $$0.a(axu.aO) || $$0.a(dkn.ek) || super.b($$0, $$1, $$2);
   }
}
