public class ftp<T extends brh> extends fsk<T> {
   private static final String a = "body_front";
   private static final String b = "body_back";
   private final fvb f;
   private final fvb g;

   public ftp(fvb $$0) {
      this.f = $$0;
      this.g = $$0.b("body_back");
   }

   public static fvh b() {
      fvj $$0 = new fvj();
      fvk $$1 = $$0.a();
      int $$2 = 20;
      fvk $$3 = $$1.a("body_front", fvg.c().a(0, 0).a(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F), fvd.a(0.0F, 20.0F, 0.0F));
      fvk $$4 = $$1.a("body_back", fvg.c().a(0, 13).a(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F), fvd.a(0.0F, 20.0F, 8.0F));
      $$1.a("head", fvg.c().a(22, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), fvd.a(0.0F, 20.0F, 0.0F));
      $$4.a("back_fin", fvg.c().a(20, 10).a(0.0F, -2.5F, 0.0F, 0.0F, 5.0F, 6.0F), fvd.a(0.0F, 0.0F, 8.0F));
      $$3.a("top_front_fin", fvg.c().a(2, 1).a(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F), fvd.a(0.0F, -4.5F, 5.0F));
      $$4.a("top_back_fin", fvg.c().a(0, 2).a(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F), fvd.a(0.0F, -4.5F, -1.0F));
      $$1.a("right_fin", fvg.c().a(-4, 0).a(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F), fvd.a(-1.5F, 21.5F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", fvg.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F), fvd.a(1.5F, 21.5F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      return fvh.a($$0, 32, 32);
   }

   @Override
   public fvb a() {
      return this.f;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 1.0F;
      float $$7 = 1.0F;
      if (!$$0.bc()) {
         $$6 = 1.3F;
         $$7 = 1.7F;
      }

      this.g.f = -$$6 * 0.25F * axz.a($$7 * 0.6F * $$3);
   }
}
