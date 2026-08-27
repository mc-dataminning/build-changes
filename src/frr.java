public class frr<T extends brh> extends fsk<T> {
   private final fvb a;
   private final fvb b;

   public frr(fvb $$0) {
      this.a = $$0;
      this.b = $$0.b("tail_fin");
   }

   public static fvh b() {
      fvj $$0 = new fvj();
      fvk $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", fvg.c().a(0, 0).a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), fvd.a(0.0F, 22.0F, 0.0F));
      $$1.a("head", fvg.c().a(11, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), fvd.a(0.0F, 22.0F, 0.0F));
      $$1.a("nose", fvg.c().a(0, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), fvd.a(0.0F, 22.0F, -3.0F));
      $$1.a("right_fin", fvg.c().a(22, 1).a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), fvd.a(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", fvg.c().a(22, 4).a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), fvd.a(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      $$1.a("tail_fin", fvg.c().a(22, 3).a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), fvd.a(0.0F, 22.0F, 7.0F));
      $$1.a("top_fin", fvg.c().a(20, -6).a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), fvd.a(0.0F, 20.0F, 0.0F));
      return fvh.a($$0, 32, 32);
   }

   @Override
   public fvb a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 1.0F;
      if (!$$0.bc()) {
         $$6 = 1.5F;
      }

      this.b.f = -$$6 * 0.45F * axz.a(0.6F * $$3);
   }
}
