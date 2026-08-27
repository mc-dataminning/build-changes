public class ftg extends fvj<bvp, ffc> {
   private static final afw a = new afw("textures/entity/bat.png");

   public ftg(fud.a $$0) {
      super($$0, new ffc($$0.a(fiv.g)), 0.25F);
   }

   public afw a(bvp $$0) {
      return a;
   }

   protected void a(bvp $$0, emh $$1, float $$2) {
      $$1.b(0.35F, 0.35F, 0.35F);
   }

   protected void a(bvp $$0, emh $$1, float $$2, float $$3, float $$4) {
      if ($$0.t()) {
         $$1.a(0.0F, -0.1F, 0.0F);
      } else {
         $$1.a(0.0F, asy.b($$2 * 0.3F) * 0.1F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
