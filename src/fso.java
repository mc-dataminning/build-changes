public class fso extends fuj<bvc, fen<bvc>> {
   private static final aez a = new aez("textures/entity/chicken.png");

   public fso(ftd.a $$0) {
      super($$0, new fen<>($$0.a(fhw.t)), 0.3F);
   }

   public aez a(bvc $$0) {
      return a;
   }

   protected float a(bvc $$0, float $$1) {
      float $$2 = asb.i($$1, $$0.bX, $$0.bT);
      float $$3 = asb.i($$1, $$0.bW, $$0.bU);
      return (asb.a($$2) + 1.0F) * $$3;
   }
}
