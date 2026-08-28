public class cul extends cua implements dyt {
   private boolean c = true;
   private boolean d = false;

   public cul(bwr<? extends cul> $$0, djm $$1) {
      super($$0, $$1);
   }

   @Override
   public eat v() {
      return dmt.hD.m();
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
      return this.c;
   }

   public void q(boolean $$0) {
      this.c = $$0;
   }

   @Override
   public double B() {
      return this.dz();
   }

   @Override
   public double C() {
      return this.dB() + 0.5;
   }

   @Override
   public double D() {
      return this.dF();
   }

   @Override
   public boolean E() {
      return false;
   }

   @Override
   public void h() {
      this.d = false;
      super.h();
      this.J();
   }

   @Override
   protected double a(iv $$0, ebx $$1, double $$2) {
      double $$3 = super.a($$0, $$1, $$2);
      this.J();
      return $$3;
   }

   private void J() {
      if (!this.dU().C && this.bI() && this.A() && !this.d && this.F()) {
         this.d = true;
         this.e();
      }
   }

   public boolean F() {
      if (dyu.a(this.dU(), this)) {
         return true;
      } else {
         for (cnr $$1 : this.dU().a(cnr.class, this.cQ().c(0.25, 0.0, 0.25), bwp.a)) {
            if (dyu.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected czj o() {
      return czr.oz;
   }

   @Override
   public czn dH() {
      return new czn(czr.oz);
   }

   @Override
   protected void b(tz $$0) {
      super.b($$0);
      $$0.a("Enabled", this.c);
   }

   @Override
   protected void a(tz $$0) {
      super.a($$0);
      this.c = $$0.c("Enabled") ? $$0.o("Enabled") : true;
   }

   @Override
   public cvf a(int $$0, crl $$1) {
      return new cwg($$0, $$1, this);
   }
}
