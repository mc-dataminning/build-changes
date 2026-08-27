public class fpg extends fqe<brv, fbh<brv>> {
   private static final acq a = new acq("textures/entity/fox/fox.png");
   private static final acq i = new acq("textures/entity/fox/fox_sleep.png");
   private static final acq j = new acq("textures/entity/fox/snow_fox.png");
   private static final acq k = new acq("textures/entity/fox/snow_fox_sleep.png");

   public fpg(foy.a $$0) {
      super($$0, new fbh<>($$0.a(fed.X)), 0.4F);
      this.a(new fst(this, $$0.d()));
   }

   protected void a(brv $$0, eij $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.ge() || $$0.fY()) {
         float $$5 = -apa.i($$4, $$0.N, $$0.dA());
         $$1.a(a.b.rotationDegrees($$5));
      }
   }

   public acq a(brv $$0) {
      if ($$0.r() == brv.v.a) {
         return $$0.fy() ? i : a;
      } else {
         return $$0.fy() ? k : j;
      }
   }
}
