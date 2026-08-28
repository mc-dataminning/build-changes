import com.mojang.serialization.MapCodec;

public class dpl extends dko {
   public static final MapCodec<dpl> a = b(dpl::new);
   protected static final fcm b = dke.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dpl> a() {
      return a;
   }

   public dpl(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return b;
   }

   @Override
   protected boolean b(dxn $$0, dgf $$1, jh $$2) {
      return $$0.a(axu.aO) || $$0.a(dkg.ek) || super.b($$0, $$1, $$2);
   }
}
