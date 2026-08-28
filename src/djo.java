import com.mojang.serialization.MapCodec;

public class djo extends dkw implements dkp {
   public static final MapCodec<djo> a = b(djo::new);
   private static final fcs b = fcp.a(dkm.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dkm.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<djo> a() {
      return a;
   }

   protected djo(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return b;
   }

   @Override
   protected boolean b(dxv $$0, dgn $$1, jh $$2) {
      return $$0.a(dko.ee) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      dxk.e.a($$0, $$0.m().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
