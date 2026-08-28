public class fhh extends hep {
   private static final int a = 212;
   private static final xi b = xi.c("mco.configure.world.name");
   private static final xi c = xi.c("mco.configure.world.description");
   private final fgq B;
   private final ffi C;
   private flq D;
   private flq E;

   public fhh(fgq $$0, ffi $$1) {
      super(xi.c("mco.configure.world.settings.title"));
      this.B = $$0;
      this.C = $$1;
   }

   @Override
   public void aR_() {
      int $$0 = this.n / 2 - 106;
      String $$1 = this.C.e == ffi.c.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
      flh $$2 = flh.a(xi.c($$1), $$0x -> {
         if (this.C.e == ffi.c.b) {
            this.m.a(fhc.a(this, xi.c("mco.configure.world.close.question.line1"), $$0xx -> this.B.b()));
         } else {
            this.B.b(false);
         }
      }).a(this.n / 2 - 53, g(0), 106, 20).a();
      this.c($$2);
      this.E = new flq(this.m.h, $$0, g(4), 212, 20, xi.c("mco.configure.world.name"));
      this.E.f(32);
      this.E.a(this.C.b());
      this.c(this.E);
      this.D = new flq(this.m.h, $$0, g(8), 212, 20, xi.c("mco.configure.world.description"));
      this.D.f(32);
      this.D.a(this.C.a());
      this.c(this.D);
      flh $$3 = this.c(flh.a(xi.c("mco.configure.world.buttons.done"), $$0x -> this.g()).a($$0 - 2, g(12), 106, 20).a());
      this.E.b($$1x -> $$3.j = !bah.h($$1x));
      this.c(flh.a(xh.e, $$0x -> this.d()).a(this.n / 2 + 2, g(12), 106, 20).a());
   }

   @Override
   protected void aG_() {
      this.b(this.E);
   }

   @Override
   public void d() {
      this.m.a(this.B);
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, -1);
      $$0.a(this.p, b, this.n / 2 - 106, g(3), -1, false);
      $$0.a(this.p, c, this.n / 2 - 106, g(7), -1, false);
   }

   public void g() {
      this.B.a(this.E.a(), this.D.a());
   }
}
