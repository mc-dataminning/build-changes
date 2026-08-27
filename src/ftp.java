public class ftp extends fvk<bje> {
   private static final aez a = new aez("textures/entity/squid/glow_squid.png");

   public ftp(ftd.a $$0, fha<bje> $$1) {
      super($$0, $$1);
   }

   public aez a(bje $$0) {
      return a;
   }

   protected int a(bje $$0, gw $$1) {
      int $$2 = (int)asb.b(0.0F, 15.0F, 1.0F - (float)$$0.y() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
