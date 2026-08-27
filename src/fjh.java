public class fjh extends fhy {
   public static final agg a = new agg("textures/entity/trident.png");
   private final fkb b;

   public fjh(fkb $$0) {
      super(fqp::c);
      this.b = $$0;
   }

   public static fkh a() {
      fkj $$0 = new fkj();
      fkk $$1 = $$0.a();
      fkk $$2 = $$1.a("pole", fkg.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fkd.a);
      $$2.a("base", fkg.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fkd.a);
      $$2.a("left_spike", fkg.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fkd.a);
      $$2.a("middle_spike", fkg.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fkd.a);
      $$2.a("right_spike", fkg.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fkd.a);
      return fkh.a($$0, 32, 32);
   }

   @Override
   public void a(enk $$0, eno $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
