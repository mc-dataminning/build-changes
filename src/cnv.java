public abstract class cnv extends cnn {
   protected cnv(bsw<? extends cnv> $$0, dcu $$1) {
      super($$0, $$1);
   }

   protected cnv(bsw<? extends cnv> $$0, double $$1, double $$2, double $$3, dcu $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   protected cnv(bsw<? extends cnv> $$0, btl $$1, dcu $$2) {
      this($$0, $$1.dv(), $$1.dz() - 0.1F, $$1.dB(), $$2);
      this.c($$1);
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cL().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   @Override
   public boolean cx() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      ewu $$0 = cnp.a(this, this::b);
      if ($$0.c() != ewu.a.a) {
         this.b($$0);
      }

      this.aT();
      eww $$1 = this.dt();
      double $$2 = this.dv() + $$1.c;
      double $$3 = this.dx() + $$1.d;
      double $$4 = this.dB() + $$1.e;
      this.K();
      float $$7;
      if (this.bf()) {
         for (int $$5 = 0; $$5 < 4; $$5++) {
            float $$6 = 0.25F;
            this.dQ().a(lm.d, $$2 - $$1.c * 0.25, $$3 - $$1.d * 0.25, $$4 - $$1.e * 0.25, $$1.c, $$1.d, $$1.e);
         }

         $$7 = 0.8F;
      } else {
         $$7 = 0.99F;
      }

      this.i($$1.a((double)$$7));
      this.bb();
      this.a_($$2, $$3, $$4);
   }

   @Override
   protected double aZ() {
      return 0.03;
   }
}
