import com.mojang.serialization.MapCodec;

public class dms extends dkm {
   public static final MapCodec<dms> a = b(dms::new);
   protected static final fcs b = dnk.c;

   @Override
   public MapCodec<dms> a() {
      return a;
   }

   protected dms(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dxv $$0) {
      return true;
   }

   @Override
   public dxv a(dbg $$0) {
      return !this.m().a((dhl)$$0.q(), $$0.a()) ? dkm.a(this.m(), dko.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$4 == jm.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      dnk.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      dxv $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dnm;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return b;
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
