public class fth extends fvv<cjn> {
   private final fxa a;

   public fth(fxa $$0) {
      super($$0);
      this.a = $$0.b("head").b("mushrooms");
   }

   public static fxg c() {
      fxi $$0 = fun.a(fxe.a, 0.0F);
      fxj $$1 = $$0.a();
      fvv.a($$1);
      fxj $$2 = $$1.a("head").a("mushrooms", fxf.c(), fxc.a);
      $$2.a("red_mushroom_1", fxf.c().a(50, 16).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), fxc.a(3.0F, -8.0F, 3.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("red_mushroom_2", fxf.c().a(50, 16).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), fxc.a(3.0F, -8.0F, 3.0F, 0.0F, (float) (Math.PI * 3.0 / 4.0), 0.0F));
      $$2.a("brown_mushroom_1", fxf.c().a(50, 22).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), fxc.a(-3.0F, -8.0F, -3.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a(
         "brown_mushroom_2", fxf.c().a(50, 22).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), fxc.a(-3.0F, -8.0F, -3.0F, 0.0F, (float) (Math.PI * 3.0 / 4.0), 0.0F)
      );
      $$2.a(
         "brown_mushroom_3",
         fxf.c().a(50, 28).a(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F),
         fxc.a(-2.0F, -1.0F, 4.0F, (float) (-Math.PI / 2), 0.0F, (float) (Math.PI / 4))
      );
      $$2.a(
         "brown_mushroom_4",
         fxf.c().a(50, 28).a(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F),
         fxc.a(-2.0F, -1.0F, 4.0F, (float) (-Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 4.0))
      );
      return fxg.a($$0, 64, 32);
   }

   public void a(cjn $$0, float $$1, float $$2, float $$3) {
      this.a.k = !$$0.gu();
      super.a($$0, $$1, $$2, $$3);
   }
}
