public class fsv extends fuq<bio> {
   private static final aep a = new aep("textures/entity/squid/glow_squid.png");

   public fsv(fsj.a $$0, fgm<bio> $$1) {
      super($$0, $$1);
   }

   public aep a(bio $$0) {
      return a;
   }

   protected int a(bio $$0, gv $$1) {
      int $$2 = (int)aro.b(0.0F, 15.0F, 1.0F - (float)$$0.t() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
