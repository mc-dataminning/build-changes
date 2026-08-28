import com.mojang.serialization.MapCodec;

public class djn extends dkv implements dko {
   public static final MapCodec<djn> a = b(djn::new);
   private static final fcr b = fco.a(dkl.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dkl.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<djn> a() {
      return a;
   }

   protected djn(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return b;
   }

   @Override
   protected boolean b(dxu $$0, dgm $$1, jh $$2) {
      return $$0.a(dkn.ee) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      dxj.e.a($$0, $$0.m().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }
}
