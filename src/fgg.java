public class fgg extends fhh {
   private static final ajh a = new ajh("textures/gui/demo_background.png");
   private fcb b = fcb.a;
   private fcb c = fcb.a;

   public fgg() {
      super(vu.c("demo.help.title"));
   }

   @Override
   protected void aO_() {
      int $$0 = -16;
      this.c(fbi.a(vu.c("demo.help.buy"), $$0x -> {
         $$0x.j = false;
         ac.j().a("https://aka.ms/BuyMinecraftJava");
      }).a(this.g / 2 - 116, this.h / 2 + 62 + -16, 114, 20).a());
      this.c(fbi.a(vu.c("demo.help.later"), $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(this.g / 2 + 2, this.h / 2 + 62 + -16, 114, 20).a());
      ezm $$1 = this.f.m;
      this.b = fcb.a(
         this.i,
         vu.a("demo.help.movementShort", $$1.x.k(), $$1.y.k(), $$1.z.k(), $$1.A.k()),
         vu.c("demo.help.movementMouse"),
         vu.a("demo.help.jump", $$1.B.k()),
         vu.a("demo.help.inventory", $$1.E.k())
      );
      this.c = fcb.a(this.i, vu.c("demo.help.fullWrapped"), 218);
   }

   @Override
   public void b(fav $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = (this.g - 248) / 2;
      int $$5 = (this.h - 166) / 2;
      $$0.a(a, $$4, $$5, 0, 0, 248, 166);
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.g - 248) / 2 + 10;
      int $$5 = (this.h - 166) / 2 + 8;
      $$0.a(this.i, this.e, $$4, $$5, 2039583, false);
      $$5 = this.b.c($$0, $$4, $$5 + 12, 12, 5197647);
      this.c.c($$0, $$4, $$5 + 20, 9, 2039583);
   }
}
