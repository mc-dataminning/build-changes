public class fue extends fup<bvf, ffu<bvf>> {
   private static final aey a = new aey("textures/entity/iron_golem/iron_golem.png");

   public fue(ftj.a $$0) {
      super($$0, new ffu<>($$0.a(fid.ap)), 0.7F);
      this.a(new fxi(this));
      this.a(new fxj(this, $$0.c()));
   }

   public aey a(bvf $$0) {
      return a;
   }

   protected void a(bvf $$0, elr $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!((double)$$0.aQ.a() < 0.01)) {
         float $$5 = 13.0F;
         float $$6 = $$0.aQ.c($$4) + 6.0F;
         float $$7 = (Math.abs($$6 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$7));
      }
   }
}
