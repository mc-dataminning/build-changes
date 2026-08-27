public class fqw extends fqx<dej> {
   private static final aex c = new aex("textures/entity/end_gateway_beam.png");

   public fqw(fqf.a $$0) {
      super($$0);
   }

   public void a(dej $$0, float $$1, elp $$2, foe $$3, int $$4, int $$5) {
      if ($$0.c() || $$0.d()) {
         float $$6 = $$0.c() ? $$0.a($$1) : $$0.b($$1);
         double $$7 = $$0.c() ? (double)$$0.k().aj() : 50.0;
         $$6 = arx.a($$6 * (float) Math.PI);
         int $$8 = arx.a((double)$$6 * $$7);
         float[] $$9 = $$0.c() ? cht.c.d() : cht.k.d();
         long $$10 = $$0.k().V();
         fqa.a($$2, $$3, c, $$1, $$6, $$10, -$$8, $$8 * 2, $$9, 0.15F, 0.175F);
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
   protected fom d() {
      return fom.w();
   }

   @Override
   public int aL_() {
      return 256;
   }
}
