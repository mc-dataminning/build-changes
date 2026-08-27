public class fma extends fkr {
   public static final ahg a = new ahg("textures/entity/trident.png");
   private final fmv b;

   public fma(fmv $$0) {
      super(ftn::c);
      this.b = $$0;
   }

   public static fnb a() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      fne $$2 = $$1.a("pole", fna.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fmx.a);
      $$2.a("base", fna.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fmx.a);
      $$2.a("left_spike", fna.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fmx.a);
      $$2.a("middle_spike", fna.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fmx.a);
      $$2.a("right_spike", fna.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fmx.a);
      return fnb.a($$0, 32, 32);
   }

   @Override
   public void a(epz $$0, eqd $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
