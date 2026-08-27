public class fsp extends frv<byo, fep<byo>> {
   private static final aer a = new aer("textures/entity/zombie/drowned.png");

   public fsp(fsx.a $$0) {
      super($$0, new fep<>($$0.a(fhr.L)), new fep<>($$0.a(fhr.M)), new fep<>($$0.a(fhr.N)));
      this.a(new fwn<>(this, $$0.f()));
   }

   @Override
   public aer a(bzt $$0) {
      return a;
   }

   protected void a(byo $$0, elf $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.a($$4);
      if ($$5 > 0.0F) {
         float $$6 = -10.0F - $$0.dC();
         float $$7 = arp.i($$5, 0.0F, $$6);
         $$1.a(a.b.rotationDegrees($$7), 0.0F, $$0.dg() / 2.0F, 0.0F);
      }
   }
}
