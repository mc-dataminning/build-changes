public class crg extends cqv implements duy {
   private boolean c = true;
   private boolean d = false;

   public crg(buq<? extends crg> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   public dwv w() {
      return djm.hz.m();
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
   protected double a(ji $$0, dxy $$1, double $$2) {
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
      if (duz.a(this.dW(), this)) {
         return true;
      } else {
         for (cla $$1 : this.dW().a(cla.class, this.cR().c(0.25, 0.0, 0.25), buo.a)) {
            if (duz.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cwj u() {
      return cwr.os;
   }

   @Override
   public cwn dJ() {
      return new cwn(cwr.os);
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
   public csa a(int $$0, cou $$1) {
      return new ctb($$0, $$1, this);
   }
}
