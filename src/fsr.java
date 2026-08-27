public class fsr extends fri {
   public static final ajt a = new ajt("textures/entity/trident.png");
   private final ftm b;

   public fsr(ftm $$0) {
      super(gah::c);
      this.b = $$0;
   }

   public static fts a() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      ftv $$2 = $$1.a("pole", ftr.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fto.a);
      $$2.a("base", ftr.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fto.a);
      $$2.a("left_spike", ftr.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fto.a);
      $$2.a("middle_spike", ftr.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fto.a);
      $$2.a("right_spike", ftr.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fto.a);
      return fts.a($$0, 32, 32);
   }

   @Override
   public void a(ewi $$0, ewm $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
