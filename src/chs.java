public class chs extends chj implements dib {
   private boolean i = true;

   public chs(bmc<? extends chs> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public chs(ctx $$0, double $$1, double $$2, double $$3) {
      super(bmc.Z, $$1, $$2, $$3, $$0);
   }

   @Override
   public chi.a w() {
      return chi.a.f;
   }

   @Override
   public djp y() {
      return cxa.hc.o();
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
      return this.dq();
   }

   @Override
   public double J() {
      return this.ds() + 0.5;
   }

   @Override
   public double K() {
      return this.dw();
   }

   @Override
   public void l() {
      super.l();
      if (!this.dL().B && this.bx() && this.H() && this.M()) {
         this.e();
      }
   }

   public boolean M() {
      if (dic.a(this.dL(), this)) {
         return true;
      } else {
         for (ccb $$1 : this.dL().a(ccb.class, this.cH().c(0.25, 0.0, 0.25), bmb.a)) {
            if (dic.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cnb ai_() {
      return cnj.nP;
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      $$0.a("Enabled", this.i);
   }

   @Override
   protected void a(so $$0) {
      super.a($$0);
      this.i = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cij a(int $$0, cfp $$1) {
      return new cji($$0, $$1, this);
   }
}
