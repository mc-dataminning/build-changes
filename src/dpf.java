import com.mojang.serialization.MapCodec;

public class dpf extends dke {
   public static final MapCodec<dpf> a = b(dpf::new);
   protected static final fcm b = dke.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   @Override
   public MapCodec<dpf> a() {
      return a;
   }

   public dpf(dxm.d $$0) {
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
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }

   @Override
   protected float c(dxn $$0, dgf $$1, jh $$2) {
      return 0.2F;
   }
}
