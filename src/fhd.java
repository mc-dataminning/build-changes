public class fhd extends ffu {
   public static final aeu a = new aeu("textures/entity/trident.png");
   private final fhx b;

   public fhd(fhx $$0) {
      super(foh::c);
      this.b = $$0;
   }

   public static fid a() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      fig $$2 = $$1.a("pole", fic.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fhz.a);
      $$2.a("base", fic.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fhz.a);
      $$2.a("left_spike", fic.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fhz.a);
      $$2.a("middle_spike", fic.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fhz.a);
      $$2.a("right_spike", fic.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fhz.a);
      return fid.a($$0, 32, 32);
   }

   @Override
   public void a(elk $$0, elo $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
