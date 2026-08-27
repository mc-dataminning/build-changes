public class fht extends fhu {
   private final fiw b;
   protected final fiw a;

   public fht(fiw $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fje a() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      $$1.a("head", fjb.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fiy.a);
      return $$0;
   }

   public static fjc b() {
      fje $$0 = a();
      fjf $$1 = $$0.a();
      $$1.a("head").a("hat", fjb.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fja(0.25F)), fiy.a);
      return fjc.a($$0, 64, 64);
   }

   public static fjc c() {
      fje $$0 = a();
      return fjc.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(emh $$0, eml $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
