public class fms<T extends bno> extends fmk<T> {
   private static final String a = "knot";
   private final fpc b;
   private final fpc f;

   public fms(fpc $$0) {
      this.b = $$0;
      this.f = $$0.b("knot");
   }

   public static fpi b() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      $$1.a("knot", fph.c().a(0, 0).a(-3.0F, -8.0F, -3.0F, 6.0F, 8.0F, 6.0F), fpe.a);
      return fpi.a($$0, 32, 32);
   }

   @Override
   public fpc a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = $$5 * (float) (Math.PI / 180.0);
   }
}
