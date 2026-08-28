import com.mojang.serialization.MapCodec;

public class djp extends dkm implements dkp {
   public static final MapCodec<djp> a = b(djp::new);
   protected static final float b = 4.0F;
   protected static final fcs c = dkm.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<djp> a() {
      return a;
   }

   public djp(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      fby $$4 = $$0.a($$2);
      return c.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      return $$1.a_($$2.e()).a(axu.ax);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if (!$$0.a($$1, $$3)) {
         return dko.a.m();
      } else {
         return $$4 == jm.b && $$6.a(dko.nu) ? dko.nu.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public cxp a(dhl $$0, jh $$1, dxv $$2) {
      return new cxp(cxt.eb);
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dxv $$0, cpx $$1, dgn $$2, jh $$3) {
      return $$1.eZ().h() instanceof czd ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dhi $$0, jh $$1) {
      $$0.a($$1.d(), dko.nu.m().b(djq.i, dyh.b), 3);
   }
}
