public class cpy extends cps {
   private float c;
   private float d;

   public cpy(btv<?> $$0, deg $$1) {
      super($$0, $$1);
   }

   public cpy(deg $$0, double $$1, double $$2, double $$3) {
      super(btv.ar, $$0, $$1, $$2, $$3);
   }

   @Override
   public brp a(cnu $$0, bro $$1) {
      if (!$$0.fS() && !this.bX() && (this.dS().B || $$0.n(this))) {
         this.d = this.c;
         if (!this.dS().B) {
            return (brp)($$0.n(this) ? brp.c : brp.e);
         } else {
            return brp.a;
         }
      } else {
         return brp.e;
      }
   }

   @Override
   protected cvk aj_() {
      return cvt.nM;
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
   public cps.a y() {
      return cps.a.a;
   }

   @Override
   public void l() {
      double $$0 = (double)this.dI();
      eys $$1 = this.dq();
      super.l();
      double $$2 = ((double)this.dI() - $$0) % 360.0;
      if (this.dS().B && $$1.f(this.dq()) > 0.01) {
         this.c += (float)$$2;
         this.c %= 360.0F;
      }
   }

   @Override
   protected void a(bto $$0, bto.a $$1) {
      super.a($$0, $$1);
      if (this.dS().B && $$0 instanceof cnu $$2 && $$2.gH() && b(this.dS())) {
         float $$3 = (float)azd.e(0.5, (double)this.d, (double)this.c);
         $$2.v($$2.dI() - ($$3 - this.d));
         this.d = $$3;
      }
   }
}
