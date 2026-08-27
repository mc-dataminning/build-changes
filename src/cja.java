public abstract class cja extends cis {
   protected cja(bol<? extends cja> $$0, cwe $$1) {
      super($$0, $$1);
   }

   protected cja(bol<? extends cja> $$0, double $$1, double $$2, double $$3, cwe $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   protected cja(bol<? extends cja> $$0, box $$1, cwe $$2) {
      this($$0, $$1.do(), $$1.ds() - 0.1F, $$1.du(), $$2);
      this.b((bof)$$1);
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cE().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   @Override
   public void l() {
      super.l();
      eot $$0 = ciu.a(this, this::a);
      boolean $$1 = false;
      if ($$0.c() == eot.a.b) {
         ib $$2 = ((eor)$$0).a();
         dme $$3 = this.dJ().a_($$2);
         if ($$3.a(czh.ed)) {
            this.f($$2);
            $$1 = true;
         } else if ($$3.a(czh.kF)) {
            djl $$4 = this.dJ().c_($$2);
            if ($$4 instanceof dla && dla.a(this)) {
               dla.a(this.dJ(), $$2, $$3, this, (dla)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != eot.a.a && !$$1) {
         this.a($$0);
      }

      this.aQ();
      eov $$5 = this.dm();
      double $$6 = this.do() + $$5.c;
      double $$7 = this.dq() + $$5.d;
      double $$8 = this.du() + $$5.e;
      this.J();
      float $$11;
      if (this.aZ()) {
         for (int $$9 = 0; $$9 < 4; $$9++) {
            float $$10 = 0.25F;
            this.dJ().a(kb.e, $$6 - $$5.c * 0.25, $$7 - $$5.d * 0.25, $$8 - $$5.e * 0.25, $$5.c, $$5.d, $$5.e);
         }

         $$11 = 0.8F;
      } else {
         $$11 = 0.99F;
      }

      this.g($$5.a((double)$$11));
      if (!this.aV()) {
         eov $$13 = this.dm();
         this.o($$13.c, $$13.d - (double)this.u(), $$13.e);
      }

      this.a_($$6, $$7, $$8);
   }

   protected float u() {
      return 0.03F;
   }
}
