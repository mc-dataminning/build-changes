public class fra extends fqe<bwl, fdd<bwl>> {
   private static final acq a = new acq("textures/entity/slime/slime.png");

   public fra(foy.a $$0) {
      super($$0, new fdd<>($$0.a(fed.bm)), 0.25F);
      this.a(new ftk<>(this, $$0.f()));
   }

   public void a(bwl $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
      this.d = 0.25F * (float)$$0.ga();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(bwl $$0, eij $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.ga();
      float $$5 = apa.i($$2, $$0.bS, $$0.e) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.0F / $$6 * $$4, $$6 * $$4);
   }

   public acq a(bwl $$0) {
      return a;
   }
}
