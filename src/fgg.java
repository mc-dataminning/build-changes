public class fgg extends fgh {
   private final fhj b;
   protected final fhj a;

   public fgg(fhj $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fhr a() {
      fhr $$0 = new fhr();
      fhs $$1 = $$0.a();
      $$1.a("head", fho.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fhl.a);
      return $$0;
   }

   public static fhp b() {
      fhr $$0 = a();
      fhs $$1 = $$0.a();
      $$1.a("head").a("hat", fho.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fhn(0.25F)), fhl.a);
      return fhp.a($$0, 64, 64);
   }

   public static fhp c() {
      fhr $$0 = a();
      return fhp.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(elh $$0, ell $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
