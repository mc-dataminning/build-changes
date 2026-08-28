import com.mojang.serialization.MapCodec;

public class drt extends dke {
   public static final MapCodec<drt> a = b(drt::new);
   protected static final fcm b = dke.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<drt> a() {
      return a;
   }

   public drt(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected fcm b(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return b;
   }

   @Override
   protected fcm b_(dxn $$0, dgf $$1, jh $$2) {
      return fcj.b();
   }

   @Override
   protected fcm c(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return fcj.b();
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      dkl.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$4 == jm.b && $$6.a(dkg.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }

   @Override
   protected float c(dxn $$0, dgf $$1, jh $$2) {
      return 0.2F;
   }
}
