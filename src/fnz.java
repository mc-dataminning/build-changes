public class fnz extends fne {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fpj e;
   private final fpj f;
   private final fpj g;

   public fnz(fpj $$0) {
      super(fwb::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fpp a() {
      fpr $$0 = new fpr();
      fps $$1 = $$0.a();
      $$1.a("plate", fpo.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fpl.a);
      $$1.a("handle", fpo.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fpl.a);
      return fpp.a($$0, 64, 64);
   }

   public fpj b() {
      return this.f;
   }

   public fpj c() {
      return this.g;
   }

   @Override
   public void a(esh $$0, esl $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
