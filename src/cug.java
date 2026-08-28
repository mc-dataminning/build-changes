public class cug extends ctz {
   private float b;
   private float c;

   public cug(bwr<?> $$0, djm $$1) {
      super($$0, $$1);
   }

   @Override
   public bug a(crm $$0, buf $$1) {
      if (!$$0.fX() && !this.bY() && (this.dU().C || $$0.n(this))) {
         this.c = this.b;
         if (!this.dU().C) {
            return (bug)($$0.n(this) ? bug.c : bug.e);
         } else {
            return bug.a;
         }
      } else {
         return bug.e;
      }
   }

   @Override
   protected czj o() {
      return czr.ov;
   }

   @Override
   public czn dH() {
      return new czn(czr.ov);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bY()) {
            this.bM();
         }

         if (this.H() == 0) {
            this.l(-this.I());
            this.d(10);
            this.b(50.0F);
            this.bA();
         }
      }
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   public void h() {
      double $$0 = (double)this.dK();
      ffc $$1 = this.ds();
      super.h();
      double $$2 = ((double)this.dK() - $$0) % 360.0;
      if (this.dU().C && $$1.f(this.ds()) > 0.01) {
         this.b += (float)$$2;
         this.b %= 360.0F;
      }
   }

   @Override
   protected void a(bwi $$0, bwi.a $$1) {
      super.a($$0, $$1);
      if (this.dU().C && $$0 instanceof crm $$2 && $$2.gP() && b(this.dU())) {
         float $$3 = (float)azm.e(0.5, (double)this.c, (double)this.b);
         $$2.w($$2.dK() - ($$3 - this.c));
         this.c = $$3;
      }
   }
}
