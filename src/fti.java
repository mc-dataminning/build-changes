public class fti extends fvw<cjo> {
   private final fxb a;

   public fti(fxb $$0) {
      super($$0);
      this.a = $$0.b("head").b("mushrooms");
   }

   public static fxh c() {
      fxj $$0 = fuo.a(fxf.a, 0.0F);
      fxk $$1 = $$0.a();
      fvw.a($$1);
      fxk $$2 = $$1.a("head").a("mushrooms", fxg.c(), fxd.a);
      $$2.a("red_mushroom_1", fxg.c().a(50, 16).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), fxd.a(3.0F, -8.0F, 3.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("red_mushroom_2", fxg.c().a(50, 16).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), fxd.a(3.0F, -8.0F, 3.0F, 0.0F, (float) (Math.PI * 3.0 / 4.0), 0.0F));
      $$2.a("brown_mushroom_1", fxg.c().a(50, 22).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), fxd.a(-3.0F, -8.0F, -3.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a(
         "brown_mushroom_2", fxg.c().a(50, 22).a(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), fxd.a(-3.0F, -8.0F, -3.0F, 0.0F, (float) (Math.PI * 3.0 / 4.0), 0.0F)
      );
      $$2.a(
         "brown_mushroom_3",
         fxg.c().a(50, 28).a(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F),
         fxd.a(-2.0F, -1.0F, 4.0F, (float) (-Math.PI / 2), 0.0F, (float) (Math.PI / 4))
      );
      $$2.a(
         "brown_mushroom_4",
         fxg.c().a(50, 28).a(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F),
         fxd.a(-2.0F, -1.0F, 4.0F, (float) (-Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 4.0))
      );
      return fxh.a($$0, 64, 32);
   }

   public void a(cjo $$0, float $$1, float $$2, float $$3) {
      this.a.k = !$$0.gu();
      super.a($$0, $$1, $$2, $$3);
   }
}
