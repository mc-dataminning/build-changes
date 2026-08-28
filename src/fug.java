public class fug<T extends bsh> extends fuz<T> {
   private final fxq a;
   private final fxq b;

   public fug(fxq $$0) {
      this.a = $$0;
      this.b = $$0.b("tail_fin");
   }

   public static fxw b() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", fxv.c().a(0, 0).a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), fxs.a(0.0F, 22.0F, 0.0F));
      $$1.a("head", fxv.c().a(11, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), fxs.a(0.0F, 22.0F, 0.0F));
      $$1.a("nose", fxv.c().a(0, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), fxs.a(0.0F, 22.0F, -3.0F));
      $$1.a("right_fin", fxv.c().a(22, 1).a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), fxs.a(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", fxv.c().a(22, 4).a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), fxs.a(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      $$1.a("tail_fin", fxv.c().a(22, 3).a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), fxs.a(0.0F, 22.0F, 7.0F));
      $$1.a("top_fin", fxv.c().a(20, -6).a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), fxs.a(0.0F, 20.0F, 0.0F));
      return fxw.a($$0, 32, 32);
   }

   @Override
   public fxq a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 1.0F;
      if (!$$0.bg()) {
         $$6 = 1.5F;
      }

      this.b.f = -$$6 * 0.45F * ayg.a(0.6F * $$3);
   }
}
