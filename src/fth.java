public class fth<T extends ckx> extends fuh<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fwy g;
   private final fwy h;
   private final fwy i;
   private final fwy j;
   private final fwy k;
   private final fwy l;
   private final fwy m;
   private final fwy n;

   public fth(fwy $$0) {
      super(gdu::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static fxe a(int $$0, int $$1) {
      fxg $$2 = new fxg();
      fxh $$3 = $$2.a();
      fxh $$4 = $$3.a("body", fxd.c(), fxa.a(0.0F, 0.0F, 0.0F));
      fxh $$5 = $$4.a("rods", fxd.c(), fxa.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", fxd.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxc(0.0F)), fxa.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", fxd.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxc(0.0F)), fxa.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", fxd.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxc(0.0F)), fxa.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fxh $$6 = $$4.a(
         "head",
         fxd.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fxc(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxc(0.0F)),
         fxa.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         fxd.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fxc(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxc(0.0F)),
         fxa.a(0.0F, 0.0F, 0.0F)
      );
      fxh $$7 = $$3.a("wind_body", fxd.c(), fxa.a(0.0F, 0.0F, 0.0F));
      fxh $$8 = $$7.a("wind_bottom", fxd.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fxc(0.0F)), fxa.a(0.0F, 24.0F, 0.0F));
      fxh $$9 = $$8.a(
         "wind_mid",
         fxd.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fxc(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fxc(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fxc(0.0F)),
         fxa.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         fxd.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fxc(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fxc(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fxc(0.0F)),
         fxa.a(0.0F, -6.0F, 0.0F)
      );
      return fxe.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fwy::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = ayx.b($$6) * 1.0F * 0.6F;
      this.k.d = ayx.a($$6) * 1.0F * 0.6F;
      this.l.b = ayx.a($$6) * 0.5F * 0.8F;
      this.l.d = ayx.b($$6) * 0.8F;
      this.m.b = ayx.b($$6) * -0.25F * 1.0F;
      this.m.d = ayx.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + ayx.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.bY, ffy.a, $$3);
      this.a($$0.c, ffy.c, $$3);
      this.a($$0.d, ffy.d, $$3);
      this.a($$0.e, ffy.b, $$3);
   }

   @Override
   public fwy a() {
      return this.g;
   }

   public fwy b() {
      return this.h;
   }

   public fwy c() {
      return this.i;
   }

   public fwy d() {
      return this.n;
   }

   public fwy e() {
      return this.j;
   }
}
