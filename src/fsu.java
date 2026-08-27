public class fsu extends fsa<byr, feu<byr>> {
   private static final aeu a = new aeu("textures/entity/zombie/drowned.png");

   public fsu(ftc.a $$0) {
      super($$0, new feu<>($$0.a(fhw.L)), new feu<>($$0.a(fhw.M)), new feu<>($$0.a(fhw.N)));
      this.a(new fws<>(this, $$0.f()));
   }

   @Override
   public aeu a(bzw $$0) {
      return a;
   }

   protected void a(byr $$0, elk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.a($$4);
      if ($$5 > 0.0F) {
         float $$6 = -10.0F - $$0.dC();
         float $$7 = ars.i($$5, 0.0F, $$6);
         $$1.a(a.b.rotationDegrees($$7), 0.0F, $$0.dg() / 2.0F, 0.0F);
      }
   }
}
