public class fiw extends fjx {
   private static final ajv a = new ajv("textures/gui/demo_background.png");
   private fer b = fer.a;
   private fer c = fer.a;

   public fiw() {
      super(wi.c("demo.help.title"));
   }

   @Override
   protected void aM_() {
      int $$0 = -16;
      this.c(fdy.a(wi.c("demo.help.buy"), $$0x -> {
         $$0x.j = false;
         ac.j().a("https://aka.ms/BuyMinecraftJava");
      }).a(this.k / 2 - 116, this.l / 2 + 62 + -16, 114, 20).a());
      this.c(fdy.a(wi.c("demo.help.later"), $$0x -> {
         this.j.a(null);
         this.j.n.i();
      }).a(this.k / 2 + 2, this.l / 2 + 62 + -16, 114, 20).a());
      fcc $$1 = this.j.m;
      this.b = fer.a(
         this.m,
         wi.a("demo.help.movementShort", $$1.x.k(), $$1.y.k(), $$1.z.k(), $$1.A.k()),
         wi.c("demo.help.movementMouse"),
         wi.a("demo.help.jump", $$1.B.k()),
         wi.a("demo.help.inventory", $$1.E.k())
      );
      this.c = fer.a(this.m, wi.c("demo.help.fullWrapped"), 218);
   }

   @Override
   public void b(fdl $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = (this.k - 248) / 2;
      int $$5 = (this.l - 166) / 2;
      $$0.a(a, $$4, $$5, 0, 0, 248, 166);
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.k - 248) / 2 + 10;
      int $$5 = (this.l - 166) / 2 + 8;
      $$0.a(this.m, this.i, $$4, $$5, 2039583, false);
      $$5 = this.b.c($$0, $$4, $$5 + 12, 12, 5197647);
      this.c.c($$0, $$4, $$5 + 20, 9, 2039583);
   }
}
