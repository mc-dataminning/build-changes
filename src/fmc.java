public class fmc extends fkt {
   public static final ahg a = new ahg("textures/entity/trident.png");
   private final fmx b;

   public fmc(fmx $$0) {
      super(ftp::c);
      this.b = $$0;
   }

   public static fnd a() {
      fnf $$0 = new fnf();
      fng $$1 = $$0.a();
      fng $$2 = $$1.a("pole", fnc.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fmz.a);
      $$2.a("base", fnc.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fmz.a);
      $$2.a("left_spike", fnc.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fmz.a);
      $$2.a("middle_spike", fnc.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fmz.a);
      $$2.a("right_spike", fnc.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fmz.a);
      return fnd.a($$0, 32, 32);
   }

   @Override
   public void a(eqb $$0, eqf $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
