public class cnx extends cnf {
   private int f = 200;

   public cnx(btc<? extends cnx> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cnx(dca $$0, btr $$1, cur $$2) {
      super(btc.aV, $$1, $$0, $$2);
   }

   public cnx(dca $$0, double $$1, double $$2, double $$3, cur $$4) {
      super(btc.aV, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B && !this.b) {
         this.dP().a(li.R, this.du(), this.dw(), this.dA(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(btr $$0) {
      super.a($$0);
      bse $$1 = new bse(bsg.x, this.f, 0);
      $$0.b($$1, this.I());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }

   @Override
   protected cur x() {
      return new cur(cuu.vp);
   }
}
