public class fmm extends fmn<dbb> {
   private static final acq c = new acq("textures/entity/end_gateway_beam.png");

   public fmm(flv.a $$0) {
      super($$0);
   }

   public void a(dbb $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
      if ($$0.c() || $$0.d()) {
         float $$6 = $$0.c() ? $$0.a($$1) : $$0.b($$1);
         double $$7 = $$0.c() ? (double)$$0.k().aj() : 50.0;
         $$6 = apa.a($$6 * (float) Math.PI);
         int $$8 = apa.a((double)$$6 * $$7);
         float[] $$9 = $$0.c() ? cen.c.d() : cen.k.d();
         long $$10 = $$0.k().V();
         flq.a($$2, $$3, c, $$1, $$6, $$10, -$$8, $$8 * 2, $$9, 0.15F, 0.175F);
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
   protected fkf d() {
      return fkf.w();
   }

   @Override
   public int aK_() {
      return 256;
   }
}
