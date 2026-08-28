import com.mojang.serialization.MapCodec;

public class dpm extends dkl {
   public static final MapCodec<dpm> a = b(dpm::new);
   protected static final fcr b = dkl.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   @Override
   public MapCodec<dpm> a() {
      return a;
   }

   public dpm(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected fcr b(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return b;
   }

   @Override
   protected fcr b_(dxu $$0, dgm $$1, jh $$2) {
      return fco.b();
   }

   @Override
   protected fcr c(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return fco.b();
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }

   @Override
   protected float c(dxu $$0, dgm $$1, jh $$2) {
      return 0.2F;
   }
}
