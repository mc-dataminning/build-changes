public class ftv extends fwj<cja> {
   private final fxo a;

   public ftv(fxo $$0) {
      super($$0);
      this.a = $$0.b("head").b("mushrooms");
   }

   public static fxu c() {
      fxw $$0 = fvb.a(fxs.a, 0.0F);
      fxx $$1 = $$0.a();
      fwj.a($$1);
      fxx $$2 = $$1.a("head").a("mushrooms", fxt.c(), fxq.a);
      $$2.a("red_mushroom_1", fxt.c().a(50, 16).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), fxq.a(3.0F, -8.0F, 3.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("red_mushroom_2", fxt.c().a(50, 16).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), fxq.a(3.0F, -8.0F, 3.0F, 0.0F, (float) (Math.PI * 3.0 / 4.0), 0.0F));
      $$2.a("brown_mushroom_1", fxt.c().a(50, 22).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), fxq.a(-3.0F, -8.0F, -3.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a(
         "brown_mushroom_2", fxt.c().a(50, 22).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), fxq.a(-3.0F, -8.0F, -3.0F, 0.0F, (float) (Math.PI * 3.0 / 4.0), 0.0F)
      );
      $$2.a(
         "brown_mushroom_3",
         fxt.c().a(50, 28).a(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F),
         fxq.a(-2.0F, -1.0F, 4.0F, (float) (-Math.PI / 2), 0.0F, (float) (Math.PI / 4))
      );
      $$2.a(
         "brown_mushroom_4",
         fxt.c().a(50, 28).a(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F),
         fxq.a(-2.0F, -1.0F, 4.0F, (float) (-Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 4.0))
      );
      return fxu.a($$0, 64, 32);
   }

   public void a(cja $$0, float $$1, float $$2, float $$3) {
      this.a.k = !$$0.gs();
      super.a($$0, $$1, $$2, $$3);
   }
}
