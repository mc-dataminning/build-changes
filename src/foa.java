public class foa extends fqe<brg, fak> {
   private static final acq a = new acq("textures/entity/bat.png");

   public foa(foy.a $$0) {
      super($$0, new fak($$0.a(fed.g)), 0.25F);
   }

   public acq a(brg $$0) {
      return a;
   }

   protected void a(brg $$0, eij $$1, float $$2) {
      $$1.b(0.35F, 0.35F, 0.35F);
   }

   protected void a(brg $$0, eij $$1, float $$2, float $$3, float $$4) {
      if ($$0.r()) {
         $$1.a(0.0F, -0.1F, 0.0F);
      } else {
         $$1.a(0.0F, apa.b($$2 * 0.3F) * 0.1F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
