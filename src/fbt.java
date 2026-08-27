public class fbt extends fct {
   private static final ahd a = new ahd("textures/gui/demo_background.png");
   private exr b = exr.a;
   private exr c = exr.a;

   public fbt() {
      super(vd.c("demo.help.title"));
   }

   @Override
   protected void aN_() {
      int $$0 = -16;
      this.d(ewy.a(vd.c("demo.help.buy"), $$0x -> {
         $$0x.j = false;
         ac.i().a("https://aka.ms/BuyMinecraftJava");
      }).a(this.g / 2 - 116, this.h / 2 + 62 + -16, 114, 20).a());
      this.d(ewy.a(vd.c("demo.help.later"), $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(this.g / 2 + 2, this.h / 2 + 62 + -16, 114, 20).a());
      eve $$1 = this.f.m;
      this.b = exr.a(
         this.i,
         vd.a("demo.help.movementShort", $$1.x.k(), $$1.y.k(), $$1.z.k(), $$1.A.k()),
         vd.c("demo.help.movementMouse"),
         vd.a("demo.help.jump", $$1.B.k()),
         vd.a("demo.help.inventory", $$1.E.k())
      );
      this.c = exr.a(this.i, vd.c("demo.help.fullWrapped"), 218);
   }

   @Override
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = (this.g - 248) / 2;
      int $$5 = (this.h - 166) / 2;
      $$0.a(a, $$4, $$5, 0, 0, 248, 166);
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.g - 248) / 2 + 10;
      int $$5 = (this.h - 166) / 2 + 8;
      $$0.a(this.i, this.e, $$4, $$5, 2039583, false);
      $$5 = this.b.c($$0, $$4, $$5 + 12, 12, 5197647);
      this.c.c($$0, $$4, $$5 + 20, 9, 2039583);
   }
}
