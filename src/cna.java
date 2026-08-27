public abstract class cna extends cms {
   protected cna(bsb<? extends cna> $$0, dca $$1) {
      super($$0, $$1);
   }

   protected cna(bsb<? extends cna> $$0, double $$1, double $$2, double $$3, dca $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   protected cna(bsb<? extends cna> $$0, bso $$1, dca $$2) {
      this($$0, $$1.dz(), $$1.dD() - 0.1F, $$1.dF(), $$2);
      this.c($$1);
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cP().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   @Override
   public void l() {
      super.l();
      ews $$0 = cmu.a(this, this::b);
      boolean $$1 = false;
      if ($$0.c() == ews.a.b) {
         ir $$2 = ((ewq)$$0).a();
         dtc $$3 = this.dU().a_($$2);
         if ($$3.a(dfe.eR)) {
            this.h($$2);
            $$1 = true;
         } else if ($$3.a(dfe.lD)) {
            dqc $$4 = this.dU().c_($$2);
            if ($$4 instanceof drx && drx.a(this)) {
               drx.a(this.dU(), $$2, $$3, this, (drx)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != ews.a.a && !$$1) {
         this.a($$0);
      }

      this.aW();
      ewu $$5 = this.dx();
      double $$6 = this.dz() + $$5.c;
      double $$7 = this.dB() + $$5.d;
      double $$8 = this.dF() + $$5.e;
      this.J();
      float $$11;
      if (this.bi()) {
         for (int $$9 = 0; $$9 < 4; $$9++) {
            float $$10 = 0.25F;
            this.dU().a(lb.d, $$6 - $$5.c * 0.25, $$7 - $$5.d * 0.25, $$8 - $$5.e * 0.25, $$5.c, $$5.d, $$5.e);
         }

         $$11 = 0.8F;
      } else {
         $$11 = 0.99F;
      }

      this.g($$5.a((double)$$11));
      this.be();
      this.a_($$6, $$7, $$8);
   }

   @Override
   protected double bc() {
      return 0.03;
   }
}
