public class cqj extends cqk {
   public cqj(bvi<? extends cqj> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqj(dgz $$0, cjz $$1) {
      this(bvi.ay, $$0);
      this.c($$1);
      this.a_(
         $$1.dz() - (double)($$1.dp() + 1.0F) * 0.5 * (double)ayz.a($$1.aV * (float) (Math.PI / 180.0)),
         $$1.dD() - 0.1F,
         $$1.dF() + (double)($$1.dp() + 1.0F) * 0.5 * (double)ayz.b($$1.aV * (float) (Math.PI / 180.0))
      );
   }

   @Override
   protected double bd() {
      return 0.06;
   }

   @Override
   public void h() {
      super.h();
      fbx $$0 = this.dx();
      fbv $$1 = cqm.a(this, this::b);
      this.b($$1);
      double $$2 = this.dz() + $$0.d;
      double $$3 = this.dB() + $$0.e;
      double $$4 = this.dF() + $$0.f;
      this.A();
      float $$5 = 0.99F;
      if (this.dU().a(this.cQ()).noneMatch(dxp.a::l)) {
         this.at();
      } else if (this.bj()) {
         this.at();
      } else {
         this.i($$0.c(0.99F));
         this.bf();
         this.a_($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(fbu $$0) {
      super.a($$0);
      if (this.q() instanceof bvy $$1) {
         bva $$2 = $$0.a();
         btp $$3 = this.dV().b(this, $$1);
         if (this.dU() instanceof ard $$4 && $$2.a($$4, $$3, 1.0F)) {
            ddt.a($$4, $$2, $$3);
         }
      }
   }

   @Override
   protected void a(fbt $$0) {
      super.a($$0);
      if (!this.dU().C) {
         this.at();
      }
   }

   @Override
   protected void a(akb.a $$0) {
   }

   @Override
   public void a(abm $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dU().a(lt.ak, this.dz(), this.dB(), this.dF(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.n($$1, $$2, $$3);
   }
}
