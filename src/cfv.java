public class cfv extends cfm implements dgb {
   private boolean i = true;

   public cfv(bku<? extends cfv> $$0, csa $$1) {
      super($$0, $$1);
   }

   public cfv(csa $$0, double $$1, double $$2, double $$3) {
      super(bku.X, $$1, $$2, $$3, $$0);
   }

   @Override
   public cfl.a w() {
      return cfl.a.f;
   }

   @Override
   public dhi y() {
      return cvc.hc.o();
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
      return this.ds();
   }

   @Override
   public double J() {
      return this.du() + 0.5;
   }

   @Override
   public double K() {
      return this.dy();
   }

   @Override
   public void l() {
      super.l();
      if (!this.dN().B && this.bx() && this.H() && this.M()) {
         this.e();
      }
   }

   public boolean M() {
      if (dgc.a(this.dN(), this)) {
         return true;
      } else {
         for (can $$1 : this.dN().a(can.class, this.cH().c(0.25, 0.0, 0.25), bkt.a)) {
            if (dgc.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cle ag_() {
      return clm.nP;
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      $$0.a("Enabled", this.i);
   }

   @Override
   protected void a(rz $$0) {
      super.a($$0);
      this.i = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cgm a(int $$0, cdt $$1) {
      return new chl($$0, $$1, this);
   }
}
