public class flt extends flu {
   private final fmx b;
   protected final fmx a;

   public flt(fmx $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fnf a() {
      fnf $$0 = new fnf();
      fng $$1 = $$0.a();
      $$1.a("head", fnc.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fmz.a);
      return $$0;
   }

   public static fnd b() {
      fnf $$0 = a();
      fng $$1 = $$0.a();
      $$1.a("head").a("hat", fnc.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fnb(0.25F)), fmz.a);
      return fnd.a($$0, 64, 64);
   }

   public static fnd c() {
      fnf $$0 = a();
      return fnd.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(eqb $$0, eqf $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
