public class cga extends cfr implements dgg {
   private boolean i = true;

   public cga(bkz<? extends cga> $$0, csf $$1) {
      super($$0, $$1);
   }

   public cga(csf $$0, double $$1, double $$2, double $$3) {
      super(bkz.X, $$1, $$2, $$3, $$0);
   }

   @Override
   public cfq.a w() {
      return cfq.a.f;
   }

   @Override
   public dhn y() {
      return cvh.hc.o();
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
      if (dgh.a(this.dN(), this)) {
         return true;
      } else {
         for (cas $$1 : this.dN().a(cas.class, this.cH().c(0.25, 0.0, 0.25), bky.a)) {
            if (dgh.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected clj ah_() {
      return clr.nP;
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      $$0.a("Enabled", this.i);
   }

   @Override
   protected void a(sd $$0) {
      super.a($$0);
      this.i = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cgr a(int $$0, cdy $$1) {
      return new chq($$0, $$1, this);
   }
}
