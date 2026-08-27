public class frv extends fqe<bxs, fdr<bxs>> {
   private static final acq a = new acq("textures/entity/warden/warden.png");
   private static final acq i = new acq("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final acq j = new acq("textures/entity/warden/warden_heart.png");
   private static final acq k = new acq("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final acq l = new acq("textures/entity/warden/warden_pulsating_spots_2.png");

   public frv(foy.a $$0) {
      super($$0, new fdr<>($$0.a(fed.bL)), 0.9F);
      this.a(new fts<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fdr::e));
      this.a(new fts<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, apa.b($$2 * 0.045F) * 0.25F), fdr::f));
      this.a(new fts<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, apa.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fdr::f));
      this.a(new fts<>(this, a, ($$0x, $$1, $$2) -> $$0x.D($$1), fdr::c));
      this.a(new fts<>(this, j, ($$0x, $$1, $$2) -> $$0x.E($$1), fdr::d));
   }

   public acq a(bxs $$0) {
      return a;
   }
}
