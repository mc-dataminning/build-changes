public class fcb extends fdb {
   private static final ahg a = new ahg("textures/gui/demo_background.png");
   private exz b = exz.a;
   private exz c = exz.a;

   public fcb() {
      super(vf.c("demo.help.title"));
   }

   @Override
   protected void aN_() {
      int $$0 = -16;
      this.d(exg.a(vf.c("demo.help.buy"), $$0x -> {
         $$0x.j = false;
         ac.j().a("https://aka.ms/BuyMinecraftJava");
      }).a(this.g / 2 - 116, this.h / 2 + 62 + -16, 114, 20).a());
      this.d(exg.a(vf.c("demo.help.later"), $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(this.g / 2 + 2, this.h / 2 + 62 + -16, 114, 20).a());
      evm $$1 = this.f.m;
      this.b = exz.a(
         this.i,
         vf.a("demo.help.movementShort", $$1.x.k(), $$1.y.k(), $$1.z.k(), $$1.A.k()),
         vf.c("demo.help.movementMouse"),
         vf.a("demo.help.jump", $$1.B.k()),
         vf.a("demo.help.inventory", $$1.E.k())
      );
      this.c = exz.a(this.i, vf.c("demo.help.fullWrapped"), 218);
   }

   @Override
   public void b(ewu $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = (this.g - 248) / 2;
      int $$5 = (this.h - 166) / 2;
      $$0.a(a, $$4, $$5, 0, 0, 248, 166);
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.g - 248) / 2 + 10;
      int $$5 = (this.h - 166) / 2 + 8;
      $$0.a(this.i, this.e, $$4, $$5, 2039583, false);
      $$5 = this.b.c($$0, $$4, $$5 + 12, 12, 5197647);
      this.c.c($$0, $$4, $$5 + 20, 9, 2039583);
   }
}
