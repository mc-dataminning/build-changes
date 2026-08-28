public class crh extends cqw implements duz {
   private boolean c = true;
   private boolean d = false;

   public crh(bur<? extends crh> $$0, dgh $$1) {
      super($$0, $$1);
   }

   @Override
   public dww w() {
      return djn.hz.m();
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
      if ($$4 != this.D()) {
         this.s($$4);
      }
   }

   public boolean D() {
      return this.c;
   }

   public void s(boolean $$0) {
      this.c = $$0;
   }

   @Override
   public double G() {
      return this.dA();
   }

   @Override
   public double H() {
      return this.dC() + 0.5;
   }

   @Override
   public double I() {
      return this.dG();
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
   protected double a(ji $$0, dxz $$1, double $$2) {
      double $$3 = super.a($$0, $$1, $$2);
      this.P();
      return $$3;
   }

   private void P() {
      if (!this.dV().C && this.bL() && this.D() && !this.d && this.K()) {
         this.d = true;
         this.e();
      }
   }

   public boolean K() {
      if (dva.a(this.dV(), this)) {
         return true;
      } else {
         for (clb $$1 : this.dV().a(clb.class, this.cR().c(0.25, 0.0, 0.25), bup.a)) {
            if (dva.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cwk u() {
      return cws.os;
   }

   @Override
   public cwo dI() {
      return new cwo(cws.os);
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
   public csb a(int $$0, cov $$1) {
      return new ctc($$0, $$1, this);
   }
}
