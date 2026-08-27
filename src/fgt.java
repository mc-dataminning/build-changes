public class fgt extends ffk {
   public static final aer a = new aer("textures/entity/trident.png");
   private final fhn b;

   public fgt(fhn $$0) {
      super(fnt::c);
      this.b = $$0;
   }

   public static fht a() {
      fhv $$0 = new fhv();
      fhw $$1 = $$0.a();
      fhw $$2 = $$1.a("pole", fhs.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fhp.a);
      $$2.a("base", fhs.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fhp.a);
      $$2.a("left_spike", fhs.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fhp.a);
      $$2.a("middle_spike", fhs.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fhp.a);
      $$2.a("right_spike", fhs.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fhp.a);
      return fht.a($$0, 32, 32);
   }

   @Override
   public void a(elg $$0, elk $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
