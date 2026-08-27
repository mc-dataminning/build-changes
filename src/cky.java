public class cky extends ckg {
   private int g = 200;

   public cky(bqg<? extends cky> $$0, czg $$1) {
      super($$0, $$1);
   }

   public cky(czg $$0, bqt $$1, crs $$2) {
      super(bqg.aU, $$1, $$0, $$2);
   }

   public cky(czg $$0, double $$1, double $$2, double $$3, crs $$4) {
      super(bqg.aU, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B && !this.b) {
         this.dM().a(kn.Q, this.dr(), this.dt(), this.dx(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bqt $$0) {
      super.a($$0);
      bpm $$1 = new bpm(bpo.x, this.g, 0);
      $$0.b($$1, this.I());
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.g = $$0.h("Duration");
      }
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("Duration", this.g);
   }

   @Override
   protected crs x() {
      return new crs(crv.vn);
   }
}
