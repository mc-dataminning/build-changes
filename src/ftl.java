public class ftl extends fuj<bvh, ffa<bvh>> {
   private static final aez a = new aez("textures/entity/fox/fox.png");
   private static final aez i = new aez("textures/entity/fox/fox_sleep.png");
   private static final aez j = new aez("textures/entity/fox/snow_fox.png");
   private static final aez k = new aez("textures/entity/fox/snow_fox_sleep.png");

   public ftl(ftd.a $$0) {
      super($$0, new ffa<>($$0.a(fhw.X)), 0.4F);
      this.a(new fwy(this, $$0.d()));
   }

   protected void a(bvh $$0, elj $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.gk() || $$0.ge()) {
         float $$5 = -asb.i($$4, $$0.O, $$0.dD());
         $$1.a(a.b.rotationDegrees($$5));
      }
   }

   public aez a(bvh $$0) {
      if ($$0.t() == bvh.v.a) {
         return $$0.fD() ? i : a;
      } else {
         return $$0.fD() ? k : j;
      }
   }
}
