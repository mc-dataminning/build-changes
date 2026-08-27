public class fsj extends fsr<bvo, faz<bvo>> {
   private static final acq a = new acq("textures/entity/creeper/creeper_armor.png");
   private final faz<bvo> b;

   public fsj(fqt<bvo, faz<bvo>> $$0, fea $$1) {
      super($$0);
      this.b = new faz<>($$1.a(fed.C));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected acq a() {
      return a;
   }

   @Override
   protected fbf<bvo> b() {
      return this.b;
   }
}
