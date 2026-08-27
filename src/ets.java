public class ets extends gld {
   private static final int a = 212;
   private static final vg b = vg.c("mco.configure.world.name");
   private static final vg c = vg.c("mco.configure.world.description");
   private final eta v;
   private final err w;
   private eya x;
   private eya y;

   public ets(eta $$0, err $$1) {
      super(vg.c("mco.configure.world.settings.title"));
      this.v = $$0;
      this.w = $$1;
   }

   @Override
   public void aP_() {
      int $$0 = this.g / 2 - 106;
      String $$1 = this.w.e == err.c.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
      exr $$2 = exr.a(vg.c($$1), $$0x -> {
         if (this.w.e == err.c.b) {
            vg $$1x = vg.c("mco.configure.world.close.question.line1");
            vg $$2x = vg.c("mco.configure.world.close.question.line2");
            this.f.a(new etg($$0xx -> {
               if ($$0xx) {
                  this.v.a(this);
               } else {
                  this.f.a(this);
               }
            }, etg.a.b, $$1x, $$2x, true));
         } else {
            this.v.a(false, this);
         }
      }).a(this.g / 2 - 53, g(0), 106, 20).a();
      this.d($$2);
      this.y = new eya(this.f.h, $$0, g(4), 212, 20, vg.c("mco.configure.world.name"));
      this.y.f(32);
      this.y.a(this.w.b());
      this.d(this.y);
      this.c(this.y);
      this.x = new eya(this.f.h, $$0, g(8), 212, 20, vg.c("mco.configure.world.description"));
      this.x.f(32);
      this.x.a(this.w.a());
      this.d(this.x);
      exr $$3 = this.d(exr.a(vg.c("mco.configure.world.buttons.done"), $$0x -> this.f()).a($$0 - 2, g(12), 106, 20).a());
      this.y.b($$1x -> $$3.j = !ac.b($$1x));
      this.d(exr.a(vf.e, $$0x -> this.d()).a(this.g / 2 + 2, g(12), 106, 20).a());
   }

   @Override
   public void d() {
      this.f.a(this.v);
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      $$0.a(this.i, b, this.g / 2 - 106, g(3), -1, false);
      $$0.a(this.i, c, this.g / 2 - 106, g(7), -1, false);
   }

   public void f() {
      this.v.a(this.y.a(), this.x.a());
   }
}
