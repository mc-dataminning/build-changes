public class ftt extends fvo<biy> {
   private static final aew a = new aew("textures/entity/squid/glow_squid.png");

   public ftt(fth.a $$0, fhf<biy> $$1) {
      super($$0, $$1);
   }

   public aew a(biy $$0) {
      return a;
   }

   protected int a(biy $$0, gw $$1) {
      int $$2 = (int)arw.b(0.0F, 15.0F, 1.0F - (float)$$0.y() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
