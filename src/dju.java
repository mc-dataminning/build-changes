import com.mojang.serialization.MapCodec;

public abstract class dju extends dke {
   protected static final int a = 2;
   protected static final fcm b = dke.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected dju(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dju> a();

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return b;
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return $$4 == jm.a && !this.a($$0, $$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return a($$1, $$2.e(), jm.b);
   }
}
