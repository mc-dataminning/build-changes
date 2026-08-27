public class fku extends fkv {
   private final fly b;
   protected final fly a;

   public fku(fly $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fmg a() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      $$1.a("head", fmd.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fma.a);
      return $$0;
   }

   public static fme b() {
      fmg $$0 = a();
      fmh $$1 = $$0.a();
      $$1.a("head").a("hat", fmd.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fmc(0.25F)), fma.a);
      return fme.a($$0, 64, 64);
   }

   public static fme c() {
      fmg $$0 = a();
      return fme.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(epd $$0, eph $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
