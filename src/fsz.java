public class fsz extends fta<dgg> {
   private static final agg c = new agg("textures/entity/end_gateway_beam.png");

   public fsz(fsi.a $$0) {
      super($$0);
   }

   public void a(dgg $$0, float $$1, enk $$2, fqh $$3, int $$4, int $$5) {
      if ($$0.c() || $$0.d()) {
         float $$6 = $$0.c() ? $$0.a($$1) : $$0.b($$1);
         double $$7 = $$0.c() ? (double)$$0.k().aj() : 50.0;
         $$6 = ati.a($$6 * (float) Math.PI);
         int $$8 = ati.a((double)$$6 * $$7);
         float[] $$9 = $$0.c() ? cjp.c.d() : cjp.k.d();
         long $$10 = $$0.k().V();
         fsd.a($$2, $$3, c, $$1, $$6, $$10, -$$8, $$8 * 2, $$9, 0.15F, 0.175F);
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
   protected fqp d() {
      return fqp.v();
   }

   @Override
   public int aR_() {
      return 256;
   }
}
