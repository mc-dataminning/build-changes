public class flg extends fkl {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fmp e;
   private final fmp f;
   private final fmp g;

   public flg(fmp $$0) {
      super(fth::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fmv a() {
      fmx $$0 = new fmx();
      fmy $$1 = $$0.a();
      $$1.a("plate", fmu.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fmr.a);
      $$1.a("handle", fmu.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fmr.a);
      return fmv.a($$0, 64, 64);
   }

   public fmp b() {
      return this.f;
   }

   public fmp c() {
      return this.g;
   }

   @Override
   public void a(ept $$0, epx $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
