public class frv extends ftp<buo, fea<buo>> {
   private static final aep a = new aep("textures/entity/fish/cod.png");

   public frv(fsj.a $$0) {
      super($$0, new fea<>($$0.a(fhi.u)), 0.3F);
   }

   public aep a(buo $$0) {
      return a;
   }

   protected void a(buo $$0, elh $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * aro.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aX()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
