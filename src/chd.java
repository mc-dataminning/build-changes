public class chd extends cgu implements dhm {
   private boolean i = true;

   public chd(blt<? extends chd> $$0, cti $$1) {
      super($$0, $$1);
   }

   public chd(cti $$0, double $$1, double $$2, double $$3) {
      super(blt.Y, $$1, $$2, $$3, $$0);
   }

   @Override
   public cgt.a w() {
      return cgt.a.f;
   }

   @Override
   public dja y() {
      return cwl.hc.o();
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
      if (dhn.a(this.dM(), this)) {
         return true;
      } else {
         for (cbo $$1 : this.dM().a(cbo.class, this.cH().c(0.25, 0.0, 0.25), bls.a)) {
            if (dhn.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cmm ah_() {
      return cmu.nP;
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      $$0.a("Enabled", this.i);
   }

   @Override
   protected void a(sl $$0) {
      super.a($$0);
      this.i = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public chu a(int $$0, cfa $$1) {
      return new cit($$0, $$1, this);
   }
}
