public class cqo extends cqp {
   public cqo(bvq<? extends cqo> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public cqo(dhh $$0, ckd $$1) {
      this(bvq.az, $$0);
      this.c($$1);
      this.a_(
         $$1.dA() - (double)($$1.dq() + 1.0F) * 0.5 * (double)bae.a($$1.aX * (float) (Math.PI / 180.0)),
         $$1.dE() - 0.1F,
         $$1.dG() + (double)($$1.dq() + 1.0F) * 0.5 * (double)bae.b($$1.aX * (float) (Math.PI / 180.0))
      );
   }

   @Override
   protected double bd() {
      return 0.06;
   }

   @Override
   public void h() {
      super.h();
      fbx $$0 = this.dy();
      fbv $$1 = cqr.a(this, this::b);
      this.b($$1);
      double $$2 = this.dA() + $$0.d;
      double $$3 = this.dC() + $$0.e;
      double $$4 = this.dG() + $$0.f;
      this.E();
      float $$5 = 0.99F;
      if (this.dV().a(this.cR()).noneMatch(dxt.a::l)) {
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
         btz $$3 = this.dW().b(this, $$1);
         if (this.dV() instanceof ash $$4 && $$2.a($$4, $$3, 1.0F)) {
            dea.a($$4, $$2, $$3);
         }
      }
   }

   @Override
   protected void a(fbt $$0) {
      super.a($$0);
      if (!this.dV().C) {
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
         this.dV().a(ls.ai, this.dA(), this.dC(), this.dG(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.n($$1, $$2, $$3);
   }
}
