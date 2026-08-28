public class csi extends crx implements dvy {
   private boolean c = true;
   private boolean d = false;

   public csi(bvr<? extends csi> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   public dxv w() {
      return dko.hs.m();
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
   protected double a(jh $$0, dyy $$1, double $$2) {
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
      if (dvz.a(this.dW(), this)) {
         return true;
      } else {
         for (cmb $$1 : this.dW().a(cmb.class, this.cR().c(0.25, 0.0, 0.25), bvp.a)) {
            if (dvz.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cxl u() {
      return cxt.oj;
   }

   @Override
   public cxp dJ() {
      return new cxp(cxt.oj);
   }

   @Override
   protected void b(ux $$0) {
      super.b($$0);
      $$0.a("Enabled", this.c);
   }

   @Override
   protected void a(ux $$0) {
      super.a($$0);
      this.c = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public ctc a(int $$0, cpw $$1) {
      return new cud($$0, $$1, this);
   }
}
