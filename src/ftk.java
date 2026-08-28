public class ftk<T extends cla> extends fuk<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fxb g;
   private final fxb h;
   private final fxb i;
   private final fxb j;
   private final fxb k;
   private final fxb l;
   private final fxb m;
   private final fxb n;

   public ftk(fxb $$0) {
      super(gdx::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static fxh a(int $$0, int $$1) {
      fxj $$2 = new fxj();
      fxk $$3 = $$2.a();
      fxk $$4 = $$3.a("body", fxg.c(), fxd.a(0.0F, 0.0F, 0.0F));
      fxk $$5 = $$4.a("rods", fxg.c(), fxd.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", fxg.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxf(0.0F)), fxd.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", fxg.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxf(0.0F)), fxd.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", fxg.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxf(0.0F)), fxd.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fxk $$6 = $$4.a(
         "head",
         fxg.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fxf(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxf(0.0F)),
         fxd.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         fxg.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fxf(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxf(0.0F)),
         fxd.a(0.0F, 0.0F, 0.0F)
      );
      fxk $$7 = $$3.a("wind_body", fxg.c(), fxd.a(0.0F, 0.0F, 0.0F));
      fxk $$8 = $$7.a("wind_bottom", fxg.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fxf(0.0F)), fxd.a(0.0F, 24.0F, 0.0F));
      fxk $$9 = $$8.a(
         "wind_mid",
         fxg.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fxf(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fxf(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fxf(0.0F)),
         fxd.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         fxg.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fxf(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fxf(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fxf(0.0F)),
         fxd.a(0.0F, -6.0F, 0.0F)
      );
      return fxh.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fxb::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = ayz.b($$6) * 1.0F * 0.6F;
      this.k.d = ayz.a($$6) * 1.0F * 0.6F;
      this.l.b = ayz.a($$6) * 0.5F * 0.8F;
      this.l.d = ayz.b($$6) * 0.8F;
      this.m.b = ayz.b($$6) * -0.25F * 1.0F;
      this.m.d = ayz.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + ayz.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.bY, fgb.a, $$3);
      this.a($$0.c, fgb.c, $$3);
      this.a($$0.d, fgb.d, $$3);
      this.a($$0.e, fgb.b, $$3);
   }

   @Override
   public fxb a() {
      return this.g;
   }

   public fxb b() {
      return this.h;
   }

   public fxb c() {
      return this.i;
   }

   public fxb d() {
      return this.n;
   }

   public fxb e() {
      return this.j;
   }
}
