public class cqv extends cql implements dtm {
   private boolean c = true;
   private boolean d = false;

   public cqv(bul<? extends cqv> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public cqv(dfb $$0, double $$1, double $$2, double $$3) {
      super(bul.aa, $$1, $$2, $$3, $$0);
   }

   @Override
   public cqk.a y() {
      return cqk.a.f;
   }

   @Override
   public dvj A() {
      return dig.hc.m();
   }

   @Override
   public int C() {
      return 1;
   }

   @Override
   public int b() {
      return 5;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = !$$3;
      if ($$4 != this.J()) {
         this.s($$4);
      }
   }

   public boolean J() {
      return this.c;
   }

   public void s(boolean $$0) {
      this.c = $$0;
   }

   @Override
   public double K() {
      return this.dC();
   }

   @Override
   public double L() {
      return this.dE() + 0.5;
   }

   @Override
   public double M() {
      return this.dI();
   }

   @Override
   public boolean O() {
      return false;
   }

   @Override
   public void l() {
      this.d = false;
      super.l();
      this.T();
   }

   @Override
   protected double a(jh $$0, dwn $$1, double $$2) {
      double $$3 = super.a($$0, $$1, $$2);
      this.T();
      return $$3;
   }

   private void T() {
      if (!this.dX().C && this.bM() && this.J() && !this.d && this.P()) {
         this.d = true;
         this.e();
      }
   }

   public boolean P() {
      if (dtn.a(this.dX(), this)) {
         return true;
      } else {
         for (ckv $$1 : this.dX().a(ckv.class, this.cS().c(0.25, 0.0, 0.25), buj.a)) {
            if (dtn.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cvx al_() {
      return cwf.nQ;
   }

   @Override
   protected void b(uk $$0) {
      super.b($$0);
      $$0.a("Enabled", this.c);
   }

   @Override
   protected void a(uk $$0) {
      super.a($$0);
      this.c = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cro a(int $$0, col $$1) {
      return new csp($$0, $$1, this);
   }
}
