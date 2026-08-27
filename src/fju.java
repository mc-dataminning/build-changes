public class fju extends fil {
   public static final agi a = new agi("textures/entity/trident.png");
   private final fko b;

   public fju(fko $$0) {
      super(frc::c);
      this.b = $$0;
   }

   public static fku a() {
      fkw $$0 = new fkw();
      fkx $$1 = $$0.a();
      fkx $$2 = $$1.a("pole", fkt.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fkq.a);
      $$2.a("base", fkt.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fkq.a);
      $$2.a("left_spike", fkt.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fkq.a);
      $$2.a("middle_spike", fkt.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fkq.a);
      $$2.a("right_spike", fkt.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fkq.a);
      return fku.a($$0, 32, 32);
   }

   @Override
   public void a(enw $$0, eoa $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
