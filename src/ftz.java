public class ftz<T extends ckn> extends fuz<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fxq g;
   private final fxq h;
   private final fxq i;
   private final fxq j;
   private final fxq k;
   private final fxq l;
   private final fxq m;
   private final fxq n;

   public ftz(fxq $$0) {
      super(gen::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static fxw a(int $$0, int $$1) {
      fxy $$2 = new fxy();
      fxz $$3 = $$2.a();
      fxz $$4 = $$3.a("body", fxv.c(), fxs.a(0.0F, 0.0F, 0.0F));
      fxz $$5 = $$4.a("rods", fxv.c(), fxs.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", fxv.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxu(0.0F)), fxs.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", fxv.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxu(0.0F)), fxs.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", fxv.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxu(0.0F)), fxs.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fxz $$6 = $$4.a(
         "head",
         fxv.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fxu(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxu(0.0F)),
         fxs.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         fxv.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fxu(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxu(0.0F)),
         fxs.a(0.0F, 0.0F, 0.0F)
      );
      fxz $$7 = $$3.a("wind_body", fxv.c(), fxs.a(0.0F, 0.0F, 0.0F));
      fxz $$8 = $$7.a("wind_bottom", fxv.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fxu(0.0F)), fxs.a(0.0F, 24.0F, 0.0F));
      fxz $$9 = $$8.a(
         "wind_mid",
         fxv.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fxu(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fxu(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fxu(0.0F)),
         fxs.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         fxv.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fxu(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fxu(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fxu(0.0F)),
         fxs.a(0.0F, -6.0F, 0.0F)
      );
      return fxw.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fxq::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = ayg.b($$6) * 1.0F * 0.6F;
      this.k.d = ayg.a($$6) * 1.0F * 0.6F;
      this.l.b = ayg.a($$6) * 0.5F * 0.8F;
      this.l.d = ayg.b($$6) * 0.8F;
      this.m.b = ayg.b($$6) * -0.25F * 1.0F;
      this.m.d = ayg.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + ayg.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.ca, fgq.a, $$3);
      this.a($$0.c, fgq.c, $$3);
      this.a($$0.d, fgq.d, $$3);
      this.a($$0.e, fgq.b, $$3);
   }

   @Override
   public fxq a() {
      return this.g;
   }

   public fxq b() {
      return this.h;
   }

   public fxq c() {
      return this.i;
   }

   public fxq d() {
      return this.n;
   }

   public fxq e() {
      return this.j;
   }
}
