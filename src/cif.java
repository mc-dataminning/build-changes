public class cif extends chn {
   private static final coz f = new coz(cpc.vl);
   private int g = 200;

   public cif(bnu<? extends cif> $$0, cvn $$1) {
      super($$0, $$1, f);
   }

   public cif(cvn $$0, bog $$1, coz $$2) {
      super(bnu.aT, $$1, $$0, $$2);
   }

   public cif(cvn $$0, double $$1, double $$2, double $$3, coz $$4) {
      super(bnu.aT, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B && !this.b) {
         this.dM().a(jz.P, this.dr(), this.dt(), this.dx(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bog $$0) {
      super.a($$0);
      bnb $$1 = new bnb(bnd.x, this.g, 0);
      $$0.b($$1, this.I());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.g = $$0.h("Duration");
      }
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Duration", this.g);
   }
}
