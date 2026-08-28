import com.mojang.serialization.MapCodec;

public class dmr extends dkl {
   public static final MapCodec<dmr> a = b(dmr::new);
   protected static final fcr b = dnj.c;

   @Override
   public MapCodec<dmr> a() {
      return a;
   }

   protected dmr(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dxu $$0) {
      return true;
   }

   @Override
   public dxu a(dbf $$0) {
      return !this.m().a((dhk)$$0.q(), $$0.a()) ? dkl.a(this.m(), dkn.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$4 == jm.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      dnj.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      dxu $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dnl;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return b;
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }
}
