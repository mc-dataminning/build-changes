public class ftb extends fsh<byy, ffb<byy>> {
   private static final aey a = new aey("textures/entity/zombie/drowned.png");

   public ftb(ftj.a $$0) {
      super($$0, new ffb<>($$0.a(fid.L)), new ffb<>($$0.a(fid.M)), new ffb<>($$0.a(fid.N)));
      this.a(new fwz<>(this, $$0.f()));
   }

   @Override
   public aey a(cad $$0) {
      return a;
   }

   protected void a(byy $$0, elr $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.a($$4);
      if ($$5 > 0.0F) {
         float $$6 = -10.0F - $$0.dD();
         float $$7 = ary.i($$5, 0.0F, $$6);
         $$1.a(a.b.rotationDegrees($$7), 0.0F, $$0.dg() / 2.0F, 0.0F);
      }
   }
}
