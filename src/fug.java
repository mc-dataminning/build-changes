public class fug extends fui<bzc, ffo<bzc>> {
   private static final aeu a = new aeu("textures/entity/slime/magmacube.png");

   public fug(ftc.a $$0) {
      super($$0, new ffo<>($$0.a(fhw.au)), 0.25F);
   }

   protected int a(bzc $$0, gw $$1) {
      return 15;
   }

   public aeu a(bzc $$0) {
      return a;
   }

   public void a(bzc $$0, float $$1, float $$2, elk $$3, fnz $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gb();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(bzc $$0, elk $$1, float $$2) {
      int $$3 = $$0.gb();
      float $$4 = ars.i($$2, $$0.bS, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
