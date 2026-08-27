public class cmf extends clw implements dnm {
   private boolean d = true;

   public cmf(bqg<? extends cmf> $$0, czg $$1) {
      super($$0, $$1);
   }

   public cmf(czg $$0, double $$1, double $$2, double $$3) {
      super(bqg.aa, $$1, $$2, $$3, $$0);
   }

   @Override
   public clv.a v() {
      return clv.a.f;
   }

   @Override
   public dpi x() {
      return dcj.hc.n();
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
      if ($$4 != this.G()) {
         this.p($$4);
      }
   }

   public boolean G() {
      return this.d;
   }

   public void p(boolean $$0) {
      this.d = $$0;
   }

   @Override
   public double H() {
      return this.dr();
   }

   @Override
   public double I() {
      return this.dt() + 0.5;
   }

   @Override
   public double J() {
      return this.dx();
   }

   @Override
   public boolean K() {
      return false;
   }

   @Override
   public void l() {
      super.l();
      if (!this.dM().B && this.bA() && this.G() && this.M()) {
         this.e();
      }
   }

   public boolean M() {
      if (dnn.a(this.dM(), this)) {
         return true;
      } else {
         for (cgk $$1 : this.dM().a(cgk.class, this.cH().c(0.25, 0.0, 0.25), bqf.a)) {
            if (dnn.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected crn ag_() {
      return crv.nP;
   }

   @Override
   protected void b(to $$0) {
      super.b($$0);
      $$0.a("Enabled", this.d);
   }

   @Override
   protected void a(to $$0) {
      super.a($$0);
      this.d = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cmw a(int $$0, cjz $$1) {
      return new cnv($$0, $$1, this);
   }
}
