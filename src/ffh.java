public class ffh extends fgh {
   private static final ajc a = new ajc("textures/gui/demo_background.png");
   private fbd b = fbd.a;
   private fbd c = fbd.a;

   public ffh() {
      super(vs.c("demo.help.title"));
   }

   @Override
   protected void aP_() {
      int $$0 = -16;
      this.c(fak.a(vs.c("demo.help.buy"), $$0x -> {
         $$0x.j = false;
         ac.j().a("https://aka.ms/BuyMinecraftJava");
      }).a(this.g / 2 - 116, this.h / 2 + 62 + -16, 114, 20).a());
      this.c(fak.a(vs.c("demo.help.later"), $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(this.g / 2 + 2, this.h / 2 + 62 + -16, 114, 20).a());
      eyo $$1 = this.f.m;
      this.b = fbd.a(
         this.i,
         vs.a("demo.help.movementShort", $$1.x.k(), $$1.y.k(), $$1.z.k(), $$1.A.k()),
         vs.c("demo.help.movementMouse"),
         vs.a("demo.help.jump", $$1.B.k()),
         vs.a("demo.help.inventory", $$1.E.k())
      );
      this.c = fbd.a(this.i, vs.c("demo.help.fullWrapped"), 218);
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = (this.g - 248) / 2;
      int $$5 = (this.h - 166) / 2;
      $$0.a(a, $$4, $$5, 0, 0, 248, 166);
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.g - 248) / 2 + 10;
      int $$5 = (this.h - 166) / 2 + 8;
      $$0.a(this.i, this.e, $$4, $$5, 2039583, false);
      $$5 = this.b.c($$0, $$4, $$5 + 12, 12, 5197647);
      this.c.c($$0, $$4, $$5 + 20, 9, 2039583);
   }
}
