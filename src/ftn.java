public class ftn<T extends bru> extends ftf<T> {
   private static final String a = "knot";
   private final fvw b;
   private final fvw f;

   public ftn(fvw $$0) {
      this.b = $$0;
      this.f = $$0.b("knot");
   }

   public static fwc b() {
      fwe $$0 = new fwe();
      fwf $$1 = $$0.a();
      $$1.a("knot", fwb.c().a(0, 0).a(-3.0F, -8.0F, -3.0F, 6.0F, 8.0F, 6.0F), fvy.a);
      return fwc.a($$0, 32, 32);
   }

   @Override
   public fvw a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = $$5 * (float) (Math.PI / 180.0);
   }
}
