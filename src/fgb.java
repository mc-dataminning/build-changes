public class fgb extends ffg {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fhj e;
   private final fhj f;
   private final fhj g;

   public fgb(fhj $$0) {
      super(fno::b);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fhp a() {
      fhr $$0 = new fhr();
      fhs $$1 = $$0.a();
      $$1.a("plate", fho.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fhl.a);
      $$1.a("handle", fho.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fhl.a);
      return fhp.a($$0, 64, 64);
   }

   public fhj b() {
      return this.f;
   }

   public fhj c() {
      return this.g;
   }

   @Override
   public void a(elh $$0, ell $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
