public class exf extends eyf {
   private static final aeu a = new aeu("textures/gui/demo_background.png");
   private ete b = ete.a;
   private ete c = ete.a;

   public exf() {
      super(ti.c("demo.help.title"));
   }

   @Override
   protected void aD_() {
      int $$0 = -16;
      this.d(esl.a(ti.c("demo.help.buy"), $$0x -> {
         $$0x.i = false;
         ac.i().a("https://aka.ms/BuyMinecraftJava");
      }).a(this.g / 2 - 116, this.h / 2 + 62 + -16, 114, 20).a());
      this.d(esl.a(ti.c("demo.help.later"), $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(this.g / 2 + 2, this.h / 2 + 62 + -16, 114, 20).a());
      equ $$1 = this.f.m;
      this.b = ete.a(
         this.i,
         ti.a("demo.help.movementShort", $$1.x.k(), $$1.y.k(), $$1.z.k(), $$1.A.k()),
         ti.c("demo.help.movementMouse"),
         ti.a("demo.help.jump", $$1.B.k()),
         ti.a("demo.help.inventory", $$1.E.k())
      );
      this.c = ete.a(this.i, ti.c("demo.help.fullWrapped"), 218);
   }

   @Override
   public void b(esa $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = (this.g - 248) / 2;
      int $$5 = (this.h - 166) / 2;
      $$0.a(a, $$4, $$5, 0, 0, 248, 166);
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.g - 248) / 2 + 10;
      int $$5 = (this.h - 166) / 2 + 8;
      $$0.a(this.i, this.e, $$4, $$5, 2039583, false);
      $$5 = this.b.c($$0, $$4, $$5 + 12, 12, 5197647);
      this.c.c($$0, $$4, $$5 + 20, 9, 2039583);
   }
}
