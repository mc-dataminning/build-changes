public class ftm extends ftn<dgs> {
   private static final agi c = new agi("textures/entity/end_gateway_beam.png");

   public ftm(fsv.a $$0) {
      super($$0);
   }

   public void a(dgs $$0, float $$1, enw $$2, fqu $$3, int $$4, int $$5) {
      if ($$0.c() || $$0.d()) {
         float $$6 = $$0.c() ? $$0.a($$1) : $$0.b($$1);
         double $$7 = $$0.c() ? (double)$$0.k().ak() : 50.0;
         $$6 = atm.a($$6 * (float) Math.PI);
         int $$8 = atm.a((double)$$6 * $$7);
         float[] $$9 = $$0.c() ? cjx.c.d() : cjx.k.d();
         long $$10 = $$0.k().W();
         fsq.a($$2, $$3, c, $$1, $$6, $$10, -$$8, $$8 * 2, $$9, 0.15F, 0.175F);
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
   protected frc d() {
      return frc.v();
   }

   @Override
   public int aS_() {
      return 256;
   }
}
