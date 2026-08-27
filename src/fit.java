public class fit extends fjy<bxn> {
   private final fmp a;
   private final fmp b;
   private final fmp f;
   private final fmp g;
   private final fmp h;
   private final fmp i;
   private final fmp j;
   private final fmp k;

   public fit(fmp $$0) {
      super(fth::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fmv b() {
      fmx $$0 = new fmx();
      fmy $$1 = $$0.a();
      fmy $$2 = $$1.a("body", fmu.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fmr.a(0.0F, 17.0F, 0.0F));
      fmy $$3 = $$1.a("head", fmu.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fmr.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fmu.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fmr.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fmu.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fmr.a(1.1F, -3.0F, 0.0F));
      fmy $$4 = $$2.a("right_wing", fmu.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fmr.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fmu.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fmr.a(-2.0F, 0.0F, 0.0F));
      fmy $$5 = $$2.a("left_wing", fmu.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fmr.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fmu.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fmr.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fmu.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fmr.a(0.0F, 5.0F, 0.0F));
      return fmv.a($$0, 32, 32);
   }

   @Override
   public fmp a() {
      return this.a;
   }

   public void a(bxn $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fmp::c);
      if ($$0.w()) {
         this.a($$4);
      }

      this.a($$0.d, evu.b, $$3, 1.0F);
      this.a($$0.e, evu.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
