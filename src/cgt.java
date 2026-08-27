public class cgt extends cgk implements dhb {
   private boolean i = true;

   public cgt(blj<? extends cgt> $$0, csy $$1) {
      super($$0, $$1);
   }

   public cgt(csy $$0, double $$1, double $$2, double $$3) {
      super(blj.Y, $$1, $$2, $$3, $$0);
   }

   @Override
   public cgj.a w() {
      return cgj.a.f;
   }

   @Override
   public dip y() {
      return cwb.hc.o();
   }

   @Override
   public int A() {
      return 1;
   }

   @Override
   public int b() {
      return 5;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = !$$3;
      if ($$4 != this.H()) {
         this.p($$4);
      }
   }

   public boolean H() {
      return this.i;
   }

   public void p(boolean $$0) {
      this.i = $$0;
   }

   @Override
   public double I() {
      return this.dr();
   }

   @Override
   public double J() {
      return this.dt() + 0.5;
   }

   @Override
   public double K() {
      return this.dx();
   }

   @Override
   public void l() {
      super.l();
      if (!this.dM().B && this.bx() && this.H() && this.M()) {
         this.e();
      }
   }

   public boolean M() {
      if (dhc.a(this.dM(), this)) {
         return true;
      } else {
         for (cbe $$1 : this.dM().a(cbe.class, this.cH().c(0.25, 0.0, 0.25), bli.a)) {
            if (dhc.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cmc ah_() {
      return cmk.nP;
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      $$0.a("Enabled", this.i);
   }

   @Override
   protected void a(sj $$0) {
      super.a($$0);
      this.i = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public chk a(int $$0, ceq $$1) {
      return new cij($$0, $$1, this);
   }
}
