public class exh extends gpb {
   private static final int a = 212;
   private static final vu b = vu.c("mco.configure.world.name");
   private static final vu c = vu.c("mco.configure.world.description");
   private final ewp v;
   private final evg w;
   private fbp x;
   private fbp y;

   public exh(ewp $$0, evg $$1) {
      super(vu.c("mco.configure.world.settings.title"));
      this.v = $$0;
      this.w = $$1;
   }

   @Override
   public void aO_() {
      int $$0 = this.g / 2 - 106;
      String $$1 = this.w.e == evg.c.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
      fbg $$2 = fbg.a(vu.c($$1), $$0x -> {
         if (this.w.e == evg.c.b) {
            vu $$1x = vu.c("mco.configure.world.close.question.line1");
            vu $$2x = vu.c("mco.configure.world.close.question.line2");
            this.f.a(new ewv($$0xx -> {
               if ($$0xx) {
                  this.v.a(this);
               } else {
                  this.f.a(this);
               }
            }, ewv.a.b, $$1x, $$2x, true));
         } else {
            this.v.a(false, this);
         }
      }).a(this.g / 2 - 53, g(0), 106, 20).a();
      this.c($$2);
      this.y = new fbp(this.f.h, $$0, g(4), 212, 20, vu.c("mco.configure.world.name"));
      this.y.f(32);
      this.y.a(this.w.b());
      this.c(this.y);
      this.x = new fbp(this.f.h, $$0, g(8), 212, 20, vu.c("mco.configure.world.description"));
      this.x.f(32);
      this.x.a(this.w.a());
      this.c(this.x);
      fbg $$3 = this.c(fbg.a(vu.c("mco.configure.world.buttons.done"), $$0x -> this.g()).a($$0 - 2, g(12), 106, 20).a());
      this.y.b($$1x -> $$3.j = !ac.b($$1x));
      this.c(fbg.a(vt.e, $$0x -> this.d()).a(this.g / 2 + 2, g(12), 106, 20).a());
   }

   @Override
   protected void aF_() {
      this.b(this.y);
   }

   @Override
   public void d() {
      this.f.a(this.v);
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      $$0.a(this.i, b, this.g / 2 - 106, g(3), -1, false);
      $$0.a(this.i, c, this.g / 2 - 106, g(7), -1, false);
   }

   public void g() {
      this.v.a(this.y.a(), this.x.a());
   }
}
