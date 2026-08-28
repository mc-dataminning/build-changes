import com.mojang.serialization.MapCodec;

public class djn extends djo {
   public static final MapCodec<djn> a = b(djn::new);
   protected static final float b = 6.0F;
   protected static final fcm c = dke.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<djn> a() {
      return a;
   }

   protected djn(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return c;
   }
}
