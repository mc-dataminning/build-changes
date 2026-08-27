public class fub extends fud<byz, ffj<byz>> {
   private static final aer a = new aer("textures/entity/slime/magmacube.png");

   public fub(fsx.a $$0) {
      super($$0, new ffj<>($$0.a(fhr.au)), 0.25F);
   }

   protected int a(byz $$0, gu $$1) {
      return 15;
   }

   public aer a(byz $$0) {
      return a;
   }

   public void a(byz $$0, float $$1, float $$2, elf $$3, fnu $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gb();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(byz $$0, elf $$1, float $$2) {
      int $$3 = $$0.gb();
      float $$4 = arp.i($$2, $$0.bS, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
