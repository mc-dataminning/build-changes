public class fdk extends fcb {
   public static final acq a = new acq("textures/entity/trident.png");
   private final fee b;

   public fdk(fee $$0) {
      super(fkf::b);
      this.b = $$0;
   }

   public static fek a() {
      fem $$0 = new fem();
      fen $$1 = $$0.a();
      fen $$2 = $$1.a("pole", fej.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), feg.a);
      $$2.a("base", fej.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), feg.a);
      $$2.a("left_spike", fej.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), feg.a);
      $$2.a("middle_spike", fej.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), feg.a);
      $$2.a("right_spike", fej.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), feg.a);
      return fek.a($$0, 32, 32);
   }

   @Override
   public void a(eij $$0, ein $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
