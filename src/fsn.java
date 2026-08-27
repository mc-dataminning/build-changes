public class fsn extends fui<bur, fen<bur>> {
   private static final aeu a = new aeu("textures/entity/chicken.png");

   public fsn(ftc.a $$0) {
      super($$0, new fen<>($$0.a(fhw.t)), 0.3F);
   }

   public aeu a(bur $$0) {
      return a;
   }

   protected float a(bur $$0, float $$1) {
      float $$2 = ars.i($$1, $$0.bX, $$0.bT);
      float $$3 = ars.i($$1, $$0.bW, $$0.bU);
      return (ars.a($$2) + 1.0F) * $$3;
   }
}
