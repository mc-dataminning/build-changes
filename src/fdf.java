public class fdf extends gvf {
   private static final int a = 212;
   private static final xo b = xo.c("mco.configure.world.name");
   private static final xo c = xo.c("mco.configure.world.description");
   private final fcn B;
   private final fbe C;
   private fhm D;
   private fhm E;

   public fdf(fcn $$0, fbe $$1) {
      super(xo.c("mco.configure.world.settings.title"));
      this.B = $$0;
      this.C = $$1;
   }

   @Override
   public void aM_() {
      int $$0 = this.n / 2 - 106;
      String $$1 = this.C.e == fbe.c.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
      fhd $$2 = fhd.a(xo.c($$1), $$0x -> {
         if (this.C.e == fbe.c.b) {
            xo $$1x = xo.c("mco.configure.world.close.question.line1");
            xo $$2x = xo.c("mco.configure.world.close.question.line2");
            this.m.a(new fct($$0xx -> {
               if ($$0xx) {
                  this.B.a(this);
               } else {
                  this.m.a(this);
               }
            }, fct.a.b, $$1x, $$2x, true));
         } else {
            this.B.a(false, this);
         }
      }).a(this.n / 2 - 53, g(0), 106, 20).a();
      this.c($$2);
      this.E = new fhm(this.m.h, $$0, g(4), 212, 20, xo.c("mco.configure.world.name"));
      this.E.f(32);
      this.E.a(this.C.b());
      this.c(this.E);
      this.D = new fhm(this.m.h, $$0, g(8), 212, 20, xo.c("mco.configure.world.description"));
      this.D.f(32);
      this.D.a(this.C.a());
      this.c(this.D);
      fhd $$3 = this.c(fhd.a(xo.c("mco.configure.world.buttons.done"), $$0x -> this.g()).a($$0 - 2, g(12), 106, 20).a());
      this.E.b($$1x -> $$3.j = !azu.h($$1x));
      this.c(fhd.a(xn.e, $$0x -> this.d()).a(this.n / 2 + 2, g(12), 106, 20).a());
   }

   @Override
   protected void aB_() {
      this.b(this.E);
   }

   @Override
   public void d() {
      this.m.a(this.B);
   }

   @Override
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, -1);
      $$0.a(this.p, b, this.n / 2 - 106, g(3), -1, false);
      $$0.a(this.p, c, this.n / 2 - 106, g(7), -1, false);
   }

   public void g() {
      this.B.a(this.E.a(), this.D.a());
   }
}
