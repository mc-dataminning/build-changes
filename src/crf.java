public class crf extends cqu implements dty {
   private boolean c = true;
   private boolean d = false;

   public crf(bus<? extends crf> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   public dvv w() {
      return dis.hc.m();
   }

   @Override
   public int y() {
      return 1;
   }

   @Override
   public int b() {
      return 5;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = !$$3;
      if ($$4 != this.E()) {
         this.s($$4);
      }
   }

   public boolean E() {
      return this.c;
   }

   public void s(boolean $$0) {
      this.c = $$0;
   }

   @Override
   public double F() {
      return this.dA();
   }

   @Override
   public double G() {
      return this.dC() + 0.5;
   }

   @Override
   public double H() {
      return this.dG();
   }

   @Override
   public boolean I() {
      return false;
   }

   @Override
   public void h() {
      this.d = false;
      super.h();
      this.O();
   }

   @Override
   protected double a(jh $$0, dwy $$1, double $$2) {
      double $$3 = super.a($$0, $$1, $$2);
      this.O();
      return $$3;
   }

   private void O() {
      if (!this.dV().C && this.bL() && this.E() && !this.d && this.J()) {
         this.d = true;
         this.e();
      }
   }

   public boolean J() {
      if (dtz.a(this.dV(), this)) {
         return true;
      } else {
         for (clc $$1 : this.dV().a(clc.class, this.cR().c(0.25, 0.0, 0.25), buq.a)) {
            if (dtz.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cwi t() {
      return cwq.nQ;
   }

   @Override
   public cwm dI() {
      return new cwm(cwq.nQ);
   }

   @Override
   protected void b(ul $$0) {
      super.b($$0);
      $$0.a("Enabled", this.c);
   }

   @Override
   protected void a(ul $$0) {
      super.a($$0);
      this.c = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public crz a(int $$0, cot $$1) {
      return new cta($$0, $$1, this);
   }
}
