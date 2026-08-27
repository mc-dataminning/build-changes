public class flv<T extends caj> extends fis<T> {
   private static final float a = 9.0F;
   private static final float b = 100.0F;
   private final fmw f;
   private final fmw g;

   public flv(fmw $$0) {
      super(0.5F, 24.0F);
      this.f = $$0.b("root");
      this.g = this.f.b("bone").b("body").b("head");
   }

   public static fnc b() {
      fne $$0 = new fne();
      fnf $$1 = $$0.a().a("root", fnb.c(), fmy.a(0.0F, 5.0F, 0.0F));
      fnf $$2 = $$1.a("bone", fnb.c(), fmy.a(0.0F, 0.0F, 0.0F));
      fnf $$3 = $$2.a(
         "body",
         fnb.c()
            .a(62, 68)
            .a(-12.5F, -14.0F, -20.0F, 25.0F, 29.0F, 40.0F, new fna(0.0F))
            .a(62, 0)
            .a(-12.5F, -14.0F, -20.0F, 25.0F, 24.0F, 40.0F, new fna(0.5F))
            .a(87, 68)
            .a(-12.5F, 12.0F, -20.0F, 25.0F, 0.0F, 40.0F, new fna(0.0F)),
         fmy.a(0.0F, 0.0F, 0.0F)
      );
      $$2.a("right_front_leg", fnb.c().a(32, 87).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new fna(0.0F)), fmy.a(-7.5F, 10.0F, -15.0F));
      $$2.a("right_mid_leg", fnb.c().a(32, 105).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new fna(0.0F)), fmy.a(-7.5F, 10.0F, 0.0F));
      $$2.a("right_hind_leg", fnb.c().a(32, 123).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new fna(0.0F)), fmy.a(-7.5F, 10.0F, 15.0F));
      $$2.a("left_front_leg", fnb.c().a(0, 87).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new fna(0.0F)), fmy.a(7.5F, 10.0F, -15.0F));
      $$2.a("left_mid_leg", fnb.c().a(0, 105).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new fna(0.0F)), fmy.a(7.5F, 10.0F, 0.0F));
      $$2.a("left_hind_leg", fnb.c().a(0, 123).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new fna(0.0F)), fmy.a(7.5F, 10.0F, 15.0F));
      fnf $$4 = $$3.a(
         "head",
         fnb.c().a(8, 15).a(-6.5F, -7.5F, -11.5F, 13.0F, 18.0F, 11.0F, new fna(0.0F)).a(8, 4).a(-6.5F, 7.5F, -11.5F, 13.0F, 0.0F, 11.0F, new fna(0.0F)),
         fmy.a(0.0F, 6.5F, -19.48F)
      );
      $$4.a("left_ear", fnb.c().a(2, 0).a(0.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new fna(0.0F)), fmy.a(6.51F, -7.5F, -4.51F));
      $$4.a("right_ear", fnb.c().a(48, 0).a(-1.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new fna(0.0F)), fmy.a(-6.51F, -7.5F, -4.51F));
      $$4.a("nose", fnb.c().a(10, 45).a(-6.5F, -2.0F, -9.0F, 13.0F, 2.0F, 9.0F, new fna(0.0F)), fmy.a(0.0F, -4.5F, -11.5F));
      $$4.a("lower_beak", fnb.c().a(10, 57).a(-6.5F, -7.0F, -8.0F, 13.0F, 12.0F, 9.0F, new fna(0.0F)), fmy.a(0.0F, 2.5F, -12.5F));
      return fnc.a($$0, 192, 192);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fmw::c);
      this.g.e = $$5 * (float) (Math.PI / 180.0);
      this.g.f = $$4 * (float) (Math.PI / 180.0);
      if ($$0.w()) {
         this.a(ewf.e, $$1, $$2, 9.0F, 100.0F);
      } else {
         this.a(ewf.d, $$1, $$2, 9.0F, 100.0F);
      }

      this.a($$0.bX, ewf.f, $$3);
      this.a($$0.bW, ewf.c, $$3);
      this.a($$0.bY, ewf.g, $$3);
      this.a($$0.bT, ewf.i, $$3);
      this.a($$0.bU, ewf.b, $$3);
      if (this.e) {
         this.a(ewf.a);
      }
   }

   @Override
   public fmw a() {
      return this.f;
   }
}
