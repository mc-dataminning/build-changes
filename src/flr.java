public class flr extends fls {
   private final fmv b;
   protected final fmv a;

   public flr(fmv $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fnd a() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      $$1.a("head", fna.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fmx.a);
      return $$0;
   }

   public static fnb b() {
      fnd $$0 = a();
      fne $$1 = $$0.a();
      $$1.a("head").a("hat", fna.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fmz(0.25F)), fmx.a);
      return fnb.a($$0, 64, 64);
   }

   public static fnb c() {
      fnd $$0 = a();
      return fnb.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(epz $$0, eqd $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
