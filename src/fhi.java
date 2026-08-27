public class fhi extends ffz {
   public static final aex a = new aex("textures/entity/trident.png");
   private final fic b;

   public fhi(fic $$0) {
      super(fom::c);
      this.b = $$0;
   }

   public static fii a() {
      fik $$0 = new fik();
      fil $$1 = $$0.a();
      fil $$2 = $$1.a("pole", fih.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fie.a);
      $$2.a("base", fih.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fie.a);
      $$2.a("left_spike", fih.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fie.a);
      $$2.a("middle_spike", fih.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fie.a);
      $$2.a("right_spike", fih.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fie.a);
      return fii.a($$0, 32, 32);
   }

   @Override
   public void a(elp $$0, elt $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
