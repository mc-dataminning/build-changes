public class cfy extends cfh {
   private static final cmr f = new cmr(cmu.vi);
   private int g = 200;

   public cfy(blt<? extends cfy> $$0, cti $$1) {
      super($$0, $$1, f);
   }

   public cfy(cti $$0, bmf $$1, cmr $$2) {
      super(blt.aS, $$1, $$0, $$2);
   }

   public cfy(cti $$0, double $$1, double $$2, double $$3, cmr $$4) {
      super(blt.aS, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B && !this.b) {
         this.dM().a(jx.P, this.dr(), this.dt(), this.dx(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bmf $$0) {
      super.a($$0);
      blc $$1 = new blc(ble.x, this.g, 0);
      $$0.b($$1, this.J());
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.g = $$0.h("Duration");
      }
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("Duration", this.g);
   }
}
