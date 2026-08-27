public class ftq<T extends cfk> extends fql<T> {
   private static final float a = 9.0F;
   private static final float b = 100.0F;
   private final fur f;
   private final fur g;

   public ftq(fur $$0) {
      super(0.5F, 24.0F);
      this.f = $$0.b("root");
      this.g = this.f.b("bone").b("body").b("head");
   }

   public static fux b() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a().a("root", fuw.c(), fut.a(0.0F, 5.0F, 0.0F));
      fva $$2 = $$1.a("bone", fuw.c(), fut.a(0.0F, 0.0F, 0.0F));
      fva $$3 = $$2.a(
         "body",
         fuw.c()
            .a(62, 68)
            .a(-12.5F, -14.0F, -20.0F, 25.0F, 29.0F, 40.0F, new fuv(0.0F))
            .a(62, 0)
            .a(-12.5F, -14.0F, -20.0F, 25.0F, 24.0F, 40.0F, new fuv(0.5F))
            .a(87, 68)
            .a(-12.5F, 12.0F, -20.0F, 25.0F, 0.0F, 40.0F, new fuv(0.0F)),
         fut.a(0.0F, 0.0F, 0.0F)
      );
      $$2.a("right_front_leg", fuw.c().a(32, 87).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new fuv(0.0F)), fut.a(-7.5F, 10.0F, -15.0F));
      $$2.a("right_mid_leg", fuw.c().a(32, 105).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new fuv(0.0F)), fut.a(-7.5F, 10.0F, 0.0F));
      $$2.a("right_hind_leg", fuw.c().a(32, 123).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new fuv(0.0F)), fut.a(-7.5F, 10.0F, 15.0F));
      $$2.a("left_front_leg", fuw.c().a(0, 87).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new fuv(0.0F)), fut.a(7.5F, 10.0F, -15.0F));
      $$2.a("left_mid_leg", fuw.c().a(0, 105).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new fuv(0.0F)), fut.a(7.5F, 10.0F, 0.0F));
      $$2.a("left_hind_leg", fuw.c().a(0, 123).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new fuv(0.0F)), fut.a(7.5F, 10.0F, 15.0F));
      fva $$4 = $$3.a(
         "head",
         fuw.c().a(8, 15).a(-6.5F, -7.5F, -11.5F, 13.0F, 18.0F, 11.0F, new fuv(0.0F)).a(8, 4).a(-6.5F, 7.5F, -11.5F, 13.0F, 0.0F, 11.0F, new fuv(0.0F)),
         fut.a(0.0F, 6.5F, -19.48F)
      );
      $$4.a("left_ear", fuw.c().a(2, 0).a(0.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new fuv(0.0F)), fut.a(6.51F, -7.5F, -4.51F));
      $$4.a("right_ear", fuw.c().a(48, 0).a(-1.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new fuv(0.0F)), fut.a(-6.51F, -7.5F, -4.51F));
      $$4.a("nose", fuw.c().a(10, 45).a(-6.5F, -2.0F, -9.0F, 13.0F, 2.0F, 9.0F, new fuv(0.0F)), fut.a(0.0F, -4.5F, -11.5F));
      $$4.a("lower_beak", fuw.c().a(10, 57).a(-6.5F, -7.0F, -8.0F, 13.0F, 12.0F, 9.0F, new fuv(0.0F)), fut.a(0.0F, 2.5F, -12.5F));
      return fux.a($$0, 192, 192);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fur::c);
      this.g.e = $$5 * (float) (Math.PI / 180.0);
      this.g.f = $$4 * (float) (Math.PI / 180.0);
      if ($$0.u()) {
         this.a(fdt.e, $$1, $$2, 9.0F, 100.0F);
      } else {
         this.a(fdt.d, $$1, $$2, 9.0F, 100.0F);
      }

      this.a($$0.cc, fdt.f, $$3);
      this.a($$0.cb, fdt.c, $$3);
      this.a($$0.cd, fdt.g, $$3);
      this.a($$0.bY, fdt.i, $$3);
      this.a($$0.bZ, fdt.b, $$3);
      if (this.e) {
         this.a(fdt.a);
      }
   }

   @Override
   public fur a() {
      return this.f;
   }
}
