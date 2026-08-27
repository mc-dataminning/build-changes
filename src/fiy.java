public class fiy<T extends cdf> extends fjy<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fmp g;
   private final fmp h;
   private final fmp i;
   private final fmp j;
   private final fmp k;
   private final fmp l;
   private final fmp m;

   public fiy(fmp $$0) {
      super(fth::i);
      this.g = $$0;
      this.i = $$0.b("wind_body");
      this.l = this.i.b("wind_bottom");
      this.k = this.l.b("wind_mid");
      this.j = this.k.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.m = $$0.b("body").b("rods");
   }

   public static fmv b() {
      fmx $$0 = new fmx();
      fmy $$1 = $$0.a();
      fmy $$2 = $$1.a("body", fmu.c(), fmr.a(0.0F, 0.0F, 0.0F));
      fmy $$3 = $$2.a("rods", fmu.c(), fmr.a(0.0F, 8.0F, 0.0F));
      $$3.a("rod_1", fmu.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fmt(0.0F)), fmr.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$3.a("rod_2", fmu.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fmt(0.0F)), fmr.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$3.a("rod_3", fmu.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fmt(0.0F)), fmr.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fmy $$4 = $$2.a("head", fmu.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fmt(0.0F)), fmr.a(0.0F, 4.0F, 0.0F));
      fmy $$5 = $$1.a("wind_body", fmu.c(), fmr.a(0.0F, 0.0F, 0.0F));
      fmy $$6 = $$5.a("wind_bottom", fmu.c(), fmr.a(0.0F, 24.0F, 0.0F));
      fmy $$7 = $$6.a("wind_mid", fmu.c(), fmr.a(0.0F, -7.0F, 0.0F));
      $$7.a("wind_top", fmu.c(), fmr.a(0.0F, -6.0F, 0.0F));
      return fmv.a($$0, 32, 32);
   }

   public static fmv c() {
      fmx $$0 = new fmx();
      fmy $$1 = $$0.a();
      fmy $$2 = $$1.a("body", fmu.c(), fmr.a(0.0F, 0.0F, 0.0F));
      fmy $$3 = $$2.a("rods", fmu.c(), fmr.a(0.0F, 8.0F, 0.0F));
      fmy $$4 = $$2.a("head", fmu.c(), fmr.a(0.0F, 4.0F, 0.0F));
      $$4.a(
         "eyes",
         fmu.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fmt(0.0F)).a(7, 16).a(-4.0F, -2.0F, -4.0F, 8.0F, 1.0F, 1.0F, new fmt(0.0F)),
         fmr.a(0.0F, 0.0F, 0.0F)
      );
      fmy $$5 = $$1.a("wind_body", fmu.c(), fmr.a(0.0F, 0.0F, 0.0F));
      fmy $$6 = $$5.a("wind_bottom", fmu.c(), fmr.a(0.0F, 24.0F, 0.0F));
      fmy $$7 = $$6.a("wind_mid", fmu.c(), fmr.a(0.0F, -7.0F, 0.0F));
      $$7.a("wind_top", fmu.c(), fmr.a(0.0F, -6.0F, 0.0F));
      return fmv.a($$0, 32, 32);
   }

   public static fmv d() {
      fmx $$0 = new fmx();
      fmy $$1 = $$0.a();
      fmy $$2 = $$1.a("body", fmu.c(), fmr.a(0.0F, 0.0F, 0.0F));
      fmy $$3 = $$2.a("rods", fmu.c(), fmr.a(0.0F, 8.0F, 0.0F));
      $$2.a("head", fmu.c(), fmr.a(0.0F, 4.0F, 0.0F));
      fmy $$4 = $$1.a("wind_body", fmu.c(), fmr.a(0.0F, 0.0F, 0.0F));
      fmy $$5 = $$4.a("wind_bottom", fmu.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fmt(0.0F)), fmr.a(0.0F, 24.0F, 0.0F));
      fmy $$6 = $$5.a(
         "wind_mid",
         fmu.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fmt(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fmt(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fmt(0.0F)),
         fmr.a(0.0F, -7.0F, 0.0F)
      );
      $$6.a(
         "wind_top",
         fmu.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fmt(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fmt(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fmt(0.0F)),
         fmr.a(0.0F, -6.0F, 0.0F)
      );
      return fmv.a($$0, 128, 128);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fmp::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.j.b = aui.b($$6) * 1.0F * 0.6F;
      this.j.d = aui.a($$6) * 1.0F * 0.6F;
      this.k.b = aui.a($$6) * 0.5F * 0.8F;
      this.k.d = aui.b($$6) * 0.8F;
      this.l.b = aui.b($$6) * -0.25F * 1.0F;
      this.l.d = aui.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + aui.b($$6) / 4.0F;
      this.m.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.e, evv.a, $$3);
      this.a($$0.c, evv.c, $$3);
      this.a($$0.d, evv.b, $$3);
   }

   @Override
   public fmp a() {
      return this.g;
   }

   public fmp e() {
      return this.j;
   }

   public fmp f() {
      return this.k;
   }

   public fmp g() {
      return this.l;
   }
}
