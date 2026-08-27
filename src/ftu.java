public class ftu extends fsr<buv, fdu<buv>> {
   private static final acq a = new acq("textures/entity/wither/wither_armor.png");
   private final fdu<buv> b;

   public ftu(fqt<buv, fdu<buv>> $$0, fea $$1) {
      super($$0);
      this.b = new fdu<>($$1.a(fed.bP));
   }

   @Override
   protected float a(float $$0) {
      return apa.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected acq a() {
      return a;
   }

   @Override
   protected fbf<buv> b() {
      return this.b;
   }
}
