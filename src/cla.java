public abstract class cla extends cks {
   protected cla(bqg<? extends cla> $$0, czg $$1) {
      super($$0, $$1);
   }

   protected cla(bqg<? extends cla> $$0, double $$1, double $$2, double $$3, czg $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   protected cla(bqg<? extends cla> $$0, bqt $$1, czg $$2) {
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
      esh $$0 = cku.a(this, this::b);
      boolean $$1 = false;
      if ($$0.c() == esh.a.b) {
         id $$2 = ((esf)$$0).a();
         dpi $$3 = this.dM().a_($$2);
         if ($$3.a(dcj.ed)) {
            this.f($$2);
            $$1 = true;
         } else if ($$3.a(dcj.kF)) {
            dmo $$4 = this.dM().c_($$2);
            if ($$4 instanceof doe && doe.a(this)) {
               doe.a(this.dM(), $$2, $$3, this, (doe)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != esh.a.a && !$$1) {
         this.a($$0);
      }

      this.aQ();
      esj $$5 = this.dp();
      double $$6 = this.dr() + $$5.c;
      double $$7 = this.dt() + $$5.d;
      double $$8 = this.dx() + $$5.e;
      this.J();
      float $$11;
      if (this.bc()) {
         for (int $$9 = 0; $$9 < 4; $$9++) {
            float $$10 = 0.25F;
            this.dM().a(kn.e, $$6 - $$5.c * 0.25, $$7 - $$5.d * 0.25, $$8 - $$5.e * 0.25, $$5.c, $$5.d, $$5.e);
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
