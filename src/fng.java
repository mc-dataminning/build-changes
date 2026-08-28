public class fng extends fob {
   private static final akr a = akr.b("textures/gui/demo_background.png");
   private fjd b = fjd.a;
   private fjd c = fjd.a;

   public fng() {
      super(wz.c("demo.help.title"));
   }

   @Override
   protected void aT_() {
      int $$0 = -16;
      this.c(fik.a(wz.c("demo.help.buy"), $$0x -> {
         $$0x.j = false;
         ad.k().a(axj.f);
      }).a(this.m / 2 - 116, this.n / 2 + 62 + -16, 114, 20).a());
      this.c(fik.a(wz.c("demo.help.later"), $$0x -> {
         this.l.a(null);
         this.l.n.i();
      }).a(this.m / 2 + 2, this.n / 2 + 62 + -16, 114, 20).a());
      fgq $$1 = this.l.m;
      this.b = fjd.a(
         this.o,
         wz.a("demo.help.movementShort", $$1.w.k(), $$1.x.k(), $$1.y.k(), $$1.z.k()),
         wz.c("demo.help.movementMouse"),
         wz.a("demo.help.jump", $$1.A.k()),
         wz.a("demo.help.inventory", $$1.D.k())
      );
      this.c = fjd.a(this.o, wz.c("demo.help.fullWrapped"), 218);
   }

   @Override
   public void b(fhx $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = (this.m - 248) / 2;
      int $$5 = (this.n - 166) / 2;
      $$0.a(a, $$4, $$5, 0, 0, 248, 166);
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.m - 248) / 2 + 10;
      int $$5 = (this.n - 166) / 2 + 8;
      $$0.a(this.o, this.k, $$4, $$5, 2039583, false);
      $$5 = this.b.c($$0, $$4, $$5 + 12, 12, 5197647);
      this.c.c($$0, $$4, $$5 + 20, 9, 2039583);
   }
}
