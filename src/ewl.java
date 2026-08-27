public class ewl extends gob {
   private static final int a = 212;
   private static final vs b = vs.c("mco.configure.world.name");
   private static final vs c = vs.c("mco.configure.world.description");
   private final evt v;
   private final euk w;
   private fat x;
   private fat y;

   public ewl(evt $$0, euk $$1) {
      super(vs.c("mco.configure.world.settings.title"));
      this.v = $$0;
      this.w = $$1;
   }

   @Override
   public void aP_() {
      int $$0 = this.g / 2 - 106;
      String $$1 = this.w.e == euk.c.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
      fak $$2 = fak.a(vs.c($$1), $$0x -> {
         if (this.w.e == euk.c.b) {
            vs $$1x = vs.c("mco.configure.world.close.question.line1");
            vs $$2x = vs.c("mco.configure.world.close.question.line2");
            this.f.a(new evz($$0xx -> {
               if ($$0xx) {
                  this.v.a(this);
               } else {
                  this.f.a(this);
               }
            }, evz.a.b, $$1x, $$2x, true));
         } else {
            this.v.a(false, this);
         }
      }).a(this.g / 2 - 53, g(0), 106, 20).a();
      this.c($$2);
      this.y = new fat(this.f.h, $$0, g(4), 212, 20, vs.c("mco.configure.world.name"));
      this.y.f(32);
      this.y.a(this.w.b());
      this.c(this.y);
      this.x = new fat(this.f.h, $$0, g(8), 212, 20, vs.c("mco.configure.world.description"));
      this.x.f(32);
      this.x.a(this.w.a());
      this.c(this.x);
      fak $$3 = this.c(fak.a(vs.c("mco.configure.world.buttons.done"), $$0x -> this.g()).a($$0 - 2, g(12), 106, 20).a());
      this.y.b($$1x -> $$3.j = !ac.b($$1x));
      this.c(fak.a(vr.e, $$0x -> this.d()).a(this.g / 2 + 2, g(12), 106, 20).a());
   }

   @Override
   protected void aG_() {
      this.b(this.y);
   }

   @Override
   public void d() {
      this.f.a(this.v);
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      $$0.a(this.i, b, this.g / 2 - 106, g(3), -1, false);
      $$0.a(this.i, c, this.g / 2 - 106, g(7), -1, false);
   }

   public void g() {
      this.v.a(this.y.a(), this.x.a());
   }
}
