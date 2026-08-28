import com.mojang.serialization.MapCodec;

public class dsm extends dko implements dkh {
   public static final MapCodec<dsm> a = b(dsm::new);
   protected static final float b = 6.0F;
   protected static final fcm c = dke.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dsm> a() {
      return a;
   }

   protected dsm(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return c;
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      return o($$2).m().a($$0, $$1) && $$0.u($$1.d());
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      dmo.a($$0, o($$3).m(), $$2, 2);
   }

   private static dmo o(dxn $$0) {
      return (dmo)($$0.a(dkg.bB) ? dkg.iZ : dkg.iY);
   }
}
