public class fsv extends fsb<bzc, feu<bzc>> {
   private static final aez a = new aez("textures/entity/zombie/drowned.png");

   public fsv(ftd.a $$0) {
      super($$0, new feu<>($$0.a(fhw.L)), new feu<>($$0.a(fhw.M)), new feu<>($$0.a(fhw.N)));
      this.a(new fwt<>(this, $$0.f()));
   }

   @Override
   public aez a(cah $$0) {
      return a;
   }

   protected void a(bzc $$0, elj $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.a($$4);
      if ($$5 > 0.0F) {
         float $$6 = -10.0F - $$0.dD();
         float $$7 = asb.i($$5, 0.0F, $$6);
         $$1.a(a.b.rotationDegrees($$7), 0.0F, $$0.dg() / 2.0F, 0.0F);
      }
   }
}
