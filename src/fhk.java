public class fhk extends fgb {
   public static final aey a = new aey("textures/entity/trident.png");
   private final fie b;

   public fhk(fie $$0) {
      super(foo::c);
      this.b = $$0;
   }

   public static fik a() {
      fim $$0 = new fim();
      fin $$1 = $$0.a();
      fin $$2 = $$1.a("pole", fij.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fig.a);
      $$2.a("base", fij.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fig.a);
      $$2.a("left_spike", fij.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fig.a);
      $$2.a("middle_spike", fij.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fig.a);
      $$2.a("right_spike", fij.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fig.a);
      return fik.a($$0, 32, 32);
   }

   @Override
   public void a(elr $$0, elv $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
