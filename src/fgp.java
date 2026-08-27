public class fgp extends ffg {
   public static final aep a = new aep("textures/entity/trident.png");
   private final fhj b;

   public fgp(fhj $$0) {
      super(fno::b);
      this.b = $$0;
   }

   public static fhp a() {
      fhr $$0 = new fhr();
      fhs $$1 = $$0.a();
      fhs $$2 = $$1.a("pole", fho.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fhl.a);
      $$2.a("base", fho.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fhl.a);
      $$2.a("left_spike", fho.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fhl.a);
      $$2.a("middle_spike", fho.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fhl.a);
      $$2.a("right_spike", fho.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fhl.a);
      return fhp.a($$0, 32, 32);
   }

   @Override
   public void a(elh $$0, ell $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
