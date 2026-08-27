public class ezz extends gru {
   private static final int a = 212;
   private static final wi b = wi.c("mco.configure.world.name");
   private static final wi c = wi.c("mco.configure.world.description");
   private final ezh y;
   private final exy z;
   private feh A;
   private feh B;

   public ezz(ezh $$0, exy $$1) {
      super(wi.c("mco.configure.world.settings.title"));
      this.y = $$0;
      this.z = $$1;
   }

   @Override
   public void aM_() {
      int $$0 = this.k / 2 - 106;
      String $$1 = this.z.e == exy.c.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
      fdy $$2 = fdy.a(wi.c($$1), $$0x -> {
         if (this.z.e == exy.c.b) {
            wi $$1x = wi.c("mco.configure.world.close.question.line1");
            wi $$2x = wi.c("mco.configure.world.close.question.line2");
            this.j.a(new ezn($$0xx -> {
               if ($$0xx) {
                  this.y.a(this);
               } else {
                  this.j.a(this);
               }
            }, ezn.a.b, $$1x, $$2x, true));
         } else {
            this.y.a(false, this);
         }
      }).a(this.k / 2 - 53, g(0), 106, 20).a();
      this.c($$2);
      this.B = new feh(this.j.h, $$0, g(4), 212, 20, wi.c("mco.configure.world.name"));
      this.B.f(32);
      this.B.a(this.z.b());
      this.c(this.B);
      this.A = new feh(this.j.h, $$0, g(8), 212, 20, wi.c("mco.configure.world.description"));
      this.A.f(32);
      this.A.a(this.z.a());
      this.c(this.A);
      fdy $$3 = this.c(fdy.a(wi.c("mco.configure.world.buttons.done"), $$0x -> this.g()).a($$0 - 2, g(12), 106, 20).a());
      this.B.b($$1x -> $$3.j = !ayh.h($$1x));
      this.c(fdy.a(wh.e, $$0x -> this.d()).a(this.k / 2 + 2, g(12), 106, 20).a());
   }

   @Override
   protected void aC_() {
      this.b(this.B);
   }

   @Override
   public void d() {
      this.j.a(this.y);
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 17, -1);
      $$0.a(this.m, b, this.k / 2 - 106, g(3), -1, false);
      $$0.a(this.m, c, this.k / 2 - 106, g(7), -1, false);
   }

   public void g() {
      this.y.a(this.B.a(), this.A.a());
   }
}
