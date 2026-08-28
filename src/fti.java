public class fti<T extends cky> extends fui<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fwz g;
   private final fwz h;
   private final fwz i;
   private final fwz j;
   private final fwz k;
   private final fwz l;
   private final fwz m;
   private final fwz n;

   public fti(fwz $$0) {
      super(gdv::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static fxf a(int $$0, int $$1) {
      fxh $$2 = new fxh();
      fxi $$3 = $$2.a();
      fxi $$4 = $$3.a("body", fxe.c(), fxb.a(0.0F, 0.0F, 0.0F));
      fxi $$5 = $$4.a("rods", fxe.c(), fxb.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", fxe.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxd(0.0F)), fxb.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", fxe.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxd(0.0F)), fxb.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", fxe.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxd(0.0F)), fxb.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fxi $$6 = $$4.a(
         "head",
         fxe.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fxd(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxd(0.0F)),
         fxb.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         fxe.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fxd(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxd(0.0F)),
         fxb.a(0.0F, 0.0F, 0.0F)
      );
      fxi $$7 = $$3.a("wind_body", fxe.c(), fxb.a(0.0F, 0.0F, 0.0F));
      fxi $$8 = $$7.a("wind_bottom", fxe.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fxd(0.0F)), fxb.a(0.0F, 24.0F, 0.0F));
      fxi $$9 = $$8.a(
         "wind_mid",
         fxe.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fxd(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fxd(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fxd(0.0F)),
         fxb.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         fxe.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fxd(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fxd(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fxd(0.0F)),
         fxb.a(0.0F, -6.0F, 0.0F)
      );
      return fxf.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fwz::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = ayy.b($$6) * 1.0F * 0.6F;
      this.k.d = ayy.a($$6) * 1.0F * 0.6F;
      this.l.b = ayy.a($$6) * 0.5F * 0.8F;
      this.l.d = ayy.b($$6) * 0.8F;
      this.m.b = ayy.b($$6) * -0.25F * 1.0F;
      this.m.d = ayy.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + ayy.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.bY, ffz.a, $$3);
      this.a($$0.c, ffz.c, $$3);
      this.a($$0.d, ffz.d, $$3);
      this.a($$0.e, ffz.b, $$3);
   }

   @Override
   public fwz a() {
      return this.g;
   }

   public fwz b() {
      return this.h;
   }

   public fwz c() {
      return this.i;
   }

   public fwz d() {
      return this.n;
   }

   public fwz e() {
      return this.j;
   }
}
