public abstract class cgp extends cgi {
   protected cgp(bmc<? extends cgp> $$0, ctx $$1) {
      super($$0, $$1);
   }

   protected cgp(bmc<? extends cgp> $$0, double $$1, double $$2, double $$3, ctx $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   protected cgp(bmc<? extends cgp> $$0, bmo $$1, ctx $$2) {
      this($$0, $$1.dq(), $$1.du() - 0.1F, $$1.dw(), $$2);
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
      ema $$0 = cgj.a(this, this::b);
      boolean $$1 = false;
      if ($$0.c() == ema.a.b) {
         hx $$2 = ((ely)$$0).a();
         djp $$3 = this.dL().a_($$2);
         if ($$3.a(cxa.ed)) {
            this.g($$2);
            $$1 = true;
         } else if ($$3.a(cxa.kF)) {
            dhd $$4 = this.dL().c_($$2);
            if ($$4 instanceof dis && dis.a(this)) {
               dis.a(this.dL(), $$2, $$3, this, (dis)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != ema.a.a && !$$1) {
         this.a($$0);
      }

      this.aQ();
      emc $$5 = this.do();
      double $$6 = this.dq() + $$5.c;
      double $$7 = this.ds() + $$5.d;
      double $$8 = this.dw() + $$5.e;
      this.J();
      float $$11;
      if (this.aZ()) {
         for (int $$9 = 0; $$9 < 4; $$9++) {
            float $$10 = 0.25F;
            this.dL().a(jx.e, $$6 - $$5.c * 0.25, $$7 - $$5.d * 0.25, $$8 - $$5.e * 0.25, $$5.c, $$5.d, $$5.e);
         }

         $$11 = 0.8F;
      } else {
         $$11 = 0.99F;
      }

      this.g($$5.a((double)$$11));
      if (!this.aV()) {
         emc $$13 = this.do();
         this.o($$13.c, $$13.d - (double)this.x(), $$13.e);
      }

      this.a_($$6, $$7, $$8);
   }

   protected float x() {
      return 0.03F;
   }
}
