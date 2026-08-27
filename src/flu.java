public class flu extends fkl {
   public static final ahd a = new ahd("textures/entity/trident.png");
   private final fmp b;

   public flu(fmp $$0) {
      super(fth::c);
      this.b = $$0;
   }

   public static fmv a() {
      fmx $$0 = new fmx();
      fmy $$1 = $$0.a();
      fmy $$2 = $$1.a("pole", fmu.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fmr.a);
      $$2.a("base", fmu.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fmr.a);
      $$2.a("left_spike", fmu.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fmr.a);
      $$2.a("middle_spike", fmu.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fmr.a);
      $$2.a("right_spike", fmu.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fmr.a);
      return fmv.a($$0, 32, 32);
   }

   @Override
   public void a(ept $$0, epx $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
