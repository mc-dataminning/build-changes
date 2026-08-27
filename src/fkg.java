public class fkg<T extends blp> extends fjy<T> {
   private static final String a = "knot";
   private final fmp b;
   private final fmp f;

   public fkg(fmp $$0) {
      this.b = $$0;
      this.f = $$0.b("knot");
   }

   public static fmv b() {
      fmx $$0 = new fmx();
      fmy $$1 = $$0.a();
      $$1.a("knot", fmu.c().a(0, 0).a(-3.0F, -8.0F, -3.0F, 6.0F, 8.0F, 6.0F), fmr.a);
      return fmv.a($$0, 32, 32);
   }

   @Override
   public fmp a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = $$5 * (float) (Math.PI / 180.0);
   }
}
