public class cdv extends cdm implements dds {
   private boolean f = true;

   public cdv(biu<? extends cdv> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public cdv(cpv $$0, double $$1, double $$2, double $$3) {
      super(biu.X, $$1, $$2, $$3, $$0);
   }

   @Override
   public cdl.a z() {
      return cdl.a.f;
   }

   @Override
   public dfj B() {
      return csw.hc.n();
   }

   @Override
   public int E() {
      return 1;
   }

   @Override
   public int b() {
      return 5;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = !$$3;
      if ($$4 != this.L()) {
         this.p($$4);
      }
   }

   public boolean L() {
      return this.f;
   }

   public void p(boolean $$0) {
      this.f = $$0;
   }

   @Override
   public double M() {
      return this.dq();
   }

   @Override
   public double N() {
      return this.ds() + 0.5;
   }

   @Override
   public double O() {
      return this.dw();
   }

   @Override
   public void l() {
      super.l();
      if (!this.dL().B && this.bw() && this.L() && this.P()) {
         this.e();
      }
   }

   public boolean P() {
      if (ddt.a(this.dL(), this)) {
         return true;
      } else {
         for (byn $$1 : this.dL().a(byn.class, this.cH().c(0.25, 0.0, 0.25), bit.a)) {
            if (ddt.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cja q() {
      return cji.ne;
   }

   @Override
   protected void b(qx $$0) {
      super.b($$0);
      $$0.a("Enabled", this.f);
   }

   @Override
   protected void a(qx $$0) {
      super.a($$0);
      this.f = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cel a(int $$0, cbt $$1) {
      return new cfi($$0, $$1, this);
   }
}
