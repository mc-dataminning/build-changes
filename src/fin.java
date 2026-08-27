public class fin extends fjo {
   private static final ajt a = new ajt("textures/gui/demo_background.png");
   private fei b = fei.a;
   private fei c = fei.a;

   public fin() {
      super(wg.c("demo.help.title"));
   }

   @Override
   protected void aN_() {
      int $$0 = -16;
      this.c(fdp.a(wg.c("demo.help.buy"), $$0x -> {
         $$0x.j = false;
         ac.j().a("https://aka.ms/BuyMinecraftJava");
      }).a(this.k / 2 - 116, this.l / 2 + 62 + -16, 114, 20).a());
      this.c(fdp.a(wg.c("demo.help.later"), $$0x -> {
         this.j.a(null);
         this.j.n.i();
      }).a(this.k / 2 + 2, this.l / 2 + 62 + -16, 114, 20).a());
      fbt $$1 = this.j.m;
      this.b = fei.a(
         this.m,
         wg.a("demo.help.movementShort", $$1.x.k(), $$1.y.k(), $$1.z.k(), $$1.A.k()),
         wg.c("demo.help.movementMouse"),
         wg.a("demo.help.jump", $$1.B.k()),
         wg.a("demo.help.inventory", $$1.E.k())
      );
      this.c = fei.a(this.m, wg.c("demo.help.fullWrapped"), 218);
   }

   @Override
   public void b(fdc $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = (this.k - 248) / 2;
      int $$5 = (this.l - 166) / 2;
      $$0.a(a, $$4, $$5, 0, 0, 248, 166);
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.k - 248) / 2 + 10;
      int $$5 = (this.l - 166) / 2 + 8;
      $$0.a(this.m, this.i, $$4, $$5, 2039583, false);
      $$5 = this.b.c($$0, $$4, $$5 + 12, 12, 5197647);
      this.c.c($$0, $$4, $$5 + 20, 9, 2039583);
   }
}
