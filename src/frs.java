public class frs extends frt<dfl> {
   private static final afw c = new afw("textures/entity/end_gateway_beam.png");

   public frs(frb.a $$0) {
      super($$0);
   }

   public void a(dfl $$0, float $$1, emh $$2, fpb $$3, int $$4, int $$5) {
      if ($$0.c() || $$0.d()) {
         float $$6 = $$0.c() ? $$0.a($$1) : $$0.b($$1);
         double $$7 = $$0.c() ? (double)$$0.k().aj() : 50.0;
         $$6 = asy.a($$6 * (float) Math.PI);
         int $$8 = asy.a((double)$$6 * $$7);
         float[] $$9 = $$0.c() ? cix.c.d() : cix.k.d();
         long $$10 = $$0.k().V();
         fqw.a($$2, $$3, c, $$1, $$6, $$10, -$$8, $$8 * 2, $$9, 0.15F, 0.175F);
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
   protected fpj d() {
      return fpj.w();
   }

   @Override
   public int aP_() {
      return 256;
   }
}
