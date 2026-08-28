public class ftr extends fum {
   private static final akv a = akv.b("textures/gui/demo_background.png");
   private static final int b = 256;
   private static final int c = 256;
   private fpn d = fpn.a;
   private fpn s = fpn.a;

   public ftr() {
      super(wp.c("demo.help.title"));
   }

   @Override
   protected void aR_() {
      int $$0 = -16;
      this.c(fou.a(wp.c("demo.help.buy"), $$0x -> {
         $$0x.j = false;
         af.n().a(axv.f);
      }).a(this.n / 2 - 116, this.o / 2 + 62 + -16, 114, 20).a());
      this.c(fou.a(wp.c("demo.help.later"), $$0x -> {
         this.m.a(null);
         this.m.o.i();
      }).a(this.n / 2 + 2, this.o / 2 + 62 + -16, 114, 20).a());
      flo $$1 = this.m.n;
      this.d = fpn.a(
         this.p,
         wp.a("demo.help.movementShort", $$1.v.k(), $$1.w.k(), $$1.x.k(), $$1.y.k()),
         wp.c("demo.help.movementMouse"),
         wp.a("demo.help.jump", $$1.z.k()),
         wp.a("demo.help.inventory", $$1.C.k())
      );
      this.s = fpn.a(this.p, wp.c("demo.help.fullWrapped"), 218);
   }

   @Override
   public void b(fof $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = (this.n - 248) / 2;
      int $$5 = (this.o - 166) / 2;
      $$0.a(gmj::H, a, $$4, $$5, 0.0F, 0.0F, 248, 166, 256, 256);
   }

   @Override
   public void a(fof $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.n - 248) / 2 + 10;
      int $$5 = (this.o - 166) / 2 + 8;
      $$0.a(this.p, this.l, $$4, $$5, 2039583, false);
      $$5 = this.d.c($$0, $$4, $$5 + 12, 12, 5197647);
      this.s.c($$0, $$4, $$5 + 20, 9, 2039583);
   }
}
