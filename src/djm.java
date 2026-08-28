import com.mojang.serialization.MapCodec;

public class djm extends djo {
   public static final MapCodec<djm> a = b(djm::new);
   private static final fcm b = dke.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends djm> a() {
      return a;
   }

   protected djm(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return b;
   }
}
