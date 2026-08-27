public class fkm<T extends blu> extends fke<T> {
   private static final String a = "knot";
   private final fmv b;
   private final fmv f;

   public fkm(fmv $$0) {
      this.b = $$0;
      this.f = $$0.b("knot");
   }

   public static fnb b() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      $$1.a("knot", fna.c().a(0, 0).a(-3.0F, -8.0F, -3.0F, 6.0F, 8.0F, 6.0F), fmx.a);
      return fnb.a($$0, 32, 32);
   }

   @Override
   public fmv a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = $$5 * (float) (Math.PI / 180.0);
   }
}
