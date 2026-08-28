public class ftl<T extends clb> extends ful<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fxc g;
   private final fxc h;
   private final fxc i;
   private final fxc j;
   private final fxc k;
   private final fxc l;
   private final fxc m;
   private final fxc n;

   public ftl(fxc $$0) {
      super(gdy::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static fxi a(int $$0, int $$1) {
      fxk $$2 = new fxk();
      fxl $$3 = $$2.a();
      fxl $$4 = $$3.a("body", fxh.c(), fxe.a(0.0F, 0.0F, 0.0F));
      fxl $$5 = $$4.a("rods", fxh.c(), fxe.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", fxh.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxg(0.0F)), fxe.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", fxh.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxg(0.0F)), fxe.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", fxh.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxg(0.0F)), fxe.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fxl $$6 = $$4.a(
         "head",
         fxh.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fxg(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxg(0.0F)),
         fxe.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         fxh.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fxg(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxg(0.0F)),
         fxe.a(0.0F, 0.0F, 0.0F)
      );
      fxl $$7 = $$3.a("wind_body", fxh.c(), fxe.a(0.0F, 0.0F, 0.0F));
      fxl $$8 = $$7.a("wind_bottom", fxh.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fxg(0.0F)), fxe.a(0.0F, 24.0F, 0.0F));
      fxl $$9 = $$8.a(
         "wind_mid",
         fxh.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fxg(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fxg(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fxg(0.0F)),
         fxe.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         fxh.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fxg(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fxg(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fxg(0.0F)),
         fxe.a(0.0F, -6.0F, 0.0F)
      );
      return fxi.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fxc::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = ayz.b($$6) * 1.0F * 0.6F;
      this.k.d = ayz.a($$6) * 1.0F * 0.6F;
      this.l.b = ayz.a($$6) * 0.5F * 0.8F;
      this.l.d = ayz.b($$6) * 0.8F;
      this.m.b = ayz.b($$6) * -0.25F * 1.0F;
      this.m.d = ayz.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + ayz.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.bY, fgc.a, $$3);
      this.a($$0.c, fgc.c, $$3);
      this.a($$0.d, fgc.d, $$3);
      this.a($$0.e, fgc.b, $$3);
   }

   @Override
   public fxc a() {
      return this.g;
   }

   public fxc b() {
      return this.h;
   }

   public fxc c() {
      return this.i;
   }

   public fxc d() {
      return this.n;
   }

   public fxc e() {
      return this.j;
   }
}
