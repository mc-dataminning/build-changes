public class fhb extends fhc {
   private final fie b;
   protected final fie a;

   public fhb(fie $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fim a() {
      fim $$0 = new fim();
      fin $$1 = $$0.a();
      $$1.a("head", fij.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fig.a);
      return $$0;
   }

   public static fik b() {
      fim $$0 = a();
      fin $$1 = $$0.a();
      $$1.a("head").a("hat", fij.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fii(0.25F)), fig.a);
      return fik.a($$0, 64, 64);
   }

   public static fik c() {
      fim $$0 = a();
      return fik.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(elr $$0, elv $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
