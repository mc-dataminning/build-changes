public abstract class cga extends cft {
   protected cga(blt<? extends cga> $$0, cti $$1) {
      super($$0, $$1);
   }

   protected cga(blt<? extends cga> $$0, double $$1, double $$2, double $$3, cti $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   protected cga(blt<? extends cga> $$0, bmf $$1, cti $$2) {
      this($$0, $$1.dr(), $$1.dv() - 0.1F, $$1.dx(), $$2);
      this.b((blp)$$1);
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
      elk $$0 = cfu.a(this, this::a);
      boolean $$1 = false;
      if ($$0.c() == elk.a.b) {
         hx $$2 = ((eli)$$0).a();
         dja $$3 = this.dM().a_($$2);
         if ($$3.a(cwl.ed)) {
            this.f($$2);
            $$1 = true;
         } else if ($$3.a(cwl.kF)) {
            dgo $$4 = this.dM().c_($$2);
            if ($$4 instanceof did && did.a(this)) {
               did.a(this.dM(), $$2, $$3, this, (did)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != elk.a.a && !$$1) {
         this.a($$0);
      }

      this.aQ();
      elm $$5 = this.dp();
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
         elm $$13 = this.dp();
         this.o($$13.c, $$13.d - (double)this.x(), $$13.e);
      }

      this.a_($$6, $$7, $$8);
   }

   protected float x() {
      return 0.03F;
   }
}
