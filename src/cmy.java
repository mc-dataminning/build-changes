public abstract class cmy extends cmq {
   protected cmy(bsc<? extends cmy> $$0, daz $$1) {
      super($$0, $$1);
   }

   protected cmy(bsc<? extends cmy> $$0, double $$1, double $$2, double $$3, daz $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   protected cmy(bsc<? extends cmy> $$0, bsq $$1, daz $$2) {
      this($$0, $$1.du(), $$1.dy() - 0.1F, $$1.dA(), $$2);
      this.c($$1);
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cK().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   @Override
   public void l() {
      super.l();
      euk $$0 = cms.a(this, this::b);
      boolean $$1 = false;
      if ($$0.c() == euk.a.b) {
         io $$2 = ((eui)$$0).a();
         drd $$3 = this.dP().a_($$2);
         if ($$3.a(dec.ed)) {
            this.g($$2);
            $$1 = true;
         } else if ($$3.a(dec.kF)) {
            doi $$4 = this.dP().c_($$2);
            if ($$4 instanceof dpy && dpy.a(this)) {
               dpy.a(this.dP(), $$2, $$3, this, (dpy)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != euk.a.a && !$$1) {
         this.b($$0);
      }

      this.aS();
      eum $$5 = this.ds();
      double $$6 = this.du() + $$5.c;
      double $$7 = this.dw() + $$5.d;
      double $$8 = this.dA() + $$5.e;
      this.J();
      float $$11;
      if (this.be()) {
         for (int $$9 = 0; $$9 < 4; $$9++) {
            float $$10 = 0.25F;
            this.dP().a(ky.d, $$6 - $$5.c * 0.25, $$7 - $$5.d * 0.25, $$8 - $$5.e * 0.25, $$5.c, $$5.d, $$5.e);
         }

         $$11 = 0.8F;
      } else {
         $$11 = 0.99F;
      }

      this.g($$5.a((double)$$11));
      this.ba();
      this.a_($$6, $$7, $$8);
   }

   @Override
   protected double aY() {
      return 0.03;
   }
}
