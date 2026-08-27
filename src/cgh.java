public abstract class cgh extends cga {
   protected cgh(blz<? extends cgh> $$0, ctp $$1) {
      super($$0, $$1);
   }

   protected cgh(blz<? extends cgh> $$0, double $$1, double $$2, double $$3, ctp $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   protected cgh(blz<? extends cgh> $$0, bml $$1, ctp $$2) {
      this($$0, $$1.dr(), $$1.dv() - 0.1F, $$1.dx(), $$2);
      this.b((blv)$$1);
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
      elr $$0 = cgb.a(this, this::a);
      boolean $$1 = false;
      if ($$0.c() == elr.a.b) {
         hx $$2 = ((elp)$$0).a();
         djh $$3 = this.dM().a_($$2);
         if ($$3.a(cws.ed)) {
            this.f($$2);
            $$1 = true;
         } else if ($$3.a(cws.kF)) {
            dgv $$4 = this.dM().c_($$2);
            if ($$4 instanceof dik && dik.a(this)) {
               dik.a(this.dM(), $$2, $$3, this, (dik)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != elr.a.a && !$$1) {
         this.a($$0);
      }

      this.aQ();
      elt $$5 = this.dp();
      double $$6 = this.dr() + $$5.c;
      double $$7 = this.dt() + $$5.d;
      double $$8 = this.dx() + $$5.e;
      this.K();
      float $$11;
      if (this.aZ()) {
         for (int $$9 = 0; $$9 < 4; $$9++) {
            float $$10 = 0.25F;
            this.dM().a(jx.e, $$6 - $$5.c * 0.25, $$7 - $$5.d * 0.25, $$8 - $$5.e * 0.25, $$5.c, $$5.d, $$5.e);
         }

         $$11 = 0.8F;
      } else {
         $$11 = 0.99F;
      }

      this.g($$5.a((double)$$11));
      if (!this.aV()) {
         elt $$13 = this.dp();
         this.o($$13.c, $$13.d - (double)this.x(), $$13.e);
      }

      this.a_($$6, $$7, $$8);
   }

   protected float x() {
      return 0.03F;
   }
}
