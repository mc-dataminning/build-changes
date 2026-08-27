public class cmy extends cme {
   private int g = 200;

   public cmy(bsb<? extends cmy> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cmy(dca $$0, bso $$1, cuh $$2) {
      super(bsb.aY, $$1, $$0, $$2);
   }

   public cmy(dca $$0, double $$1, double $$2, double $$3, cuh $$4) {
      super(bsb.aY, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dU().C && !this.b) {
         this.dU().a(lb.P, this.dz(), this.dB(), this.dF(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bso $$0) {
      super.a($$0);
      brh $$1 = new brh(brj.x, this.g, 0);
      $$0.b($$1, this.I());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.g = $$0.h("Duration");
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Duration", this.g);
   }

   @Override
   protected cuh x() {
      return new cuh(cuk.xa);
   }
}
