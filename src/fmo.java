public class fmo extends fnj {
   private static final akk a = new akk("textures/gui/demo_background.png");
   private fil b = fil.a;
   private fil c = fil.a;

   public fmo() {
      super(wu.c("demo.help.title"));
   }

   @Override
   protected void aP_() {
      int $$0 = -16;
      this.c(fhs.a(wu.c("demo.help.buy"), $$0x -> {
         $$0x.j = false;
         ac.k().a("https://aka.ms/BuyMinecraftJava");
      }).a(this.m / 2 - 116, this.n / 2 + 62 + -16, 114, 20).a());
      this.c(fhs.a(wu.c("demo.help.later"), $$0x -> {
         this.l.a(null);
         this.l.n.i();
      }).a(this.m / 2 + 2, this.n / 2 + 62 + -16, 114, 20).a());
      ffx $$1 = this.l.m;
      this.b = fil.a(
         this.o,
         wu.a("demo.help.movementShort", $$1.w.k(), $$1.x.k(), $$1.y.k(), $$1.z.k()),
         wu.c("demo.help.movementMouse"),
         wu.a("demo.help.jump", $$1.A.k()),
         wu.a("demo.help.inventory", $$1.D.k())
      );
      this.c = fil.a(this.o, wu.c("demo.help.fullWrapped"), 218);
   }

   @Override
   public void b(fhf $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = (this.m - 248) / 2;
      int $$5 = (this.n - 166) / 2;
      $$0.a(a, $$4, $$5, 0, 0, 248, 166);
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.m - 248) / 2 + 10;
      int $$5 = (this.n - 166) / 2 + 8;
      $$0.a(this.o, this.k, $$4, $$5, 2039583, false);
      $$5 = this.b.c($$0, $$4, $$5 + 12, 12, 5197647);
      this.c.c($$0, $$4, $$5 + 20, 9, 2039583);
   }
}
