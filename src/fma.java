public class fma extends flf {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fnj e;
   private final fnj f;
   private final fnj g;

   public fma(fnj $$0) {
      super(fub::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fnp a() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      $$1.a("plate", fno.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fnl.a);
      $$1.a("handle", fno.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fnl.a);
      return fnp.a($$0, 64, 64);
   }

   public fnj b() {
      return this.f;
   }

   public fnj c() {
      return this.g;
   }

   @Override
   public void a(eqk $$0, eqo $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
