public class ftp extends fun<bvb, fff<bvb>> {
   private static final aex a = new aex("textures/entity/fox/fox.png");
   private static final aex i = new aex("textures/entity/fox/fox_sleep.png");
   private static final aex j = new aex("textures/entity/fox/snow_fox.png");
   private static final aex k = new aex("textures/entity/fox/snow_fox_sleep.png");

   public ftp(fth.a $$0) {
      super($$0, new fff<>($$0.a(fib.X)), 0.4F);
      this.a(new fxc(this, $$0.d()));
   }

   protected void a(bvb $$0, elp $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.gj() || $$0.gd()) {
         float $$5 = -arx.i($$4, $$0.O, $$0.dD());
         $$1.a(a.b.rotationDegrees($$5));
      }
   }

   public aex a(bvb $$0) {
      if ($$0.t() == bvb.v.a) {
         return $$0.fC() ? i : a;
      } else {
         return $$0.fC() ? k : j;
      }
   }
}
