public class ctd extends csz {
   public ctd(bxc<? extends ctd> $$0, djx $$1) {
      super($$0, $$1);
   }

   public ctd(djx $$0, bxu $$1, czy $$2) {
      super(bxc.V, $$1, $$0, $$2);
   }

   public ctd(djx $$0, double $$1, double $$2, double $$3, czy $$4) {
      super(bxc.V, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected czu g() {
      return dac.vf;
   }

   @Override
   protected double bc() {
      return 0.07;
   }

   @Override
   protected void a(ffo $$0) {
      super.a($$0);
      if (this.dV() instanceof ars) {
         this.dV().c(2002, this.dv(), -13083194);
         int $$1 = 3 + this.dV().A.a(5) + this.dV().A.a(5);
         bxh.a((ars)this.dV(), $$0.g(), $$1);
         this.aq();
      }
   }
}
