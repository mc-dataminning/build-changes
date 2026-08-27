public class cfn extends cfe implements dfp {
   private boolean i = true;

   public cfn(bkm<? extends cfn> $$0, crs $$1) {
      super($$0, $$1);
   }

   public cfn(crs $$0, double $$1, double $$2, double $$3) {
      super(bkm.X, $$1, $$2, $$3, $$0);
   }

   @Override
   public cfd.a v() {
      return cfd.a.f;
   }

   @Override
   public dgw x() {
      return cuv.hc.o();
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
      return this.i;
   }

   public void p(boolean $$0) {
      this.i = $$0;
   }

   @Override
   public double H() {
      return this.dq();
   }

   @Override
   public double I() {
      return this.ds() + 0.5;
   }

   @Override
   public double K() {
      return this.dw();
   }

   @Override
   public void l() {
      super.l();
      if (!this.dL().B && this.bv() && this.G() && this.L()) {
         this.e();
      }
   }

   public boolean L() {
      if (dfq.a(this.dL(), this)) {
         return true;
      } else {
         for (caf $$1 : this.dL().a(caf.class, this.cG().c(0.25, 0.0, 0.25), bkl.a)) {
            if (dfq.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected ckw ag_() {
      return cle.ne;
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
   public cge a(int $$0, cdl $$1) {
      return new chd($$0, $$1, this);
   }
}
