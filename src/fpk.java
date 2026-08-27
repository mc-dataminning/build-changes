public class fpk extends frf<bfr> {
   private static final acq a = new acq("textures/entity/squid/glow_squid.png");

   public fpk(foy.a $$0, fdh<bfr> $$1) {
      super($$0, $$1);
   }

   public acq a(bfr $$0) {
      return a;
   }

   protected int a(bfr $$0, gu $$1) {
      int $$2 = (int)apa.b(0.0F, 15.0F, 1.0F - (float)$$0.w() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
