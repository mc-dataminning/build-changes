public class fjj<T extends blp> extends fjy<T> {
   private final fmp a;
   private final fmp b;
   private final fmp f;
   private final fmp g;
   private final fmp h;
   private final fmp i;
   private static final int j = 6;

   public fjj(fmp $$0) {
      this.a = $$0;
      this.b = $$0.b("head");
      this.g = $$0.b("right_hind_leg");
      this.f = $$0.b("left_hind_leg");
      this.i = $$0.b("right_front_leg");
      this.h = $$0.b("left_front_leg");
   }

   public static fmv a(fmt $$0) {
      fmx $$1 = new fmx();
      fmy $$2 = $$1.a();
      $$2.a("head", fmu.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fmr.a(0.0F, 6.0F, 0.0F));
      $$2.a("body", fmu.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), fmr.a(0.0F, 6.0F, 0.0F));
      fmu $$3 = fmu.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, $$0);
      $$2.a("right_hind_leg", $$3, fmr.a(-2.0F, 18.0F, 4.0F));
      $$2.a("left_hind_leg", $$3, fmr.a(2.0F, 18.0F, 4.0F));
      $$2.a("right_front_leg", $$3, fmr.a(-2.0F, 18.0F, -4.0F));
      $$2.a("left_front_leg", $$3, fmr.a(2.0F, 18.0F, -4.0F));
      return fmv.a($$1, 64, 32);
   }

   @Override
   public fmp a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.b.f = $$4 * (float) (Math.PI / 180.0);
      this.b.e = $$5 * (float) (Math.PI / 180.0);
      this.f.e = aui.b($$1 * 0.6662F) * 1.4F * $$2;
      this.g.e = aui.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.h.e = aui.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.i.e = aui.b($$1 * 0.6662F) * 1.4F * $$2;
   }
}
