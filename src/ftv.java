public class ftv extends ftb<bzz, fft<bzz>> {
   private static final afw a = new afw("textures/entity/zombie/drowned.png");

   public ftv(fud.a $$0) {
      super($$0, new fft<>($$0.a(fiv.L)), new fft<>($$0.a(fiv.M)), new fft<>($$0.a(fiv.N)));
      this.a(new fxt<>(this, $$0.f()));
   }

   @Override
   public afw a(cbe $$0) {
      return a;
   }

   protected void a(bzz $$0, emh $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.a($$4);
      if ($$5 > 0.0F) {
         float $$6 = -10.0F - $$0.dD();
         float $$7 = asy.i($$5, 0.0F, $$6);
         $$1.a(a.b.rotationDegrees($$7), 0.0F, $$0.dg() / 2.0F, 0.0F);
      }
   }
}
