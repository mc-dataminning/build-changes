public abstract class cnh extends cmz {
   protected cnh(bsj<? extends cnh> $$0, dcd $$1) {
      super($$0, $$1);
   }

   protected cnh(bsj<? extends cnh> $$0, double $$1, double $$2, double $$3, dcd $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   protected cnh(bsj<? extends cnh> $$0, bsy $$1, dcd $$2) {
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
      evx $$0 = cnb.a(this, this::b);
      boolean $$1 = false;
      if ($$0.c() == evx.a.b) {
         ja $$2 = ((evv)$$0).a();
         dsh $$3 = this.dP().a_($$2);
         if ($$3.a(dfh.ed)) {
            this.f($$2);
            $$1 = true;
         } else if ($$3.a(dfh.kF)) {
            dpn $$4 = this.dP().c_($$2);
            if ($$4 instanceof drd && drd.a(this)) {
               drd.a(this.dP(), $$2, $$3, this, (drd)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != evx.a.a && !$$1) {
         this.b($$0);
      }

      this.aS();
      evz $$5 = this.ds();
      double $$6 = this.du() + $$5.c;
      double $$7 = this.dw() + $$5.d;
      double $$8 = this.dA() + $$5.e;
      this.J();
      float $$11;
      if (this.be()) {
         for (int $$9 = 0; $$9 < 4; $$9++) {
            float $$10 = 0.25F;
            this.dP().a(lj.d, $$6 - $$5.c * 0.25, $$7 - $$5.d * 0.25, $$8 - $$5.e * 0.25, $$5.c, $$5.d, $$5.e);
         }

         $$11 = 0.8F;
      } else {
         $$11 = 0.99F;
      }

      this.h($$5.a((double)$$11));
      this.ba();
      this.a_($$6, $$7, $$8);
   }

   @Override
   protected double aY() {
      return 0.03;
   }
}
