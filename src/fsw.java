public class fsw extends ftu<buu, feq<buu>> {
   private static final aer a = new aer("textures/entity/fox/fox.png");
   private static final aer i = new aer("textures/entity/fox/fox_sleep.png");
   private static final aer j = new aer("textures/entity/fox/snow_fox.png");
   private static final aer k = new aer("textures/entity/fox/snow_fox_sleep.png");

   public fsw(fso.a $$0) {
      super($$0, new feq<>($$0.a(fhm.X)), 0.4F);
      this.a(new fwj(this, $$0.d()));
   }

   protected void a(buu $$0, elg $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.gf() || $$0.fZ()) {
         float $$5 = -arp.i($$4, $$0.O, $$0.dC());
         $$1.a(a.b.rotationDegrees($$5));
      }
   }

   public aer a(buu $$0) {
      if ($$0.q() == buu.v.a) {
         return $$0.fB() ? i : a;
      } else {
         return $$0.fB() ? k : j;
      }
   }
}
