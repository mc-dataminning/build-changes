public class fmb extends fks {
   public static final ahg a = new ahg("textures/entity/trident.png");
   private final fmw b;

   public fmb(fmw $$0) {
      super(fto::c);
      this.b = $$0;
   }

   public static fnc a() {
      fne $$0 = new fne();
      fnf $$1 = $$0.a();
      fnf $$2 = $$1.a("pole", fnb.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fmy.a);
      $$2.a("base", fnb.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fmy.a);
      $$2.a("left_spike", fnb.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fmy.a);
      $$2.a("middle_spike", fnb.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fmy.a);
      $$2.a("right_spike", fnb.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fmy.a);
      return fnc.a($$0, 32, 32);
   }

   @Override
   public void a(eqa $$0, eqe $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
