public class frk<T extends cjj> extends fsk<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fvb g;
   private final fvb h;
   private final fvb i;
   private final fvb j;
   private final fvb k;
   private final fvb l;
   private final fvb m;
   private final fvb n;

   public frk(fvb $$0) {
      super(gbw::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static fvh a(int $$0, int $$1) {
      fvj $$2 = new fvj();
      fvk $$3 = $$2.a();
      fvk $$4 = $$3.a("body", fvg.c(), fvd.a(0.0F, 0.0F, 0.0F));
      fvk $$5 = $$4.a("rods", fvg.c(), fvd.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", fvg.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fvf(0.0F)), fvd.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", fvg.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fvf(0.0F)), fvd.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", fvg.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fvf(0.0F)), fvd.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fvk $$6 = $$4.a(
         "head",
         fvg.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fvf(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fvf(0.0F)),
         fvd.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         fvg.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fvf(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fvf(0.0F)),
         fvd.a(0.0F, 0.0F, 0.0F)
      );
      fvk $$7 = $$3.a("wind_body", fvg.c(), fvd.a(0.0F, 0.0F, 0.0F));
      fvk $$8 = $$7.a("wind_bottom", fvg.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fvf(0.0F)), fvd.a(0.0F, 24.0F, 0.0F));
      fvk $$9 = $$8.a(
         "wind_mid",
         fvg.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fvf(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fvf(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fvf(0.0F)),
         fvd.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         fvg.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fvf(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fvf(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fvf(0.0F)),
         fvd.a(0.0F, -6.0F, 0.0F)
      );
      return fvh.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fvb::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = axz.b($$6) * 1.0F * 0.6F;
      this.k.d = axz.a($$6) * 1.0F * 0.6F;
      this.l.b = axz.a($$6) * 0.5F * 0.8F;
      this.l.d = axz.b($$6) * 0.8F;
      this.m.b = axz.b($$6) * -0.25F * 1.0F;
      this.m.d = axz.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + axz.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.bY, fea.a, $$3);
      this.a($$0.c, fea.c, $$3);
      this.a($$0.d, fea.d, $$3);
      this.a($$0.e, fea.b, $$3);
   }

   @Override
   public fvb a() {
      return this.g;
   }

   public fvb b() {
      return this.h;
   }

   public fvb c() {
      return this.i;
   }

   public fvb d() {
      return this.n;
   }

   public fvb e() {
      return this.j;
   }
}
