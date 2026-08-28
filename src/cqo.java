public class cqo extends cqp {
   public cqo(bvq<? extends cqo> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public cqo(dhh $$0, ckd $$1) {
      this(bvq.az, $$0);
      this.c($$1);
      this.a_(
         $$1.dB() - (double)($$1.dr() + 1.0F) * 0.5 * (double)bae.a($$1.aX * (float) (Math.PI / 180.0)),
         $$1.dF() - 0.1F,
         $$1.dH() + (double)($$1.dr() + 1.0F) * 0.5 * (double)bae.b($$1.aX * (float) (Math.PI / 180.0))
      );
   }

   @Override
   protected double bd() {
      return 0.06;
   }

   @Override
   public void h() {
      super.h();
      fbx $$0 = this.dz();
      fbv $$1 = cqr.a(this, this::b);
      this.b($$1);
      double $$2 = this.dB() + $$0.d;
      double $$3 = this.dD() + $$0.e;
      double $$4 = this.dH() + $$0.f;
      this.E();
      float $$5 = 0.99F;
      if (this.dW().a(this.cR()).noneMatch(dxt.a::l)) {
         this.at();
      } else if (this.bm()) {
         this.at();
      } else {
         this.h($$0.c(0.99F));
         this.bf();
         this.a_($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(fbu $$0) {
      super.a($$0);
      if (this.p() instanceof bwf $$1) {
         bvj $$2 = $$0.a();
         btz $$3 = this.dX().b(this, $$1);
         if (this.dW() instanceof ash $$4 && $$2.a($$4, $$3, 1.0F)) {
            dea.a($$4, $$2, $$3);
         }
      }
   }

   @Override
   protected void a(fbt $$0) {
      super.a($$0);
      if (!this.dW().C) {
         this.at();
      }
   }

   @Override
   protected void a(alg.a $$0) {
   }

   @Override
   public void a(acs $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dW().a(ls.ai, this.dB(), this.dD(), this.dH(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.n($$1, $$2, $$3);
   }
}
