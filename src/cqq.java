public class cqq extends cqg implements dtg {
   private boolean c = true;
   private boolean d = false;

   public cqq(bug<? extends cqq> $$0, dev $$1) {
      super($$0, $$1);
   }

   public cqq(dev $$0, double $$1, double $$2, double $$3) {
      super(bug.aa, $$1, $$2, $$3, $$0);
   }

   @Override
   public cqf.a y() {
      return cqf.a.f;
   }

   @Override
   public dvd A() {
      return dia.hc.m();
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
   protected double a(jg $$0, dwh $$1, double $$2) {
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
      if (dth.a(this.dX(), this)) {
         return true;
      } else {
         for (ckq $$1 : this.dX().a(ckq.class, this.cS().c(0.25, 0.0, 0.25), bue.a)) {
            if (dth.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cvt al_() {
      return cwb.nQ;
   }

   @Override
   protected void b(uj $$0) {
      super.b($$0);
      $$0.a("Enabled", this.c);
   }

   @Override
   protected void a(uj $$0) {
      super.a($$0);
      this.c = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public crj a(int $$0, cog $$1) {
      return new csk($$0, $$1, this);
   }
}
