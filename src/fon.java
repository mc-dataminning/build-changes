public class fon extends fne {
   public static final aiy a = new aiy("textures/entity/trident.png");
   private final fpj b;

   public fon(fpj $$0) {
      super(fwb::c);
      this.b = $$0;
   }

   public static fpp a() {
      fpr $$0 = new fpr();
      fps $$1 = $$0.a();
      fps $$2 = $$1.a("pole", fpo.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fpl.a);
      $$2.a("base", fpo.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fpl.a);
      $$2.a("left_spike", fpo.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fpl.a);
      $$2.a("middle_spike", fpo.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fpl.a);
      $$2.a("right_spike", fpo.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fpl.a);
      return fpp.a($$0, 32, 32);
   }

   @Override
   public void a(esh $$0, esl $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
