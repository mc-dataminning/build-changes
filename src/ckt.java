public abstract class ckt extends ckl {
   protected ckt(bqb<? extends ckt> $$0, cyx $$1) {
      super($$0, $$1);
   }

   protected ckt(bqb<? extends ckt> $$0, double $$1, double $$2, double $$3, cyx $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   protected ckt(bqb<? extends ckt> $$0, bqo $$1, cyx $$2) {
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
      ery $$0 = ckn.a(this, this::b);
      boolean $$1 = false;
      if ($$0.c() == ery.a.b) {
         ib $$2 = ((erw)$$0).a();
         doz $$3 = this.dM().a_($$2);
         if ($$3.a(dca.ed)) {
            this.f($$2);
            $$1 = true;
         } else if ($$3.a(dca.kF)) {
            dmf $$4 = this.dM().c_($$2);
            if ($$4 instanceof dnv && dnv.a(this)) {
               dnv.a(this.dM(), $$2, $$3, this, (dnv)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != ery.a.a && !$$1) {
         this.a($$0);
      }

      this.aQ();
      esa $$5 = this.dp();
      double $$6 = this.dr() + $$5.c;
      double $$7 = this.dt() + $$5.d;
      double $$8 = this.dx() + $$5.e;
      this.J();
      float $$11;
      if (this.bc()) {
         for (int $$9 = 0; $$9 < 4; $$9++) {
            float $$10 = 0.25F;
            this.dM().a(kl.e, $$6 - $$5.c * 0.25, $$7 - $$5.d * 0.25, $$8 - $$5.e * 0.25, $$5.c, $$5.d, $$5.e);
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
