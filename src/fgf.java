public class fgf extends ffk {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fhn e;
   private final fhn f;
   private final fhn g;

   public fgf(fhn $$0) {
      super(fnt::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fht a() {
      fhv $$0 = new fhv();
      fhw $$1 = $$0.a();
      $$1.a("plate", fhs.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fhp.a);
      $$1.a("handle", fhs.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fhp.a);
      return fht.a($$0, 64, 64);
   }

   public fhn b() {
      return this.f;
   }

   public fhn c() {
      return this.g;
   }

   @Override
   public void a(elg $$0, elk $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
