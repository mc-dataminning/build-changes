public class ftq<T extends bsu> extends fuj<T> {
   private final fxa a;
   private final fxa b;

   public ftq(fxa $$0) {
      this.a = $$0;
      this.b = $$0.b("tail_fin");
   }

   public static fxg b() {
      fxi $$0 = new fxi();
      fxj $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", fxf.c().a(0, 0).a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), fxc.a(0.0F, 22.0F, 0.0F));
      $$1.a("head", fxf.c().a(11, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), fxc.a(0.0F, 22.0F, 0.0F));
      $$1.a("nose", fxf.c().a(0, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), fxc.a(0.0F, 22.0F, -3.0F));
      $$1.a("right_fin", fxf.c().a(22, 1).a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), fxc.a(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", fxf.c().a(22, 4).a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), fxc.a(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      $$1.a("tail_fin", fxf.c().a(22, 3).a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), fxc.a(0.0F, 22.0F, 7.0F));
      $$1.a("top_fin", fxf.c().a(20, -6).a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), fxc.a(0.0F, 20.0F, 0.0F));
      return fxg.a($$0, 32, 32);
   }

   @Override
   public fxa a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 1.0F;
      if (!$$0.be()) {
         $$6 = 1.5F;
      }

      this.b.f = -$$6 * 0.45F * ayz.a(0.6F * $$3);
   }
}
