public class frm extends ftp<bud, fdp> {
   private static final aep a = new aep("textures/entity/bat.png");

   public frm(fsj.a $$0) {
      super($$0, new fdp($$0.a(fhi.g)), 0.25F);
   }

   public aep a(bud $$0) {
      return a;
   }

   protected void a(bud $$0, elh $$1, float $$2) {
      $$1.b(0.35F, 0.35F, 0.35F);
   }

   protected void a(bud $$0, elh $$1, float $$2, float $$3, float $$4) {
      if ($$0.q()) {
         $$1.a(0.0F, -0.1F, 0.0F);
      } else {
         $$1.a(0.0F, aro.b($$2 * 0.3F) * 0.1F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
