public class fgk extends fgl {
   private final fhn b;
   protected final fhn a;

   public fgk(fhn $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fhv a() {
      fhv $$0 = new fhv();
      fhw $$1 = $$0.a();
      $$1.a("head", fhs.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fhp.a);
      return $$0;
   }

   public static fht b() {
      fhv $$0 = a();
      fhw $$1 = $$0.a();
      $$1.a("head").a("hat", fhs.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fhr(0.25F)), fhp.a);
      return fht.a($$0, 64, 64);
   }

   public static fht c() {
      fhv $$0 = a();
      return fht.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(elg $$0, elk $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
