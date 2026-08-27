public class eth extends gkn {
   private static final int a = 212;
   private static final vf b = vf.c("mco.configure.world.name");
   private static final vf c = vf.c("mco.configure.world.description");
   private final esp v;
   private final erg w;
   private exn x;
   private exn y;

   public eth(esp $$0, erg $$1) {
      super(vf.c("mco.configure.world.settings.title"));
      this.v = $$0;
      this.w = $$1;
   }

   @Override
   public void aN_() {
      int $$0 = this.g / 2 - 106;
      String $$1 = this.w.e == erg.c.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
      exe $$2 = exe.a(vf.c($$1), $$0x -> {
         if (this.w.e == erg.c.b) {
            vf $$1x = vf.c("mco.configure.world.close.question.line1");
            vf $$2x = vf.c("mco.configure.world.close.question.line2");
            this.f.a(new esv($$0xx -> {
               if ($$0xx) {
                  this.v.a(this);
               } else {
                  this.f.a(this);
               }
            }, esv.a.b, $$1x, $$2x, true));
         } else {
            this.v.a(false, this);
         }
      }).a(this.g / 2 - 53, g(0), 106, 20).a();
      this.d($$2);
      this.y = new exn(this.f.h, $$0, g(4), 212, 20, vf.c("mco.configure.world.name"));
      this.y.f(32);
      this.y.a(this.w.b());
      this.d(this.y);
      this.c(this.y);
      this.x = new exn(this.f.h, $$0, g(8), 212, 20, vf.c("mco.configure.world.description"));
      this.x.f(32);
      this.x.a(this.w.a());
      this.d(this.x);
      exe $$3 = this.d(exe.a(vf.c("mco.configure.world.buttons.done"), $$0x -> this.f()).a($$0 - 2, g(12), 106, 20).a());
      this.y.b($$1x -> $$3.j = !ac.b($$1x));
      this.d(exe.a(ve.e, $$0x -> this.aE_()).a(this.g / 2 + 2, g(12), 106, 20).a());
   }

   @Override
   public void aE_() {
      this.f.a(this.v);
   }

   @Override
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      $$0.a(this.i, b, this.g / 2 - 106, g(3), -1, false);
      $$0.a(this.i, c, this.g / 2 - 106, g(7), -1, false);
   }

   public void f() {
      this.v.a(this.y.a(), this.x.a());
   }
}
