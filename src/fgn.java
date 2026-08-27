public class fgn<T extends bww> extends fdl<T> {
   private static final float a = 9.0F;
   private static final float b = 100.0F;
   private final fhn f;
   private final fhn g;

   public fgn(fhn $$0) {
      super(0.5F, 24.0F);
      this.f = $$0.b("root");
      this.g = this.f.b("bone").b("body").b("head");
   }

   public static fht b() {
      fhv $$0 = new fhv();
      fhw $$1 = $$0.a().a("root", fhs.c(), fhp.a(0.0F, 5.0F, 0.0F));
      fhw $$2 = $$1.a("bone", fhs.c(), fhp.a(0.0F, 0.0F, 0.0F));
      fhw $$3 = $$2.a(
         "body",
         fhs.c()
            .a(62, 68)
            .a(-12.5F, -14.0F, -20.0F, 25.0F, 29.0F, 40.0F, new fhr(0.0F))
            .a(62, 0)
            .a(-12.5F, -14.0F, -20.0F, 25.0F, 24.0F, 40.0F, new fhr(0.5F))
            .a(87, 68)
            .a(-12.5F, 12.0F, -20.0F, 25.0F, 0.0F, 40.0F, new fhr(0.0F)),
         fhp.a(0.0F, 0.0F, 0.0F)
      );
      $$2.a("right_front_leg", fhs.c().a(32, 87).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new fhr(0.0F)), fhp.a(-7.5F, 10.0F, -15.0F));
      $$2.a("right_mid_leg", fhs.c().a(32, 105).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new fhr(0.0F)), fhp.a(-7.5F, 10.0F, 0.0F));
      $$2.a("right_hind_leg", fhs.c().a(32, 123).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new fhr(0.0F)), fhp.a(-7.5F, 10.0F, 15.0F));
      $$2.a("left_front_leg", fhs.c().a(0, 87).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new fhr(0.0F)), fhp.a(7.5F, 10.0F, -15.0F));
      $$2.a("left_mid_leg", fhs.c().a(0, 105).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new fhr(0.0F)), fhp.a(7.5F, 10.0F, 0.0F));
      $$2.a("left_hind_leg", fhs.c().a(0, 123).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new fhr(0.0F)), fhp.a(7.5F, 10.0F, 15.0F));
      fhw $$4 = $$3.a(
         "head",
         fhs.c().a(8, 15).a(-6.5F, -7.5F, -11.5F, 13.0F, 18.0F, 11.0F, new fhr(0.0F)).a(8, 4).a(-6.5F, 7.5F, -11.5F, 13.0F, 0.0F, 11.0F, new fhr(0.0F)),
         fhp.a(0.0F, 6.5F, -19.48F)
      );
      $$4.a("left_ear", fhs.c().a(2, 0).a(0.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new fhr(0.0F)), fhp.a(6.51F, -7.5F, -4.51F));
      $$4.a("right_ear", fhs.c().a(48, 0).a(-1.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new fhr(0.0F)), fhp.a(-6.51F, -7.5F, -4.51F));
      $$4.a("nose", fhs.c().a(10, 45).a(-6.5F, -2.0F, -9.0F, 13.0F, 2.0F, 9.0F, new fhr(0.0F)), fhp.a(0.0F, -4.5F, -11.5F));
      $$4.a("lower_beak", fhs.c().a(10, 57).a(-6.5F, -7.0F, -8.0F, 13.0F, 12.0F, 9.0F, new fhr(0.0F)), fhp.a(0.0F, 2.5F, -12.5F));
      return fht.a($$0, 192, 192);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fhn::c);
      this.g.e = $$5 * (float) (Math.PI / 180.0);
      this.g.f = $$4 * (float) (Math.PI / 180.0);
      if ($$0.q()) {
         this.a(eri.e, $$1, $$2, 9.0F, 100.0F);
      } else {
         this.a(eri.d, $$1, $$2, 9.0F, 100.0F);
      }

      this.a($$0.bX, eri.f, $$3);
      this.a($$0.bW, eri.c, $$3);
      this.a($$0.bY, eri.g, $$3);
      this.a($$0.bT, eri.i, $$3);
      this.a($$0.bU, eri.b, $$3);
      if (this.e) {
         this.a(eri.a);
      }
   }

   @Override
   public fhn a() {
      return this.f;
   }
}
