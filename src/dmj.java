import com.mojang.serialization.MapCodec;

public class dmj extends dke {
   public static final MapCodec<dmj> a = b(dmj::new);
   private static final fcr b = dke.b(16.0, 0.0, 15.0);

   @Override
   public MapCodec<dmj> a() {
      return a;
   }

   protected dmj(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dxq $$0) {
      return true;
   }

   @Override
   public dxq a(dax $$0) {
      return !this.m().a((dhc)$$0.q(), $$0.a()) ? dke.a(this.m(), dkg.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$4 == jn.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      dnc.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      dxq $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dne;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return b;
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
