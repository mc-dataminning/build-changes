public class cvh extends cuw implements dzq {
   private static final boolean c = true;
   private boolean d = true;
   private boolean h = false;

   public cvh(bxn<? extends cvh> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   public ebq v() {
      return dnq.hD.m();
   }

   @Override
   public int x() {
      return 1;
   }

   @Override
   public int b() {
      return 5;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = !$$3;
      if ($$4 != this.A()) {
         this.q($$4);
      }
   }

   public boolean A() {
      return this.d;
   }

   public void q(boolean $$0) {
      this.d = $$0;
   }

   @Override
   public double B() {
      return this.dA();
   }

   @Override
   public double C() {
      return this.dC() + 0.5;
   }

   @Override
   public double D() {
      return this.dG();
   }

   @Override
   public boolean E() {
      return false;
   }

   @Override
   public void h() {
      this.h = false;
      super.h();
      this.J();
   }

   @Override
   protected double a(iw $$0, ecu $$1, double $$2) {
      double $$3 = super.a($$0, $$1, $$2);
      this.J();
      return $$3;
   }

   private void J() {
      if (!this.dV().C && this.bJ() && this.A() && !this.h && this.F()) {
         this.h = true;
         this.e();
      }
   }

   public boolean F() {
      if (dzr.a(this.dV(), this)) {
         return true;
      } else {
         for (coo $$1 : this.dV().a(coo.class, this.cR().c(0.25, 0.0, 0.25), bxl.a)) {
            if (dzr.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dag o() {
      return dao.oz;
   }

   @Override
   public dak dI() {
      return new dak(dao.oz);
   }

   @Override
   protected void b(ua $$0) {
      super.b($$0);
      $$0.a("Enabled", this.d);
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      this.d = $$0.b("Enabled", true);
   }

   @Override
   public cwb a(int $$0, csh $$1) {
      return new cxc($$0, $$1, this);
   }
}
