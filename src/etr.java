public class etr extends euq {
   private static final acq a = new acq("textures/gui/demo_background.png");
   private epz b = epz.a;
   private epz c = epz.a;

   public etr() {
      super(sw.c("demo.help.title"));
   }

   @Override
   protected void b() {
      int $$0 = -16;
      this.d(epi.a(sw.c("demo.help.buy"), $$0x -> {
         $$0x.r = false;
         ac.i().a("https://aka.ms/BuyMinecraftJava");
      }).a(this.g / 2 - 116, this.h / 2 + 62 + -16, 114, 20).a());
      this.d(epi.a(sw.c("demo.help.later"), $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(this.g / 2 + 2, this.h / 2 + 62 + -16, 114, 20).a());
      enr $$1 = this.f.m;
      this.b = epz.a(
         this.i,
         sw.a("demo.help.movementShort", $$1.x.k(), $$1.y.k(), $$1.z.k(), $$1.A.k()),
         sw.c("demo.help.movementMouse"),
         sw.a("demo.help.jump", $$1.B.k()),
         sw.a("demo.help.inventory", $$1.E.k())
      );
      this.c = epz.a(this.i, sw.c("demo.help.fullWrapped"), 218);
   }

   @Override
   public void a(eox $$0) {
      super.a($$0);
      int $$1 = (this.g - 248) / 2;
      int $$2 = (this.h - 166) / 2;
      $$0.a(a, $$1, $$2, 0, 0, 248, 166);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      int $$4 = (this.g - 248) / 2 + 10;
      int $$5 = (this.h - 166) / 2 + 8;
      $$0.a(this.i, this.e, $$4, $$5, 2039583, false);
      $$5 = this.b.c($$0, $$4, $$5 + 12, 12, 5197647);
      this.c.c($$0, $$4, $$5 + 20, 9, 2039583);
      super.a($$0, $$1, $$2, $$3);
   }
}
