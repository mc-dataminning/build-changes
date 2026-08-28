public class cps extends cpm {
   private float c;
   private float d;

   public cps(btq<?> $$0, dds $$1) {
      super($$0, $$1);
   }

   public cps(dds $$0, double $$1, double $$2, double $$3) {
      super(btq.ar, $$0, $$1, $$2, $$3);
   }

   @Override
   public brk a(cnp $$0, brj $$1) {
      if (!$$0.fR() && !this.bX() && (this.dS().B || $$0.n(this))) {
         this.d = this.c;
         if (!this.dS().B) {
            return (brk)($$0.n(this) ? brk.c : brk.e);
         } else {
            return brk.a;
         }
      } else {
         return brk.e;
      }
   }

   @Override
   protected cvg aj_() {
      return cvo.nM;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bX()) {
            this.bM();
         }

         if (this.R() == 0) {
            this.m(-this.S());
            this.d(10);
            this.b(50.0F);
            this.bA();
         }
      }
   }

   @Override
   public cpm.a x() {
      return cpm.a.a;
   }

   @Override
   public void l() {
      double $$0 = (double)this.dI();
      eye $$1 = this.dq();
      super.l();
      double $$2 = ((double)this.dI() - $$0) % 360.0;
      if (this.dS().B && $$1.f(this.dq()) > 0.01) {
         this.c += (float)$$2;
         this.c %= 360.0F;
      }
   }

   @Override
   protected void a(btj $$0, btj.a $$1) {
      super.a($$0, $$1);
      if (this.dS().B && $$0 instanceof cnp $$2 && $$2.gH() && b(this.dS())) {
         float $$3 = (float)azc.e(0.5, (double)this.d, (double)this.c);
         $$2.v($$2.dI() - ($$3 - this.d));
         this.d = $$3;
      }
   }
}
