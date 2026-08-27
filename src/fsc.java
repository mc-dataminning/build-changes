public class fsc extends ftu<byn, fei<byn>> {
   private static final aer a = new aer("textures/entity/creeper/creeper.png");

   public fsc(fso.a $$0) {
      super($$0, new fei<>($$0.a(fhm.B)), 0.5F);
      this.a(new fvz(this, $$0.f()));
   }

   protected void a(byn $$0, elg $$1, float $$2) {
      float $$3 = $$0.E($$2);
      float $$4 = 1.0F + arp.a($$3 * 100.0F) * $$3 * 0.01F;
      $$3 = arp.a($$3, 0.0F, 1.0F);
      $$3 *= $$3;
      $$3 *= $$3;
      float $$5 = (1.0F + $$3 * 0.4F) * $$4;
      float $$6 = (1.0F + $$3 * 0.1F) / $$4;
      $$1.b($$5, $$6, $$5);
   }

   protected float a(byn $$0, float $$1) {
      float $$2 = $$0.E($$1);
      return (int)($$2 * 10.0F) % 2 == 0 ? 0.0F : arp.a($$2, 0.5F, 1.0F);
   }

   public aer a(byn $$0) {
      return a;
   }
}
