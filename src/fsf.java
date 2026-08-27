public class fsf extends fui<buh, fed> {
   private static final aeu a = new aeu("textures/entity/bat.png");

   public fsf(ftc.a $$0) {
      super($$0, new fed($$0.a(fhw.g)), 0.25F);
   }

   public aeu a(buh $$0) {
      return a;
   }

   protected void a(buh $$0, elk $$1, float $$2) {
      $$1.b(0.35F, 0.35F, 0.35F);
   }

   protected void a(buh $$0, elk $$1, float $$2, float $$3, float $$4) {
      if ($$0.q()) {
         $$1.a(0.0F, -0.1F, 0.0F);
      } else {
         $$1.a(0.0F, ars.b($$2 * 0.3F) * 0.1F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
