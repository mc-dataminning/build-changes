public class fmo extends flf {
   public static final ahh a = new ahh("textures/entity/trident.png");
   private final fnj b;

   public fmo(fnj $$0) {
      super(fub::c);
      this.b = $$0;
   }

   public static fnp a() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      fns $$2 = $$1.a("pole", fno.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fnl.a);
      $$2.a("base", fno.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fnl.a);
      $$2.a("left_spike", fno.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fnl.a);
      $$2.a("middle_spike", fno.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fnl.a);
      $$2.a("right_spike", fno.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fnl.a);
      return fnp.a($$0, 32, 32);
   }

   @Override
   public void a(eqk $$0, eqo $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
