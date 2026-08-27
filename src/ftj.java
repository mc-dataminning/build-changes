public class ftj extends fve<biq> {
   private static final aer a = new aer("textures/entity/squid/glow_squid.png");

   public ftj(fsx.a $$0, fgv<biq> $$1) {
      super($$0, $$1);
   }

   public aer a(biq $$0) {
      return a;
   }

   protected int a(biq $$0, gu $$1) {
      int $$2 = (int)arp.b(0.0F, 15.0F, 1.0F - (float)$$0.t() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
