public class fgz extends fha {
   private final fic b;
   protected final fic a;

   public fgz(fic $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fik a() {
      fik $$0 = new fik();
      fil $$1 = $$0.a();
      $$1.a("head", fih.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fie.a);
      return $$0;
   }

   public static fii b() {
      fik $$0 = a();
      fil $$1 = $$0.a();
      $$1.a("head").a("hat", fih.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fig(0.25F)), fie.a);
      return fii.a($$0, 64, 64);
   }

   public static fii c() {
      fik $$0 = a();
      return fii.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(elp $$0, elt $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
