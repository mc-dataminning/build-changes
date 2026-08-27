public class fnl extends fon {
   private static final akt a = new akt("textures/gui/demo_background.png");
   private fjg b = fjg.a;
   private fjg c = fjg.a;

   public fnl() {
      super(xe.c("demo.help.title"));
   }

   @Override
   protected void aN_() {
      int $$0 = -16;
      this.c(fin.a(xe.c("demo.help.buy"), $$0x -> {
         $$0x.j = false;
         ad.j().a("https://aka.ms/BuyMinecraftJava");
      }).a(this.n / 2 - 116, this.o / 2 + 62 + -16, 114, 20).a());
      this.c(fin.a(xe.c("demo.help.later"), $$0x -> {
         this.m.a(null);
         this.m.n.i();
      }).a(this.n / 2 + 2, this.o / 2 + 62 + -16, 114, 20).a());
      fgn $$1 = this.m.m;
      this.b = fjg.a(
         this.p,
         xe.a("demo.help.movementShort", $$1.x.k(), $$1.y.k(), $$1.z.k(), $$1.A.k()),
         xe.c("demo.help.movementMouse"),
         xe.a("demo.help.jump", $$1.B.k()),
         xe.a("demo.help.inventory", $$1.E.k())
      );
      this.c = fjg.a(this.p, xe.c("demo.help.fullWrapped"), 218);
   }

   @Override
   public void b(fia $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = (this.n - 248) / 2;
      int $$5 = (this.o - 166) / 2;
      $$0.a(a, $$4, $$5, 0, 0, 248, 166);
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.n - 248) / 2 + 10;
      int $$5 = (this.o - 166) / 2 + 8;
      $$0.a(this.p, this.l, $$4, $$5, 2039583, false);
      $$5 = this.b.c($$0, $$4, $$5 + 12, 12, 5197647);
      this.c.c($$0, $$4, $$5 + 20, 9, 2039583);
   }
}
