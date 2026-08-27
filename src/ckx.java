public class ckx extends cko implements dle {
   private boolean e = true;

   public ckx(bpc<? extends ckx> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public ckx(cwz $$0, double $$1, double $$2, double $$3) {
      super(bpc.aa, $$1, $$2, $$3, $$0);
   }

   @Override
   public ckn.a v() {
      return ckn.a.f;
   }

   @Override
   public dmz x() {
      return dac.hc.o();
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
      return this.e;
   }

   public void p(boolean $$0) {
      this.e = $$0;
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
   public void l() {
      super.l();
      if (!this.dM().B && this.bA() && this.G() && this.K()) {
         this.e();
      }
   }

   public boolean K() {
      if (dlf.a(this.dM(), this)) {
         return true;
      } else {
         for (cfd $$1 : this.dM().a(cfd.class, this.cH().c(0.25, 0.0, 0.25), bpb.a)) {
            if (dlf.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cqf ah_() {
      return cqn.nP;
   }

   @Override
   protected void b(ta $$0) {
      super.b($$0);
      $$0.a("Enabled", this.e);
   }

   @Override
   protected void a(ta $$0) {
      super.a($$0);
      this.e = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public clo a(int $$0, cir $$1) {
      return new cmn($$0, $$1, this);
   }
}
