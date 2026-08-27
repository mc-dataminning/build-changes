public class fso extends fui<bus, feo<bus>> {
   private static final aeu a = new aeu("textures/entity/fish/cod.png");

   public fso(ftc.a $$0) {
      super($$0, new feo<>($$0.a(fhw.u)), 0.3F);
   }

   public aeu a(bus $$0) {
      return a;
   }

   protected void a(bus $$0, elk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * ars.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aX()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
