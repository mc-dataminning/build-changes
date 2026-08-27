public class fts extends ftu<bza, ffe<bza>> {
   private static final aer a = new aer("textures/entity/slime/magmacube.png");

   public fts(fso.a $$0) {
      super($$0, new ffe<>($$0.a(fhm.au)), 0.25F);
   }

   protected int a(bza $$0, gu $$1) {
      return 15;
   }

   public aer a(bza $$0) {
      return a;
   }

   public void a(bza $$0, float $$1, float $$2, elg $$3, fnl $$4, int $$5) {
      this.d = 0.25F * (float)$$0.ga();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(bza $$0, elg $$1, float $$2) {
      int $$3 = $$0.ga();
      float $$4 = arp.i($$2, $$0.bS, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
