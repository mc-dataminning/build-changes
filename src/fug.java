public class fug extends fsx {
   public static final akh a = new akh("textures/entity/trident.png");
   private final fvb b;

   public fug(fvb $$0) {
      super(gbw::c);
      this.b = $$0;
   }

   public static fvh a() {
      fvj $$0 = new fvj();
      fvk $$1 = $$0.a();
      fvk $$2 = $$1.a("pole", fvg.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fvd.a);
      $$2.a("base", fvg.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fvd.a);
      $$2.a("left_spike", fvg.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fvd.a);
      $$2.a("middle_spike", fvg.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fvd.a);
      $$2.a("right_spike", fvg.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fvd.a);
      return fvh.a($$0, 32, 32);
   }

   @Override
   public void a(exx $$0, eyb $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
