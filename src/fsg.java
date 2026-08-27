public class fsg extends frm<byp, fek<byp>> {
   private static final aer a = new aer("textures/entity/zombie/drowned.png");

   public fsg(fso.a $$0) {
      super($$0, new fek<>($$0.a(fhm.L)), new fek<>($$0.a(fhm.M)), new fek<>($$0.a(fhm.N)));
      this.a(new fwe<>(this, $$0.f()));
   }

   @Override
   public aer a(bzu $$0) {
      return a;
   }

   protected void a(byp $$0, elg $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.a($$4);
      if ($$5 > 0.0F) {
         float $$6 = -10.0F - $$0.dC();
         float $$7 = arp.i($$5, 0.0F, $$6);
         $$1.a(a.b.rotationDegrees($$7), 0.0F, $$0.dg() / 2.0F, 0.0F);
      }
   }
}
