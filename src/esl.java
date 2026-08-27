public class esl extends gjl {
   private static final int a = 212;
   private static final vb b = vb.c("mco.configure.world.name");
   private static final vb c = vb.c("mco.configure.world.description");
   private final ert v;
   private final eqk w;
   private ewq x;
   private ewq y;

   public esl(ert $$0, eqk $$1) {
      super(vb.c("mco.configure.world.settings.title"));
      this.v = $$0;
      this.w = $$1;
   }

   @Override
   public void aP_() {
      int $$0 = this.g / 2 - 106;
      String $$1 = this.w.e == eqk.c.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
      ewh $$2 = ewh.a(vb.c($$1), $$0x -> {
         if (this.w.e == eqk.c.b) {
            vb $$1x = vb.c("mco.configure.world.close.question.line1");
            vb $$2x = vb.c("mco.configure.world.close.question.line2");
            this.f.a(new erz($$0xx -> {
               if ($$0xx) {
                  this.v.a(this);
               } else {
                  this.f.a(this);
               }
            }, erz.a.b, $$1x, $$2x, true));
         } else {
            this.v.a(false, this);
         }
      }).a(this.g / 2 - 53, h(0), 106, 20).a();
      this.d($$2);
      this.y = new ewq(this.f.h, $$0, h(4), 212, 20, vb.c("mco.configure.world.name"));
      this.y.l(32);
      this.y.a(this.w.b());
      this.d(this.y);
      this.c(this.y);
      this.x = new ewq(this.f.h, $$0, h(8), 212, 20, vb.c("mco.configure.world.description"));
      this.x.l(32);
      this.x.a(this.w.a());
      this.d(this.x);
      ewh $$3 = this.d(ewh.a(vb.c("mco.configure.world.buttons.done"), $$0x -> this.f()).a($$0 - 2, h(12), 106, 20).a());
      this.y.b($$1x -> $$3.i = !ac.b($$1x));
      this.d(ewh.a(va.e, $$0x -> this.aF_()).a(this.g / 2 + 2, h(12), 106, 20).a());
   }

   @Override
   public void aF_() {
      this.f.a(this.v);
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      $$0.a(this.i, b, this.g / 2 - 106, h(3), -1, false);
      $$0.a(this.i, c, this.g / 2 - 106, h(7), -1, false);
   }

   public void f() {
      this.v.a(this.y.a(), this.x.a());
   }
}
