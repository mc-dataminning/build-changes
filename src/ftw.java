public class ftw extends fsn {
   public static final akf a = new akf("textures/entity/trident.png");
   private final fur b;

   public ftw(fur $$0) {
      super(gbm::c);
      this.b = $$0;
   }

   public static fux a() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      fva $$2 = $$1.a("pole", fuw.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fut.a);
      $$2.a("base", fuw.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fut.a);
      $$2.a("left_spike", fuw.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fut.a);
      $$2.a("middle_spike", fuw.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fut.a);
      $$2.a("right_spike", fuw.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fut.a);
      return fux.a($$0, 32, 32);
   }

   @Override
   public void a(exn $$0, exr $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
