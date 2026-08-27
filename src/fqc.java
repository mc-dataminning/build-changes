public class fqc<T extends cds> extends fmx<T> {
   private static final float a = 9.0F;
   private static final float b = 100.0F;
   private final frd f;
   private final frd g;

   public fqc(frd $$0) {
      super(0.5F, 24.0F);
      this.f = $$0.b("root");
      this.g = this.f.b("bone").b("body").b("head");
   }

   public static frj b() {
      frl $$0 = new frl();
      frm $$1 = $$0.a().a("root", fri.c(), frf.a(0.0F, 5.0F, 0.0F));
      frm $$2 = $$1.a("bone", fri.c(), frf.a(0.0F, 0.0F, 0.0F));
      frm $$3 = $$2.a(
         "body",
         fri.c()
            .a(62, 68)
            .a(-12.5F, -14.0F, -20.0F, 25.0F, 29.0F, 40.0F, new frh(0.0F))
            .a(62, 0)
            .a(-12.5F, -14.0F, -20.0F, 25.0F, 24.0F, 40.0F, new frh(0.5F))
            .a(87, 68)
            .a(-12.5F, 12.0F, -20.0F, 25.0F, 0.0F, 40.0F, new frh(0.0F)),
         frf.a(0.0F, 0.0F, 0.0F)
      );
      $$2.a("right_front_leg", fri.c().a(32, 87).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new frh(0.0F)), frf.a(-7.5F, 10.0F, -15.0F));
      $$2.a("right_mid_leg", fri.c().a(32, 105).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new frh(0.0F)), frf.a(-7.5F, 10.0F, 0.0F));
      $$2.a("right_hind_leg", fri.c().a(32, 123).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new frh(0.0F)), frf.a(-7.5F, 10.0F, 15.0F));
      $$2.a("left_front_leg", fri.c().a(0, 87).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new frh(0.0F)), frf.a(7.5F, 10.0F, -15.0F));
      $$2.a("left_mid_leg", fri.c().a(0, 105).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new frh(0.0F)), frf.a(7.5F, 10.0F, 0.0F));
      $$2.a("left_hind_leg", fri.c().a(0, 123).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new frh(0.0F)), frf.a(7.5F, 10.0F, 15.0F));
      frm $$4 = $$3.a(
         "head",
         fri.c().a(8, 15).a(-6.5F, -7.5F, -11.5F, 13.0F, 18.0F, 11.0F, new frh(0.0F)).a(8, 4).a(-6.5F, 7.5F, -11.5F, 13.0F, 0.0F, 11.0F, new frh(0.0F)),
         frf.a(0.0F, 6.5F, -19.48F)
      );
      $$4.a("left_ear", fri.c().a(2, 0).a(0.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new frh(0.0F)), frf.a(6.51F, -7.5F, -4.51F));
      $$4.a("right_ear", fri.c().a(48, 0).a(-1.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new frh(0.0F)), frf.a(-6.51F, -7.5F, -4.51F));
      $$4.a("nose", fri.c().a(10, 45).a(-6.5F, -2.0F, -9.0F, 13.0F, 2.0F, 9.0F, new frh(0.0F)), frf.a(0.0F, -4.5F, -11.5F));
      $$4.a("lower_beak", fri.c().a(10, 57).a(-6.5F, -7.0F, -8.0F, 13.0F, 12.0F, 9.0F, new frh(0.0F)), frf.a(0.0F, 2.5F, -12.5F));
      return frj.a($$0, 192, 192);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(frd::c);
      this.g.e = $$5 * (float) (Math.PI / 180.0);
      this.g.f = $$4 * (float) (Math.PI / 180.0);
      if ($$0.s()) {
         this.a(faf.e, $$1, $$2, 9.0F, 100.0F);
      } else {
         this.a(faf.d, $$1, $$2, 9.0F, 100.0F);
      }

      this.a($$0.cb, faf.f, $$3);
      this.a($$0.ca, faf.c, $$3);
      this.a($$0.cc, faf.g, $$3);
      this.a($$0.bX, faf.i, $$3);
      this.a($$0.bY, faf.b, $$3);
      if (this.e) {
         this.a(faf.a);
      }
   }

   @Override
   public frd a() {
      return this.f;
   }
}
