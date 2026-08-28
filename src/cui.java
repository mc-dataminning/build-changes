public class cui extends ctx implements dyo {
   private boolean c = true;
   private boolean d = false;

   public cui(bwr<? extends cui> $$0, djh $$1) {
      super($$0, $$1);
   }

   @Override
   public eao v() {
      return dmo.hD.m();
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
   protected double a(iv $$0, ebs $$1, double $$2) {
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
      if (dyp.a(this.dU(), this)) {
         return true;
      } else {
         for (cno $$1 : this.dU().a(cno.class, this.cQ().c(0.25, 0.0, 0.25), bwp.a)) {
            if (dyp.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected czg o() {
      return czo.oz;
   }

   @Override
   public czk dH() {
      return new czk(czo.oz);
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
   public cvc a(int $$0, cri $$1) {
      return new cwd($$0, $$1, this);
   }
}
