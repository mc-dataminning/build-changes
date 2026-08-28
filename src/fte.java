public class fte<T extends cku> extends fue<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fwv g;
   private final fwv h;
   private final fwv i;
   private final fwv j;
   private final fwv k;
   private final fwv l;
   private final fwv m;
   private final fwv n;

   public fte(fwv $$0) {
      super(gdr::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static fxb a(int $$0, int $$1) {
      fxd $$2 = new fxd();
      fxe $$3 = $$2.a();
      fxe $$4 = $$3.a("body", fxa.c(), fwx.a(0.0F, 0.0F, 0.0F));
      fxe $$5 = $$4.a("rods", fxa.c(), fwx.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", fxa.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fwz(0.0F)), fwx.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", fxa.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fwz(0.0F)), fwx.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", fxa.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fwz(0.0F)), fwx.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fxe $$6 = $$4.a(
         "head",
         fxa.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fwz(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fwz(0.0F)),
         fwx.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         fxa.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fwz(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fwz(0.0F)),
         fwx.a(0.0F, 0.0F, 0.0F)
      );
      fxe $$7 = $$3.a("wind_body", fxa.c(), fwx.a(0.0F, 0.0F, 0.0F));
      fxe $$8 = $$7.a("wind_bottom", fxa.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fwz(0.0F)), fwx.a(0.0F, 24.0F, 0.0F));
      fxe $$9 = $$8.a(
         "wind_mid",
         fxa.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fwz(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fwz(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fwz(0.0F)),
         fwx.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         fxa.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fwz(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fwz(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fwz(0.0F)),
         fwx.a(0.0F, -6.0F, 0.0F)
      );
      return fxb.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fwv::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = ayu.b($$6) * 1.0F * 0.6F;
      this.k.d = ayu.a($$6) * 1.0F * 0.6F;
      this.l.b = ayu.a($$6) * 0.5F * 0.8F;
      this.l.d = ayu.b($$6) * 0.8F;
      this.m.b = ayu.b($$6) * -0.25F * 1.0F;
      this.m.d = ayu.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + ayu.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.bY, ffv.a, $$3);
      this.a($$0.c, ffv.c, $$3);
      this.a($$0.d, ffv.d, $$3);
      this.a($$0.e, ffv.b, $$3);
   }

   @Override
   public fwv a() {
      return this.g;
   }

   public fwv b() {
      return this.h;
   }

   public fwv c() {
      return this.i;
   }

   public fwv d() {
      return this.n;
   }

   public fwv e() {
      return this.j;
   }
}
