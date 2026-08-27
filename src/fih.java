public class fih<T extends ccv> extends fjh<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fly g;
   private final fly h;
   private final fly i;
   private final fly j;
   private final fly k;
   private final fly l;
   private final fly m;

   public fih(fly $$0) {
      super(fsq::i);
      this.g = $$0;
      this.i = $$0.b("wind_body");
      this.l = this.i.b("wind_bottom");
      this.k = this.l.b("wind_mid");
      this.j = this.k.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.m = $$0.b("body").b("rods");
   }

   public static fme b() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      fmh $$2 = $$1.a("body", fmd.c(), fma.a(0.0F, 0.0F, 0.0F));
      fmh $$3 = $$2.a("rods", fmd.c(), fma.a(0.0F, 8.0F, 0.0F));
      $$3.a("rod_1", fmd.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fmc(0.0F)), fma.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$3.a("rod_2", fmd.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fmc(0.0F)), fma.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$3.a("rod_3", fmd.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fmc(0.0F)), fma.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fmh $$4 = $$2.a("head", fmd.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fmc(0.0F)), fma.a(0.0F, 4.0F, 0.0F));
      fmh $$5 = $$1.a("wind_body", fmd.c(), fma.a(0.0F, 0.0F, 0.0F));
      fmh $$6 = $$5.a("wind_bottom", fmd.c(), fma.a(0.0F, 24.0F, 0.0F));
      fmh $$7 = $$6.a("wind_mid", fmd.c(), fma.a(0.0F, -7.0F, 0.0F));
      $$7.a("wind_top", fmd.c(), fma.a(0.0F, -6.0F, 0.0F));
      return fme.a($$0, 32, 32);
   }

   public static fme c() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      fmh $$2 = $$1.a("body", fmd.c(), fma.a(0.0F, 0.0F, 0.0F));
      fmh $$3 = $$2.a("rods", fmd.c(), fma.a(0.0F, 8.0F, 0.0F));
      fmh $$4 = $$2.a("head", fmd.c(), fma.a(0.0F, 4.0F, 0.0F));
      $$4.a(
         "eyes",
         fmd.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fmc(0.0F)).a(7, 16).a(-4.0F, -2.0F, -4.0F, 8.0F, 1.0F, 1.0F, new fmc(0.0F)),
         fma.a(0.0F, 0.0F, 0.0F)
      );
      fmh $$5 = $$1.a("wind_body", fmd.c(), fma.a(0.0F, 0.0F, 0.0F));
      fmh $$6 = $$5.a("wind_bottom", fmd.c(), fma.a(0.0F, 24.0F, 0.0F));
      fmh $$7 = $$6.a("wind_mid", fmd.c(), fma.a(0.0F, -7.0F, 0.0F));
      $$7.a("wind_top", fmd.c(), fma.a(0.0F, -6.0F, 0.0F));
      return fme.a($$0, 32, 32);
   }

   public static fme d() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      fmh $$2 = $$1.a("body", fmd.c(), fma.a(0.0F, 0.0F, 0.0F));
      fmh $$3 = $$2.a("rods", fmd.c(), fma.a(0.0F, 8.0F, 0.0F));
      $$2.a("head", fmd.c(), fma.a(0.0F, 4.0F, 0.0F));
      fmh $$4 = $$1.a("wind_body", fmd.c(), fma.a(0.0F, 0.0F, 0.0F));
      fmh $$5 = $$4.a("wind_bottom", fmd.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fmc(0.0F)), fma.a(0.0F, 24.0F, 0.0F));
      fmh $$6 = $$5.a(
         "wind_mid",
         fmd.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fmc(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fmc(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fmc(0.0F)),
         fma.a(0.0F, -7.0F, 0.0F)
      );
      $$6.a(
         "wind_top",
         fmd.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fmc(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fmc(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fmc(0.0F)),
         fma.a(0.0F, -6.0F, 0.0F)
      );
      return fme.a($$0, 128, 128);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fly::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.j.b = aty.b($$6) * 1.0F * 0.6F;
      this.j.d = aty.a($$6) * 1.0F * 0.6F;
      this.k.b = aty.a($$6) * 0.5F * 0.8F;
      this.k.d = aty.b($$6) * 0.8F;
      this.l.b = aty.b($$6) * -0.25F * 1.0F;
      this.l.d = aty.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + aty.b($$6) / 4.0F;
      this.m.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.e, evf.a, $$3);
      this.a($$0.c, evf.c, $$3);
      this.a($$0.d, evf.b, $$3);
   }

   @Override
   public fly a() {
      return this.g;
   }

   public fly e() {
      return this.j;
   }

   public fly f() {
      return this.k;
   }

   public fly g() {
      return this.l;
   }
}
