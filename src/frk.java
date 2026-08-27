public class frk extends fox<bzs> {
   public static final acq a = new acq("textures/entity/trident.png");
   private final fdk f;

   public frk(foy.a $$0) {
      super($$0);
      this.f = new fdk($$0.a(fed.bC));
   }

   public void a(bzs $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(apa.i($$2, $$0.M, $$0.dy()) - 90.0F));
      $$3.a(a.f.rotationDegrees(apa.i($$2, $$0.N, $$0.dA()) + 90.0F));
      ein $$6 = fpw.c($$4, this.f.a(this.a($$0)), false, $$0.z());
      this.f.a($$3, $$6, $$5, fum.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public acq a(bzs $$0) {
      return a;
   }
}
