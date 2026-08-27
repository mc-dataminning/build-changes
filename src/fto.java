public class fto extends fvj<bvz, ffm<bvz>> {
   private static final afw a = new afw("textures/entity/chicken.png");

   public fto(fud.a $$0) {
      super($$0, new ffm<>($$0.a(fiv.t)), 0.3F);
   }

   public afw a(bvz $$0) {
      return a;
   }

   protected float a(bvz $$0, float $$1) {
      float $$2 = asy.i($$1, $$0.bX, $$0.bT);
      float $$3 = asy.i($$1, $$0.bW, $$0.bU);
      return (asy.a($$2) + 1.0F) * $$3;
   }
}
