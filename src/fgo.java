public class fgo<T extends bjt> extends fgg<T> {
   private static final String a = "knot";
   private final fiw b;
   private final fiw f;

   public fgo(fiw $$0) {
      this.b = $$0;
      this.f = $$0.b("knot");
   }

   public static fjc b() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      $$1.a("knot", fjb.c().a(0, 0).a(-3.0F, -8.0F, -3.0F, 6.0F, 8.0F, 6.0F), fiy.a);
      return fjc.a($$0, 32, 32);
   }

   @Override
   public fiw a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = $$5 * (float) (Math.PI / 180.0);
   }
}
