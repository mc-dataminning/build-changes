public class csd extends crs implements dvq {
   private boolean c = true;
   private boolean d = false;

   public csd(bvm<? extends csd> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   public dxn w() {
      return dkg.hs.m();
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
      return this.dA();
   }

   @Override
   public double H() {
      return this.dC() + 0.5;
   }

   @Override
   public double I() {
      return this.dG();
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
   protected double a(jh $$0, dyq $$1, double $$2) {
      double $$3 = super.a($$0, $$1, $$2);
      this.P();
      return $$3;
   }

   private void P() {
      if (!this.dV().C && this.bL() && this.F() && !this.d && this.K()) {
         this.d = true;
         this.e();
      }
   }

   public boolean K() {
      if (dvr.a(this.dV(), this)) {
         return true;
      } else {
         for (clw $$1 : this.dV().a(clw.class, this.cR().c(0.25, 0.0, 0.25), bvk.a)) {
            if (dvr.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cxg u() {
      return cxo.oj;
   }

   @Override
   public cxk dI() {
      return new cxk(cxo.oj);
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
   public csx a(int $$0, cpr $$1) {
      return new cty($$0, $$1, this);
   }
}
