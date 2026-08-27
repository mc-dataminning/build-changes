public class cdo extends cdf implements ddj {
   private boolean f = true;

   public cdo(bim<? extends cdo> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public cdo(cpm $$0, double $$1, double $$2, double $$3) {
      super(bim.X, $$1, $$2, $$3, $$0);
   }

   @Override
   public cde.a t() {
      return cde.a.f;
   }

   @Override
   public dfa w() {
      return csn.hc.n();
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
      if ($$4 != this.F()) {
         this.p($$4);
      }
   }

   public boolean F() {
      return this.f;
   }

   public void p(boolean $$0) {
      this.f = $$0;
   }

   @Override
   public double G() {
      return this.dp();
   }

   @Override
   public double H() {
      return this.dr() + 0.5;
   }

   @Override
   public double J() {
      return this.dv();
   }

   @Override
   public void l() {
      super.l();
      if (!this.dK().B && this.bv() && this.F() && this.K()) {
         this.e();
      }
   }

   public boolean K() {
      if (ddk.a(this.dK(), this)) {
         return true;
      } else {
         for (byg $$1 : this.dK().a(byg.class, this.cG().c(0.25, 0.0, 0.25), bil.a)) {
            if (ddk.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cit j() {
      return cjb.ne;
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      $$0.a("Enabled", this.f);
   }

   @Override
   protected void a(qr $$0) {
      super.a($$0);
      this.f = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cee a(int $$0, cbm $$1) {
      return new cfb($$0, $$1, this);
   }
}
