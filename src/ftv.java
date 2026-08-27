public class ftv extends fvq<bja> {
   private static final aey a = new aey("textures/entity/squid/glow_squid.png");

   public ftv(ftj.a $$0, fhh<bja> $$1) {
      super($$0, $$1);
   }

   public aey a(bja $$0) {
      return a;
   }

   protected int a(bja $$0, gw $$1) {
      int $$2 = (int)ary.b(0.0F, 15.0F, 1.0F - (float)$$0.y() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
