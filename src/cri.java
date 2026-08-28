public class cri extends cqx implements dva {
   private boolean c = true;
   private boolean d = false;

   public cri(bur<? extends cri> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   public dwx w() {
      return djo.hz.m();
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
   protected double a(ji $$0, dya $$1, double $$2) {
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
      if (dvb.a(this.dW(), this)) {
         return true;
      } else {
         for (clb $$1 : this.dW().a(clb.class, this.cR().c(0.25, 0.0, 0.25), bup.a)) {
            if (dvb.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cwl u() {
      return cwt.os;
   }

   @Override
   public cwp dJ() {
      return new cwp(cwt.os);
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
   public csc a(int $$0, cow $$1) {
      return new ctd($$0, $$1, this);
   }
}
