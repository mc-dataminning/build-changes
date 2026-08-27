public class cap extends cag implements dak {
   private boolean f = true;

   public cap(bfn<? extends cap> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public cap(cmm $$0, double $$1, double $$2, double $$3) {
      super(bfn.X, $$1, $$2, $$3, $$0);
   }

   @Override
   public caf.a t() {
      return caf.a.f;
   }

   @Override
   public dcb w() {
      return cpo.hc.n();
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
      return this.dn();
   }

   @Override
   public double I() {
      return this.dp() + 0.5;
   }

   @Override
   public double J() {
      return this.dt();
   }

   @Override
   public void l() {
      super.l();
      if (!this.dI().B && this.bs() && this.F() && this.K()) {
         this.e();
      }
   }

   public boolean K() {
      if (dal.a(this.dI(), this)) {
         return true;
      } else {
         for (bvh $$1 : this.dI().a(bvh.class, this.cE().c(0.25, 0.0, 0.25), bfm.a)) {
            if (dal.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cfu j() {
      return cgc.ne;
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
   public cbf a(int $$0, byn $$1) {
      return new ccc($$0, $$1, this);
   }
}
