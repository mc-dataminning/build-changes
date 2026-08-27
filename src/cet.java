public abstract class cet extends cem {
   protected cet(bku<? extends cet> $$0, csa $$1) {
      super($$0, $$1);
   }

   protected cet(bku<? extends cet> $$0, double $$1, double $$2, double $$3, csa $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   protected cet(bku<? extends cet> $$0, blg $$1, csa $$2) {
      this($$0, $$1.ds(), $$1.dw() - 0.1F, $$1.dy(), $$2);
      this.b((bkq)$$1);
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
      ejs $$0 = cen.a(this, this::a);
      boolean $$1 = false;
      if ($$0.c() == ejs.a.b) {
         ht $$2 = ((ejq)$$0).a();
         dhi $$3 = this.dN().a_($$2);
         if ($$3.a(cvc.ed)) {
            this.f($$2);
            $$1 = true;
         } else if ($$3.a(cvc.kF)) {
            dfd $$4 = this.dN().c_($$2);
            if ($$4 instanceof dgs && dgs.a(this)) {
               dgs.a(this.dN(), $$2, $$3, this, (dgs)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != ejs.a.a && !$$1) {
         this.a($$0);
      }

      this.aQ();
      eju $$5 = this.dq();
      double $$6 = this.ds() + $$5.c;
      double $$7 = this.du() + $$5.d;
      double $$8 = this.dy() + $$5.e;
      this.J();
      float $$11;
      if (this.aZ()) {
         for (int $$9 = 0; $$9 < 4; $$9++) {
            float $$10 = 0.25F;
            this.dN().a(js.e, $$6 - $$5.c * 0.25, $$7 - $$5.d * 0.25, $$8 - $$5.e * 0.25, $$5.c, $$5.d, $$5.e);
         }

         $$11 = 0.8F;
      } else {
         $$11 = 0.99F;
      }

      this.g($$5.a((double)$$11));
      if (!this.aV()) {
         eju $$13 = this.dq();
         this.o($$13.c, $$13.d - (double)this.x(), $$13.e);
      }

      this.a_($$6, $$7, $$8);
   }

   protected float x() {
      return 0.03F;
   }
}
