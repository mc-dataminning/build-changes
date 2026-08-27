public class fic extends fgt {
   public static final afw a = new afw("textures/entity/trident.png");
   private final fiw b;

   public fic(fiw $$0) {
      super(fpj::c);
      this.b = $$0;
   }

   public static fjc a() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      fjf $$2 = $$1.a("pole", fjb.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fiy.a);
      $$2.a("base", fjb.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fiy.a);
      $$2.a("left_spike", fjb.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fiy.a);
      $$2.a("middle_spike", fjb.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fiy.a);
      $$2.a("right_spike", fjb.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fiy.a);
      return fjc.a($$0, 32, 32);
   }

   @Override
   public void a(emh $$0, eml $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
