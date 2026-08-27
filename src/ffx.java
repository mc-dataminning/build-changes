public class ffx<T extends bii> extends fex<T> {
   private final fhn a;
   private final fhn b;
   private final fhn f;

   public ffx(fhn $$0) {
      this.a = $$0;
      this.b = $$0.b("left_fin");
      this.f = $$0.b("right_fin");
   }

   public static fht b() {
      fhv $$0 = new fhv();
      fhw $$1 = $$0.a();
      int $$2 = 23;
      $$1.a("body", fhs.c().a(0, 27).a(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F), fhp.a(0.0F, 23.0F, 0.0F));
      $$1.a("right_eye", fhs.c().a(24, 6).a(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), fhp.a(0.0F, 20.0F, 0.0F));
      $$1.a("left_eye", fhs.c().a(28, 6).a(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), fhp.a(0.0F, 20.0F, 0.0F));
      $$1.a("back_fin", fhs.c().a(-3, 0).a(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F), fhp.a(0.0F, 22.0F, 1.5F));
      $$1.a("right_fin", fhs.c().a(25, 0).a(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), fhp.a(-1.5F, 22.0F, -1.5F));
      $$1.a("left_fin", fhs.c().a(25, 0).a(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), fhp.a(1.5F, 22.0F, -1.5F));
      return fht.a($$0, 32, 32);
   }

   @Override
   public fhn a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.g = -0.2F + 0.4F * arp.a($$3 * 0.2F);
      this.b.g = 0.2F - 0.4F * arp.a($$3 * 0.2F);
   }
}
