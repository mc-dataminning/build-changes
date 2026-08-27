public class ftx extends fty {
   private final fvb b;
   protected final fvb a;

   public ftx(fvb $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fvj a() {
      fvj $$0 = new fvj();
      fvk $$1 = $$0.a();
      $$1.a("head", fvg.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fvd.a);
      return $$0;
   }

   public static fvh b() {
      fvj $$0 = a();
      fvk $$1 = $$0.a();
      $$1.a("head").a("hat", fvg.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fvf(0.25F)), fvd.a);
      return fvh.a($$0, 64, 64);
   }

   public static fvh c() {
      fvj $$0 = a();
      return fvh.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(exx $$0, eyb $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
