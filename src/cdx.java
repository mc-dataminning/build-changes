public class cdx extends cdo implements ddu {
   private boolean f = true;

   public cdx(biw<? extends cdx> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public cdx(cpx $$0, double $$1, double $$2, double $$3) {
      super(biw.X, $$1, $$2, $$3, $$0);
   }

   @Override
   public cdn.a z() {
      return cdn.a.f;
   }

   @Override
   public dfl B() {
      return csy.hc.n();
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
      if (!this.dL().B && this.bv() && this.L() && this.P()) {
         this.e();
      }
   }

   public boolean P() {
      if (ddv.a(this.dL(), this)) {
         return true;
      } else {
         for (byp $$1 : this.dL().a(byp.class, this.cG().c(0.25, 0.0, 0.25), biv.a)) {
            if (ddv.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cjc q() {
      return cjk.ne;
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      $$0.a("Enabled", this.f);
   }

   @Override
   protected void a(qy $$0) {
      super.a($$0);
      this.f = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cen a(int $$0, cbv $$1) {
      return new cfk($$0, $$1, this);
   }
}
