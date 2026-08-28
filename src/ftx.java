public class ftx extends fwl<cjb> {
   private final fxq a;

   public ftx(fxq $$0) {
      super($$0);
      this.a = $$0.b("head").b("mushrooms");
   }

   public static fxw c() {
      fxy $$0 = fvd.a(fxu.a, 0.0F);
      fxz $$1 = $$0.a();
      fwl.a($$1);
      fxz $$2 = $$1.a("head").a("mushrooms", fxv.c(), fxs.a);
      $$2.a("red_mushroom_1", fxv.c().a(50, 16).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), fxs.a(3.0F, -8.0F, 3.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("red_mushroom_2", fxv.c().a(50, 16).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), fxs.a(3.0F, -8.0F, 3.0F, 0.0F, (float) (Math.PI * 3.0 / 4.0), 0.0F));
      $$2.a("brown_mushroom_1", fxv.c().a(50, 22).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), fxs.a(-3.0F, -8.0F, -3.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a(
         "brown_mushroom_2", fxv.c().a(50, 22).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), fxs.a(-3.0F, -8.0F, -3.0F, 0.0F, (float) (Math.PI * 3.0 / 4.0), 0.0F)
      );
      $$2.a(
         "brown_mushroom_3",
         fxv.c().a(50, 28).a(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F),
         fxs.a(-2.0F, -1.0F, 4.0F, (float) (-Math.PI / 2), 0.0F, (float) (Math.PI / 4))
      );
      $$2.a(
         "brown_mushroom_4",
         fxv.c().a(50, 28).a(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F),
         fxs.a(-2.0F, -1.0F, 4.0F, (float) (-Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 4.0))
      );
      return fxw.a($$0, 64, 32);
   }

   public void a(cjb $$0, float $$1, float $$2, float $$3) {
      this.a.k = !$$0.gr();
      super.a($$0, $$1, $$2, $$3);
   }
}
