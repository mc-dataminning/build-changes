public class ftr extends fup<bvd, ffh<bvd>> {
   private static final aey a = new aey("textures/entity/fox/fox.png");
   private static final aey i = new aey("textures/entity/fox/fox_sleep.png");
   private static final aey j = new aey("textures/entity/fox/snow_fox.png");
   private static final aey k = new aey("textures/entity/fox/snow_fox_sleep.png");

   public ftr(ftj.a $$0) {
      super($$0, new ffh<>($$0.a(fid.X)), 0.4F);
      this.a(new fxe(this, $$0.d()));
   }

   protected void a(bvd $$0, elr $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.gj() || $$0.gd()) {
         float $$5 = -ary.i($$4, $$0.O, $$0.dD());
         $$1.a(a.b.rotationDegrees($$5));
      }
   }

   public aey a(bvd $$0) {
      if ($$0.t() == bvd.v.a) {
         return $$0.fC() ? i : a;
      } else {
         return $$0.fC() ? k : j;
      }
   }
}
