public abstract class cgg extends cfz {
   protected cgg(bly<? extends cgg> $$0, cto $$1) {
      super($$0, $$1);
   }

   protected cgg(bly<? extends cgg> $$0, double $$1, double $$2, double $$3, cto $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   protected cgg(bly<? extends cgg> $$0, bmk $$1, cto $$2) {
      this($$0, $$1.dr(), $$1.dv() - 0.1F, $$1.dx(), $$2);
      this.b((blu)$$1);
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
      elq $$0 = cga.a(this, this::a);
      boolean $$1 = false;
      if ($$0.c() == elq.a.b) {
         hx $$2 = ((elo)$$0).a();
         djg $$3 = this.dM().a_($$2);
         if ($$3.a(cwr.ed)) {
            this.f($$2);
            $$1 = true;
         } else if ($$3.a(cwr.kF)) {
            dgu $$4 = this.dM().c_($$2);
            if ($$4 instanceof dij && dij.a(this)) {
               dij.a(this.dM(), $$2, $$3, this, (dij)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != elq.a.a && !$$1) {
         this.a($$0);
      }

      this.aQ();
      els $$5 = this.dp();
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
         els $$13 = this.dp();
         this.o($$13.c, $$13.d - (double)this.x(), $$13.e);
      }

      this.a_($$6, $$7, $$8);
   }

   protected float x() {
      return 0.03F;
   }
}
