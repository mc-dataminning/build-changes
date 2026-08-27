public class fmf extends fmg {
   private final fnj b;
   protected final fnj a;

   public fmf(fnj $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fnr a() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      $$1.a("head", fno.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fnl.a);
      return $$0;
   }

   public static fnp b() {
      fnr $$0 = a();
      fns $$1 = $$0.a();
      $$1.a("head").a("hat", fno.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fnn(0.25F)), fnl.a);
      return fnp.a($$0, 64, 64);
   }

   public static fnp c() {
      fnr $$0 = a();
      return fnp.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(eqk $$0, eqo $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
