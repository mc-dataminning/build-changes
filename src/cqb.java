public class cqb extends cpv {
   private float c;
   private float d;

   public cqb(bty<?> $$0, dej $$1) {
      super($$0, $$1);
   }

   public cqb(dej $$0, double $$1, double $$2, double $$3) {
      super(bty.ar, $$0, $$1, $$2, $$3);
   }

   @Override
   public brs a(cnx $$0, brr $$1) {
      if (!$$0.fT() && !this.bX() && (this.dS().B || $$0.n(this))) {
         this.d = this.c;
         if (!this.dS().B) {
            return (brs)($$0.n(this) ? brs.c : brs.e);
         } else {
            return brs.a;
         }
      } else {
         return brs.e;
      }
   }

   @Override
   protected cvn ak_() {
      return cvw.nM;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bX()) {
            this.bM();
         }

         if (this.S() == 0) {
            this.m(-this.T());
            this.d(10);
            this.b(50.0F);
            this.bA();
         }
      }
   }

   @Override
   public cpv.a y() {
      return cpv.a.a;
   }

   @Override
   public void l() {
      double $$0 = (double)this.dI();
      eyw $$1 = this.dq();
      super.l();
      double $$2 = ((double)this.dI() - $$0) % 360.0;
      if (this.dS().B && $$1.f(this.dq()) > 0.01) {
         this.c += (float)$$2;
         this.c %= 360.0F;
      }
   }

   @Override
   protected void a(btr $$0, btr.a $$1) {
      super.a($$0, $$1);
      if (this.dS().B && $$0 instanceof cnx $$2 && $$2.gI() && b(this.dS())) {
         float $$3 = (float)azf.e(0.5, (double)this.d, (double)this.c);
         $$2.v($$2.dI() - ($$3 - this.d));
         this.d = $$3;
      }
   }
}
