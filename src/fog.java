public class fog extends fmx {
   public static final aiy a = new aiy("textures/entity/trident.png");
   private final fpc b;

   public fog(fpc $$0) {
      super(fvu::c);
      this.b = $$0;
   }

   public static fpi a() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      fpl $$2 = $$1.a("pole", fph.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fpe.a);
      $$2.a("base", fph.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fpe.a);
      $$2.a("left_spike", fph.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fpe.a);
      $$2.a("middle_spike", fph.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fpe.a);
      $$2.a("right_spike", fph.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fpe.a);
      return fpi.a($$0, 32, 32);
   }

   @Override
   public void a(esa $$0, ese $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
