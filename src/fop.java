public class fop extends fnv<bvq, fbb<bvq>> {
   private static final acq a = new acq("textures/entity/zombie/drowned.png");

   public fop(foy.a $$0) {
      super($$0, new fbb<>($$0.a(fed.L)), new fbb<>($$0.a(fed.M)), new fbb<>($$0.a(fed.N)));
      this.a(new fso<>(this, $$0.f()));
   }

   @Override
   public acq a(bwv $$0) {
      return a;
   }

   protected void a(bvq $$0, eij $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.a($$4);
      if ($$5 > 0.0F) {
         float $$6 = -10.0F - $$0.dA();
         float $$7 = apa.i($$5, 0.0F, $$6);
         $$1.a(a.b.rotationDegrees($$7), 0.0F, $$0.de() / 2.0F, 0.0F);
      }
   }
}
