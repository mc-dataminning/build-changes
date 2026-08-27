public class ftr extends fts<dgx> {
   private static final agm c = new agm("textures/entity/end_gateway_beam.png");

   public ftr(fta.a $$0) {
      super($$0);
   }

   public void a(dgx $$0, float $$1, eob $$2, fqz $$3, int $$4, int $$5) {
      if ($$0.c() || $$0.d()) {
         float $$6 = $$0.c() ? $$0.a($$1) : $$0.b($$1);
         double $$7 = $$0.c() ? (double)$$0.i().ak() : 50.0;
         $$6 = atq.a($$6 * (float) Math.PI);
         int $$8 = atq.a((double)$$6 * $$7);
         float[] $$9 = $$0.c() ? ckc.c.d() : ckc.k.d();
         long $$10 = $$0.i().W();
         fsv.a($$2, $$3, c, $$1, $$6, $$10, -$$8, $$8 * 2, $$9, 0.15F, 0.175F);
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
   protected frh d() {
      return frh.v();
   }

   @Override
   public int aT_() {
      return 256;
   }
}
