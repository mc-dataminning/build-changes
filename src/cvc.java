public class cvc extends cuv {
   private float b;
   private float c;

   public cvc(bxn<?> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   public bvc a(csi $$0, bvb $$1) {
      if (!$$0.fY() && !this.bZ() && (this.dV().C || $$0.n(this))) {
         this.c = this.b;
         if (!this.dV().C) {
            return (bvc)($$0.n(this) ? bvc.c : bvc.e);
         } else {
            return bvc.a;
         }
      } else {
         return bvc.e;
      }
   }

   @Override
   protected dag p() {
      return dao.ov;
   }

   @Override
   public dak dI() {
      return new dak(dao.ov);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bZ()) {
            this.bN();
         }

         if (this.H() == 0) {
            this.l(-this.I());
            this.d(10);
            this.b(50.0F);
            this.bB();
         }
      }
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   public void g() {
      double $$0 = (double)this.dL();
      fgc $$1 = this.dt();
      super.g();
      double $$2 = ((double)this.dL() - $$0) % 360.0;
      if (this.dV().C && $$1.f(this.dt()) > 0.01) {
         this.b += (float)$$2;
         this.b %= 360.0F;
      }
   }

   @Override
   protected void a(bxe $$0, bxe.a $$1) {
      super.a($$0, $$1);
      if (this.dV().C && $$0 instanceof csi $$2 && $$2.gR() && b(this.dV())) {
         float $$3 = (float)azz.e(0.5, (double)this.c, (double)this.b);
         $$2.w($$2.dL() - ($$3 - this.c));
         this.c = $$3;
      }
   }
}
