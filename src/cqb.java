public class cqb extends cpx {
   public cqb(bus<? extends cqb> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public cqb(dgi $$0, bvh $$1, cwp $$2) {
      super(bus.U, $$1, $$0, $$2);
   }

   public cqb(dgi $$0, double $$1, double $$2, double $$3, cwp $$4) {
      super(bus.U, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cwl m() {
      return cwt.uU;
   }

   @Override
   protected double bd() {
      return 0.07;
   }

   @Override
   protected void a(fay $$0) {
      super.a($$0);
      if (this.dV() instanceof ard) {
         this.dV().c(2002, this.dv(), -13083194);
         int $$1 = 3 + this.dV().A.a(5) + this.dV().A.a(5);
         bux.a((ard)this.dV(), this.dt(), $$1);
         this.at();
      }
   }
}
