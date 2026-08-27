public class fta extends frr {
   public static final ajv a = new ajv("textures/entity/trident.png");
   private final ftv b;

   public fta(ftv $$0) {
      super(gaq::c);
      this.b = $$0;
   }

   public static fub a() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      fue $$2 = $$1.a("pole", fua.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), ftx.a);
      $$2.a("base", fua.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), ftx.a);
      $$2.a("left_spike", fua.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), ftx.a);
      $$2.a("middle_spike", fua.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), ftx.a);
      $$2.a("right_spike", fua.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), ftx.a);
      return fub.a($$0, 32, 32);
   }

   @Override
   public void a(ewr $$0, ewv $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
