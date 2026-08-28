public class cub extends ctq implements dyh {
   private boolean c = true;
   private boolean d = false;

   public cub(bwo<? extends cub> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   public eah v() {
      return dmh.hD.m();
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
      if ($$4 != this.B()) {
         this.r($$4);
      }
   }

   public boolean B() {
      return this.c;
   }

   public void r(boolean $$0) {
      this.c = $$0;
   }

   @Override
   public double C() {
      return this.dA();
   }

   @Override
   public double D() {
      return this.dC() + 0.5;
   }

   @Override
   public double E() {
      return this.dG();
   }

   @Override
   public boolean F() {
      return false;
   }

   @Override
   public void h() {
      this.d = false;
      super.h();
      this.K();
   }

   @Override
   protected double a(iu $$0, ebl $$1, double $$2) {
      double $$3 = super.a($$0, $$1, $$2);
      this.K();
      return $$3;
   }

   private void K() {
      if (!this.dV().C && this.bK() && this.B() && !this.d && this.G()) {
         this.d = true;
         this.e();
      }
   }

   public boolean G() {
      if (dyi.a(this.dV(), this)) {
         return true;
      } else {
         for (cnh $$1 : this.dV().a(cnh.class, this.cR().c(0.25, 0.0, 0.25), bwm.a)) {
            if (dyi.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cyz o() {
      return czh.oz;
   }

   @Override
   public czd dI() {
      return new czd(czh.oz);
   }

   @Override
   protected void b(tz $$0) {
      super.b($$0);
      $$0.a("Enabled", this.c);
   }

   @Override
   protected void a(tz $$0) {
      super.a($$0);
      this.c = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cuv a(int $$0, crb $$1) {
      return new cvw($$0, $$1, this);
   }
}
