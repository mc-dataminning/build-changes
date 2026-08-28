public class csc extends crr implements dvt {
   private boolean c = true;
   private boolean d = false;

   public csc(bvi<? extends csc> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   public dxq v() {
      return dkg.hz.m();
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
      return this.dz();
   }

   @Override
   public double D() {
      return this.dB() + 0.5;
   }

   @Override
   public double E() {
      return this.dF();
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
   protected double a(ji $$0, dyu $$1, double $$2) {
      double $$3 = super.a($$0, $$1, $$2);
      this.K();
      return $$3;
   }

   private void K() {
      if (!this.dU().C && this.bJ() && this.B() && !this.d && this.G()) {
         this.d = true;
         this.e();
      }
   }

   public boolean G() {
      if (dvu.a(this.dU(), this)) {
         return true;
      } else {
         for (clw $$1 : this.dU().a(clw.class, this.cQ().c(0.25, 0.0, 0.25), bvg.a)) {
            if (dvu.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cxd o() {
      return cxl.ou;
   }

   @Override
   public cxh dH() {
      return new cxh(cxl.ou);
   }

   @Override
   protected void b(tq $$0) {
      super.b($$0);
      $$0.a("Enabled", this.c);
   }

   @Override
   protected void a(tq $$0) {
      super.a($$0);
      this.c = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public csw a(int $$0, cpq $$1) {
      return new ctx($$0, $$1, this);
   }
}
