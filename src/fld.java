public class fld extends fju {
   public static final agt a = new agt("textures/entity/trident.png");
   private final fly b;

   public fld(fly $$0) {
      super(fsq::c);
      this.b = $$0;
   }

   public static fme a() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      fmh $$2 = $$1.a("pole", fmd.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fma.a);
      $$2.a("base", fmd.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fma.a);
      $$2.a("left_spike", fmd.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fma.a);
      $$2.a("middle_spike", fmd.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fma.a);
      $$2.a("right_spike", fmd.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fma.a);
      return fme.a($$0, 32, 32);
   }

   @Override
   public void a(epd $$0, eph $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
