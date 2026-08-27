public abstract class cju extends cjm {
   protected cju(bpd<? extends cju> $$0, cxb $$1) {
      super($$0, $$1);
   }

   protected cju(bpd<? extends cju> $$0, double $$1, double $$2, double $$3, cxb $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   protected cju(bpd<? extends cju> $$0, bpp $$1, cxb $$2) {
      this($$0, $$1.dr(), $$1.dv() - 0.1F, $$1.dx(), $$2);
      this.c($$1);
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cH().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   @Override
   public void l() {
      super.l();
      epr $$0 = cjo.a(this, this::b);
      boolean $$1 = false;
      if ($$0.c() == epr.a.b) {
         ib $$2 = ((epp)$$0).a();
         dnb $$3 = this.dM().a_($$2);
         if ($$3.a(dae.ed)) {
            this.f($$2);
            $$1 = true;
         } else if ($$3.a(dae.kF)) {
            dki $$4 = this.dM().c_($$2);
            if ($$4 instanceof dlx && dlx.a(this)) {
               dlx.a(this.dM(), $$2, $$3, this, (dlx)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != epr.a.a && !$$1) {
         this.a($$0);
      }

      this.aQ();
      ept $$5 = this.dp();
      double $$6 = this.dr() + $$5.c;
      double $$7 = this.dt() + $$5.d;
      double $$8 = this.dx() + $$5.e;
      this.I();
      float $$11;
      if (this.bc()) {
         for (int $$9 = 0; $$9 < 4; $$9++) {
            float $$10 = 0.25F;
            this.dM().a(kc.e, $$6 - $$5.c * 0.25, $$7 - $$5.d * 0.25, $$8 - $$5.e * 0.25, $$5.c, $$5.d, $$5.e);
         }

         $$11 = 0.8F;
      } else {
         $$11 = 0.99F;
      }

      this.g($$5.a((double)$$11));
      this.aY();
      this.a_($$6, $$7, $$8);
   }

   @Override
   protected double aW() {
      return 0.03;
   }
}
