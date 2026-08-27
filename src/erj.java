public class erj extends ghw {
   private static final int a = 212;
   private static final uv b = uv.c("mco.configure.world.name");
   private static final uv c = uv.c("mco.configure.world.description");
   private final eqr v;
   private final epi w;
   private evn x;
   private evn y;

   public erj(eqr $$0, epi $$1) {
      super(uv.c("mco.configure.world.settings.title"));
      this.v = $$0;
      this.w = $$1;
   }

   @Override
   public void aQ_() {
      int $$0 = this.g / 2 - 106;
      String $$1 = this.w.e == epi.c.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
      eve $$2 = eve.a(uv.c($$1), $$0x -> {
         if (this.w.e == epi.c.b) {
            uv $$1x = uv.c("mco.configure.world.close.question.line1");
            uv $$2x = uv.c("mco.configure.world.close.question.line2");
            this.f.a(new eqx($$0xx -> {
               if ($$0xx) {
                  this.v.a(this);
               } else {
                  this.f.a(this);
               }
            }, eqx.a.b, $$1x, $$2x, true));
         } else {
            this.v.a(false, this);
         }
      }).a(this.g / 2 - 53, h(0), 106, 20).a();
      this.d($$2);
      this.y = new evn(this.f.h, $$0, h(4), 212, 20, uv.c("mco.configure.world.name"));
      this.y.l(32);
      this.y.a(this.w.b());
      this.d(this.y);
      this.c(this.y);
      this.x = new evn(this.f.h, $$0, h(8), 212, 20, uv.c("mco.configure.world.description"));
      this.x.l(32);
      this.x.a(this.w.a());
      this.d(this.x);
      eve $$3 = this.d(eve.a(uv.c("mco.configure.world.buttons.done"), $$0x -> this.f()).a($$0 - 2, h(12), 106, 20).a());
      this.y.b($$1x -> $$3.i = !ac.b($$1x));
      this.d(eve.a(uu.e, $$0x -> this.aG_()).a(this.g / 2 + 2, h(12), 106, 20).a());
   }

   @Override
   public void aG_() {
      this.f.a(this.v);
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      $$0.a(this.i, b, this.g / 2 - 106, h(3), -1, false);
      $$0.a(this.i, c, this.g / 2 - 106, h(7), -1, false);
   }

   public void f() {
      this.v.a(this.y.a(), this.x.a());
   }
}
