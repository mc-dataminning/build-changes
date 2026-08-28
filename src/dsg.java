import com.mojang.serialization.MapCodec;

public class dsg extends dke {
   public static final MapCodec<dsg> a = b(dsg::new);
   private static final double b = 5.0;
   private static final fcm c = dke.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dsg> a() {
      return a;
   }

   protected dsg(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.a;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return c;
   }

   @Override
   protected float c(dxn $$0, dgf $$1, jh $$2) {
      return 1.0F;
   }
}
