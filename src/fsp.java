public class fsp extends fuj<bvd, feo<bvd>> {
   private static final aez a = new aez("textures/entity/fish/cod.png");

   public fsp(ftd.a $$0) {
      super($$0, new feo<>($$0.a(fhw.u)), 0.3F);
   }

   public aez a(bvd $$0) {
      return a;
   }

   protected void a(bvd $$0, elj $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * asb.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aX()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
