public class fqd extends fqe<dea> {
   private static final aer c = new aer("textures/entity/end_gateway_beam.png");

   public fqd(fpm.a $$0) {
      super($$0);
   }

   public void a(dea $$0, float $$1, elg $$2, fnl $$3, int $$4, int $$5) {
      if ($$0.c() || $$0.d()) {
         float $$6 = $$0.c() ? $$0.a($$1) : $$0.b($$1);
         double $$7 = $$0.c() ? (double)$$0.k().aj() : 50.0;
         $$6 = arp.a($$6 * (float) Math.PI);
         int $$8 = arp.a((double)$$6 * $$7);
         float[] $$9 = $$0.c() ? chm.c.d() : chm.k.d();
         long $$10 = $$0.k().V();
         fph.a($$2, $$3, c, $$1, $$6, $$10, -$$8, $$8 * 2, $$9, 0.15F, 0.175F);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected float b() {
      return 1.0F;
   }

   @Override
   protected float c() {
      return 0.0F;
   }

   @Override
   protected fnt d() {
      return fnt.w();
   }

   @Override
   public int aH_() {
      return 256;
   }
}
