public class cpa extends cor {
   private static final akj<Boolean> e = akn.a(cpa.class, akl.k);
   private int i;
   public double c;
   public double d;
   private static final cyq j = cyq.a(cuq.ow, cuq.ox);

   public cpa(bsy<? extends cpa> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public cpa(dbw $$0, double $$1, double $$2, double $$3) {
      super(bsy.S, $$0, $$1, $$2, $$3);
   }

   @Override
   public cor.a v() {
      return cor.a.c;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dP().x_()) {
         if (this.i > 0) {
            this.i--;
         }

         if (this.i <= 0) {
            this.c = 0.0;
            this.d = 0.0;
         }

         this.b(this.i > 0);
      }

      if (this.B() && this.ah.a(4) == 0) {
         this.dP().a(li.X, this.du(), this.dw() + 0.8, this.dA(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double p() {
      return (this.be() ? 3.0 : 4.0) / 20.0;
   }

   @Override
   protected cui ah_() {
      return cuq.nO;
   }

   @Override
   protected void c(iz $$0, dsa $$1) {
      double $$2 = 1.0E-4;
      double $$3 = 0.001;
      super.c($$0, $$1);
      evp $$4 = this.ds();
      double $$5 = $$4.i();
      double $$6 = this.c * this.c + this.d * this.d;
      if ($$6 > 1.0E-4 && $$5 > 0.001) {
         double $$7 = Math.sqrt($$5);
         double $$8 = Math.sqrt($$6);
         this.c = $$4.c / $$7 * $$8;
         this.d = $$4.e / $$7 * $$8;
      }
   }

   @Override
   protected void u() {
      double $$0 = this.c * this.c + this.d * this.d;
      if ($$0 > 1.0E-7) {
         $$0 = Math.sqrt($$0);
         this.c /= $$0;
         this.d /= $$0;
         evp $$1 = this.ds().d(0.8, 0.0, 0.8).b(this.c, 0.0, this.d);
         if (this.be()) {
            $$1 = $$1.a(0.1);
         }

         this.h($$1);
      } else {
         this.h(this.ds().d(0.98, 0.0, 0.98));
      }

      super.u();
   }

   @Override
   public bqs a(cmv $$0, bqr $$1) {
      cun $$2 = $$0.b($$1);
      if (j.a($$2) && this.i + 3600 <= 32000) {
         $$2.a(1, $$0);
         this.i += 3600;
      }

      if (this.i > 0) {
         this.c = this.du() - $$0.du();
         this.d = this.dA() - $$0.dA();
      }

      return bqs.a(this.dP().B);
   }

   @Override
   protected void b(ur $$0) {
      super.b($$0);
      $$0.a("PushX", this.c);
      $$0.a("PushZ", this.d);
      $$0.a("Fuel", (short)this.i);
   }

   @Override
   protected void a(ur $$0) {
      super.a($$0);
      this.c = $$0.k("PushX");
      this.d = $$0.k("PushZ");
      this.i = $$0.g("Fuel");
   }

   protected boolean B() {
      return this.ao.a(e);
   }

   protected void b(boolean $$0) {
      this.ao.a(e, $$0);
   }

   @Override
   public dsa x() {
      return dez.cD.o().a(die.a, je.c).a(die.b, Boolean.valueOf(this.B()));
   }
}
