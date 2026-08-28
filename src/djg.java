import com.mojang.serialization.MapCodec;

public class djg extends dko implements dkh {
   public static final MapCodec<djg> a = b(djg::new);
   private static final fcm b = fcj.a(dke.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dke.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<djg> a() {
      return a;
   }

   protected djg(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return b;
   }

   @Override
   protected boolean b(dxn $$0, dgf $$1, jh $$2) {
      return $$0.a(dkg.ee) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      dxc.e.a($$0, $$0.m().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }
}
