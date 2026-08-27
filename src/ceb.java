public class ceb extends cds implements ddw {
   private boolean f = true;

   public ceb(bja<? extends ceb> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public ceb(cqb $$0, double $$1, double $$2, double $$3) {
      super(bja.X, $$1, $$2, $$3, $$0);
   }

   @Override
   public cdr.a z() {
      return cdr.a.f;
   }

   @Override
   public dfd B() {
      return cte.hc.o();
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
      if (ddx.a(this.dL(), this)) {
         return true;
      } else {
         for (byt $$1 : this.dL().a(byt.class, this.cG().c(0.25, 0.0, 0.25), biz.a)) {
            if (ddx.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cjg q() {
      return cjo.ne;
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      $$0.a("Enabled", this.f);
   }

   @Override
   protected void a(qw $$0) {
      super.a($$0);
      this.f = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cer a(int $$0, cbz $$1) {
      return new cfo($$0, $$1, this);
   }
}
