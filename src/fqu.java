public class fqu extends frp {
   private static final all a = all.b("textures/gui/demo_background.png");
   private static final int b = 256;
   private static final int c = 256;
   private fmp d = fmp.a;
   private fmp s = fmp.a;

   public fqu() {
      super(xl.c("demo.help.title"));
   }

   @Override
   protected void aS_() {
      int $$0 = -16;
      this.c(flw.a(xl.c("demo.help.buy"), $$0x -> {
         $$0x.j = false;
         ae.m().a(ayj.f);
      }).a(this.n / 2 - 116, this.o / 2 + 62 + -16, 114, 20).a());
      this.c(flw.a(xl.c("demo.help.later"), $$0x -> {
         this.m.a(null);
         this.m.o.i();
      }).a(this.n / 2 + 2, this.o / 2 + 62 + -16, 114, 20).a());
      fkb $$1 = this.m.n;
      this.d = fmp.a(
         this.p,
         xl.a("demo.help.movementShort", $$1.v.k(), $$1.w.k(), $$1.x.k(), $$1.y.k()),
         xl.c("demo.help.movementMouse"),
         xl.a("demo.help.jump", $$1.z.k()),
         xl.a("demo.help.inventory", $$1.C.k())
      );
      this.s = fmp.a(this.p, xl.c("demo.help.fullWrapped"), 218);
   }

   @Override
   public void b(flj $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = (this.n - 248) / 2;
      int $$5 = (this.o - 166) / 2;
      $$0.a(gjh::B, a, $$4, $$5, 0.0F, 0.0F, 248, 166, 256, 256);
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.n - 248) / 2 + 10;
      int $$5 = (this.o - 166) / 2 + 8;
      $$0.a(this.p, this.l, $$4, $$5, 2039583, false);
      $$5 = this.d.c($$0, $$4, $$5 + 12, 12, 5197647);
      this.s.c($$0, $$4, $$5 + 20, 9, 2039583);
   }
}
