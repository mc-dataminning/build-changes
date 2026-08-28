import com.mojang.serialization.MapCodec;

public class dmf extends dko {
   public static final MapCodec<dmf> a = b(dmf::new);
   protected static final float b = 6.0F;
   protected static final fcm c = dke.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dmf> a() {
      return a;
   }

   protected dmf(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return c;
   }

   @Override
   protected boolean b(dxn $$0, dgf $$1, jh $$2) {
      return $$0.a(axu.co);
   }
}
