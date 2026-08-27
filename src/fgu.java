public class fgu extends fgv {
   private final fhx b;
   protected final fhx a;

   public fgu(fhx $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fif a() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      $$1.a("head", fic.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fhz.a);
      return $$0;
   }

   public static fid b() {
      fif $$0 = a();
      fig $$1 = $$0.a();
      $$1.a("head").a("hat", fic.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fib(0.25F)), fhz.a);
      return fid.a($$0, 64, 64);
   }

   public static fid c() {
      fif $$0 = a();
      return fid.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(elj $$0, eln $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
