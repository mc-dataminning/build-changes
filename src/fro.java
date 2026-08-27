public class fro extends fqe<bsl, fax<bsl>> {
   private final fax<bsl> a = this.a();
   private final fax<bsl> i;
   private static final acq j = new acq("textures/entity/fish/tropical_a.png");
   private static final acq k = new acq("textures/entity/fish/tropical_b.png");

   public fro(foy.a $$0) {
      super($$0, new fdl<>($$0.a(fed.bF)), 0.15F);
      this.i = new fdm<>($$0.a(fed.bD));
      this.a(new ftq(this, $$0.f()));
   }

   public acq a(bsl $$0) {
      return switch ($$0.gj().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(bsl $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
      fax<bsl> $$6 = switch ($$0.gj().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gh().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(bsl $$0, eij $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * apa.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aV()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
