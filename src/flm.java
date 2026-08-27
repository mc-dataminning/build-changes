public class flm extends fkr {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fmv e;
   private final fmv f;
   private final fmv g;

   public flm(fmv $$0) {
      super(ftn::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fnb a() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      $$1.a("plate", fna.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fmx.a);
      $$1.a("handle", fna.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fmx.a);
      return fnb.a($$0, 64, 64);
   }

   public fmv b() {
      return this.f;
   }

   public fmv c() {
      return this.g;
   }

   @Override
   public void a(epz $$0, eqd $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
