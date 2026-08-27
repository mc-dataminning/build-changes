public class fqi extends foz {
   public static final ajh a = new ajh("textures/entity/trident.png");
   private final frd b;

   public fqi(frd $$0) {
      super(fxy::c);
      this.b = $$0;
   }

   public static frj a() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      frm $$2 = $$1.a("pole", fri.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), frf.a);
      $$2.a("base", fri.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), frf.a);
      $$2.a("left_spike", fri.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), frf.a);
      $$2.a("middle_spike", fri.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), frf.a);
      $$2.a("right_spike", fri.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), frf.a);
      return frj.a($$0, 32, 32);
   }

   @Override
   public void a(etz $$0, eud $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
