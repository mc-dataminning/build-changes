public class fsw<T extends brh> extends fsk<T> {
   private final fvb a;

   public fsw(fvb $$0) {
      this.a = $$0;
   }

   public static fvh b() {
      fvj $$0 = new fvj();
      fvk $$1 = $$0.a();
      int $$2 = 20;
      int $$3 = 8;
      int $$4 = 16;
      int $$5 = 4;
      $$1.a("bottom", fvg.c().a(0, 10).a(-10.0F, -8.0F, -1.0F, 20.0F, 16.0F, 2.0F), fvd.a(0.0F, 4.0F, 0.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("front", fvg.c().a(0, 0).a(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F), fvd.a(-9.0F, 4.0F, 0.0F, 0.0F, (float) (Math.PI * 3.0 / 2.0), 0.0F));
      $$1.a("back", fvg.c().a(0, 0).a(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F), fvd.a(9.0F, 4.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      $$1.a("left", fvg.c().a(0, 0).a(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F), fvd.a(0.0F, 4.0F, -7.0F, 0.0F, (float) Math.PI, 0.0F));
      $$1.a("right", fvg.c().a(0, 0).a(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F), fvd.a(0.0F, 4.0F, 7.0F));
      return fvh.a($$0, 64, 32);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
   }

   @Override
   public fvb a() {
      return this.a;
   }
}
