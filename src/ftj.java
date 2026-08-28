public class ftj<T extends ckz> extends fuj<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fxa g;
   private final fxa h;
   private final fxa i;
   private final fxa j;
   private final fxa k;
   private final fxa l;
   private final fxa m;
   private final fxa n;

   public ftj(fxa $$0) {
      super(gdw::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static fxg a(int $$0, int $$1) {
      fxi $$2 = new fxi();
      fxj $$3 = $$2.a();
      fxj $$4 = $$3.a("body", fxf.c(), fxc.a(0.0F, 0.0F, 0.0F));
      fxj $$5 = $$4.a("rods", fxf.c(), fxc.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", fxf.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxe(0.0F)), fxc.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", fxf.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxe(0.0F)), fxc.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", fxf.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxe(0.0F)), fxc.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fxj $$6 = $$4.a(
         "head",
         fxf.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fxe(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxe(0.0F)),
         fxc.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         fxf.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fxe(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxe(0.0F)),
         fxc.a(0.0F, 0.0F, 0.0F)
      );
      fxj $$7 = $$3.a("wind_body", fxf.c(), fxc.a(0.0F, 0.0F, 0.0F));
      fxj $$8 = $$7.a("wind_bottom", fxf.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fxe(0.0F)), fxc.a(0.0F, 24.0F, 0.0F));
      fxj $$9 = $$8.a(
         "wind_mid",
         fxf.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fxe(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fxe(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fxe(0.0F)),
         fxc.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         fxf.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fxe(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fxe(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fxe(0.0F)),
         fxc.a(0.0F, -6.0F, 0.0F)
      );
      return fxg.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fxa::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = ayz.b($$6) * 1.0F * 0.6F;
      this.k.d = ayz.a($$6) * 1.0F * 0.6F;
      this.l.b = ayz.a($$6) * 0.5F * 0.8F;
      this.l.d = ayz.b($$6) * 0.8F;
      this.m.b = ayz.b($$6) * -0.25F * 1.0F;
      this.m.d = ayz.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + ayz.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.bY, fga.a, $$3);
      this.a($$0.c, fga.c, $$3);
      this.a($$0.d, fga.d, $$3);
      this.a($$0.e, fga.b, $$3);
   }

   @Override
   public fxa a() {
      return this.g;
   }

   public fxa b() {
      return this.h;
   }

   public fxa c() {
      return this.i;
   }

   public fxa d() {
      return this.n;
   }

   public fxa e() {
      return this.j;
   }
}
