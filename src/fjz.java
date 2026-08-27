public class fjz extends fiq {
   public static final agm a = new agm("textures/entity/trident.png");
   private final fkt b;

   public fjz(fkt $$0) {
      super(frh::c);
      this.b = $$0;
   }

   public static fkz a() {
      flb $$0 = new flb();
      flc $$1 = $$0.a();
      flc $$2 = $$1.a("pole", fky.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fkv.a);
      $$2.a("base", fky.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fkv.a);
      $$2.a("left_spike", fky.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fkv.a);
      $$2.a("middle_spike", fky.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fkv.a);
      $$2.a("right_spike", fky.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fkv.a);
      return fkz.a($$0, 32, 32);
   }

   @Override
   public void a(eob $$0, eof $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
