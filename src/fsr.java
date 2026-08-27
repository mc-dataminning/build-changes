public class fsr extends fuj<bza, fes<bza>> {
   private static final aez a = new aez("textures/entity/creeper/creeper.png");

   public fsr(ftd.a $$0) {
      super($$0, new fes<>($$0.a(fhw.B)), 0.5F);
      this.a(new fwo(this, $$0.f()));
   }

   protected void a(bza $$0, elj $$1, float $$2) {
      float $$3 = $$0.E($$2);
      float $$4 = 1.0F + asb.a($$3 * 100.0F) * $$3 * 0.01F;
      $$3 = asb.a($$3, 0.0F, 1.0F);
      $$3 *= $$3;
      $$3 *= $$3;
      float $$5 = (1.0F + $$3 * 0.4F) * $$4;
      float $$6 = (1.0F + $$3 * 0.1F) / $$4;
      $$1.b($$5, $$6, $$5);
   }

   protected float a(bza $$0, float $$1) {
      float $$2 = $$0.E($$1);
      return (int)($$2 * 10.0F) % 2 == 0 ? 0.0F : asb.a($$2, 0.5F, 1.0F);
   }

   public aez a(bza $$0) {
      return a;
   }
}
