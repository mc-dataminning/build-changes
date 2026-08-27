public class fht<T extends bki> extends fhl<T> {
   private static final String a = "knot";
   private final fkb b;
   private final fkb f;

   public fht(fkb $$0) {
      this.b = $$0;
      this.f = $$0.b("knot");
   }

   public static fkh b() {
      fkj $$0 = new fkj();
      fkk $$1 = $$0.a();
      $$1.a("knot", fkg.c().a(0, 0).a(-3.0F, -8.0F, -3.0F, 6.0F, 8.0F, 6.0F), fkd.a);
      return fkh.a($$0, 32, 32);
   }

   @Override
   public fkb a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = $$5 * (float) (Math.PI / 180.0);
   }
}
