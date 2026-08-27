public class fqk extends fpb {
   public static final ajh a = new ajh("textures/entity/trident.png");
   private final frf b;

   public fqk(frf $$0) {
      super(fya::c);
      this.b = $$0;
   }

   public static frl a() {
      frn $$0 = new frn();
      fro $$1 = $$0.a();
      fro $$2 = $$1.a("pole", frk.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), frh.a);
      $$2.a("base", frk.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), frh.a);
      $$2.a("left_spike", frk.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), frh.a);
      $$2.a("middle_spike", frk.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), frh.a);
      $$2.a("right_spike", frk.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), frh.a);
      return frl.a($$0, 32, 32);
   }

   @Override
   public void a(eub $$0, euf $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
