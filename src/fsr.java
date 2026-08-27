public class fsr extends ftp<bus, fem<bus>> {
   private static final aep a = new aep("textures/entity/fox/fox.png");
   private static final aep i = new aep("textures/entity/fox/fox_sleep.png");
   private static final aep j = new aep("textures/entity/fox/snow_fox.png");
   private static final aep k = new aep("textures/entity/fox/snow_fox_sleep.png");

   public fsr(fsj.a $$0) {
      super($$0, new fem<>($$0.a(fhi.X)), 0.4F);
      this.a(new fwe(this, $$0.d()));
   }

   protected void a(bus $$0, elh $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.gf() || $$0.fZ()) {
         float $$5 = -aro.i($$4, $$0.O, $$0.dC());
         $$1.a(a.b.rotationDegrees($$5));
      }
   }

   public aep a(bus $$0) {
      if ($$0.q() == bus.v.a) {
         return $$0.fB() ? i : a;
      } else {
         return $$0.fB() ? k : j;
      }
   }
}
