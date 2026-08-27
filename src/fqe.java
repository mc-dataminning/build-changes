public class fqe<T extends cic> extends fre<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final ftv g;
   private final ftv h;
   private final ftv i;
   private final ftv j;
   private final ftv k;
   private final ftv l;
   private final ftv m;
   private final ftv n;

   public fqe(ftv $$0) {
      super(gaq::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static fub a(int $$0, int $$1) {
      fud $$2 = new fud();
      fue $$3 = $$2.a();
      fue $$4 = $$3.a("body", fua.c(), ftx.a(0.0F, 0.0F, 0.0F));
      fue $$5 = $$4.a("rods", fua.c(), ftx.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", fua.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new ftz(0.0F)), ftx.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", fua.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new ftz(0.0F)), ftx.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", fua.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new ftz(0.0F)), ftx.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fue $$6 = $$4.a(
         "head",
         fua.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new ftz(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new ftz(0.0F)),
         ftx.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         fua.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new ftz(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new ftz(0.0F)),
         ftx.a(0.0F, 0.0F, 0.0F)
      );
      fue $$7 = $$3.a("wind_body", fua.c(), ftx.a(0.0F, 0.0F, 0.0F));
      fue $$8 = $$7.a("wind_bottom", fua.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new ftz(0.0F)), ftx.a(0.0F, 24.0F, 0.0F));
      fue $$9 = $$8.a(
         "wind_mid",
         fua.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new ftz(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new ftz(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new ftz(0.0F)),
         ftx.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         fua.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new ftz(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new ftz(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new ftz(0.0F)),
         ftx.a(0.0F, -6.0F, 0.0F)
      );
      return fub.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(ftv::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = axm.b($$6) * 1.0F * 0.6F;
      this.k.d = axm.a($$6) * 1.0F * 0.6F;
      this.l.b = axm.a($$6) * 0.5F * 0.8F;
      this.l.d = axm.b($$6) * 0.8F;
      this.m.b = axm.b($$6) * -0.25F * 1.0F;
      this.m.d = axm.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + axm.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.bX, fcu.a, $$3);
      this.a($$0.c, fcu.c, $$3);
      this.a($$0.d, fcu.d, $$3);
      this.a($$0.e, fcu.b, $$3);
   }

   @Override
   public ftv a() {
      return this.g;
   }

   public ftv b() {
      return this.h;
   }

   public ftv c() {
      return this.i;
   }

   public ftv d() {
      return this.n;
   }

   public ftv e() {
      return this.j;
   }
}
