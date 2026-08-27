public class fss<T extends brh> extends fsk<T> {
   private static final String a = "knot";
   private final fvb b;
   private final fvb f;

   public fss(fvb $$0) {
      this.b = $$0;
      this.f = $$0.b("knot");
   }

   public static fvh b() {
      fvj $$0 = new fvj();
      fvk $$1 = $$0.a();
      $$1.a("knot", fvg.c().a(0, 0).a(-3.0F, -8.0F, -3.0F, 6.0F, 8.0F, 6.0F), fvd.a);
      return fvh.a($$0, 32, 32);
   }

   @Override
   public fvb a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = $$5 * (float) (Math.PI / 180.0);
   }
}
