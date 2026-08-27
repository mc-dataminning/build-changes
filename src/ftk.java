public class ftk extends fui<buw, ffa<buw>> {
   private static final aeu a = new aeu("textures/entity/fox/fox.png");
   private static final aeu i = new aeu("textures/entity/fox/fox_sleep.png");
   private static final aeu j = new aeu("textures/entity/fox/snow_fox.png");
   private static final aeu k = new aeu("textures/entity/fox/snow_fox_sleep.png");

   public ftk(ftc.a $$0) {
      super($$0, new ffa<>($$0.a(fhw.X)), 0.4F);
      this.a(new fwx(this, $$0.d()));
   }

   protected void a(buw $$0, elk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.gg() || $$0.ga()) {
         float $$5 = -ars.i($$4, $$0.O, $$0.dC());
         $$1.a(a.b.rotationDegrees($$5));
      }
   }

   public aeu a(buw $$0) {
      if ($$0.q() == buw.v.a) {
         return $$0.fB() ? i : a;
      } else {
         return $$0.fB() ? k : j;
      }
   }
}
