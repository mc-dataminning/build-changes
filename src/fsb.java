public class fsb extends frh<byn, feg<byn>> {
   private static final aep a = new aep("textures/entity/zombie/drowned.png");

   public fsb(fsj.a $$0) {
      super($$0, new feg<>($$0.a(fhi.L)), new feg<>($$0.a(fhi.M)), new feg<>($$0.a(fhi.N)));
      this.a(new fvz<>(this, $$0.f()));
   }

   @Override
   public aep a(bzs $$0) {
      return a;
   }

   protected void a(byn $$0, elh $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.a($$4);
      if ($$5 > 0.0F) {
         float $$6 = -10.0F - $$0.dC();
         float $$7 = aro.i($$5, 0.0F, $$6);
         $$1.a(a.b.rotationDegrees($$7), 0.0F, $$0.dg() / 2.0F, 0.0F);
      }
   }
}
