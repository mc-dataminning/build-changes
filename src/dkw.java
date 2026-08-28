import com.mojang.serialization.MapCodec;

public class dkw extends dke {
   public static final MapCodec<dkw> a = b(dkw::new);
   protected static final fcm b = dke.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends dkw> a() {
      return a;
   }

   public dkw(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return b;
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return !$$1.u($$2.e());
   }
}
