import com.mojang.serialization.MapCodec;

public class dmk extends dke {
   public static final MapCodec<dmk> a = b(dmk::new);
   protected static final fcm b = dnc.c;

   @Override
   public MapCodec<dmk> a() {
      return a;
   }

   protected dmk(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dxn $$0) {
      return true;
   }

   @Override
   public dxn a(dbb $$0) {
      return !this.m().a((dhd)$$0.q(), $$0.a()) ? dke.a(this.m(), dkg.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$4 == jm.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      dnc.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      dxn $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dne;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return b;
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }
}
