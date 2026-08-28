public class csh extends crw implements dvx {
   private boolean c = true;
   private boolean d = false;

   public csh(bvq<? extends csh> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   public dxu w() {
      return dkn.hs.m();
   }

   @Override
   public int z() {
      return 1;
   }

   @Override
   public int b() {
      return 5;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = !$$3;
      if ($$4 != this.F()) {
         this.s($$4);
      }
   }

   public boolean F() {
      return this.c;
   }

   public void s(boolean $$0) {
      this.c = $$0;
   }

   @Override
   public double G() {
      return this.dB();
   }

   @Override
   public double H() {
      return this.dD() + 0.5;
   }

   @Override
   public double I() {
      return this.dH();
   }

   @Override
   public boolean J() {
      return false;
   }

   @Override
   public void h() {
      this.d = false;
      super.h();
      this.P();
   }

   @Override
   protected double a(jh $$0, dyx $$1, double $$2) {
      double $$3 = super.a($$0, $$1, $$2);
      this.P();
      return $$3;
   }

   private void P() {
      if (!this.dW().C && this.bL() && this.F() && !this.d && this.K()) {
         this.d = true;
         this.e();
      }
   }

   public boolean K() {
      if (dvy.a(this.dW(), this)) {
         return true;
      } else {
         for (cma $$1 : this.dW().a(cma.class, this.cR().c(0.25, 0.0, 0.25), bvo.a)) {
            if (dvy.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cxk u() {
      return cxs.oj;
   }

   @Override
   public cxo dJ() {
      return new cxo(cxs.oj);
   }

   @Override
   protected void b(ux $$0) {
      super.b($$0);
      $$0.a("Enabled", this.c);
   }

   @Override
   protected void a(ux $$0) {
      super.a($$0);
      this.c = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public ctb a(int $$0, cpv $$1) {
      return new cuc($$0, $$1, this);
   }
}
