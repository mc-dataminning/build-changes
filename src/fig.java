public class fig extends hfq {
   private static final int a = 212;
   private static final xj b = xj.c("mco.configure.world.name");
   private static final xj c = xj.c("mco.configure.world.description");
   private final fhq B;
   private final fgi C;
   private fmm D;
   private fmm E;

   public fig(fhq $$0, fgi $$1) {
      super(xj.c("mco.configure.world.settings.title"));
      this.B = $$0;
      this.C = $$1;
   }

   @Override
   public void aR_() {
      int $$0 = this.n / 2 - 106;
      String $$1 = this.C.e == fgi.c.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
      fmd $$2 = fmd.a(xj.c($$1), $$0x -> {
         if (this.C.e == fgi.c.b) {
            this.m.a(fic.a(this, xj.c("mco.configure.world.close.question.line1"), $$0xx -> this.B.b()));
         } else {
            this.B.b(false);
         }
      }).a(this.n / 2 - 53, g(0), 106, 20).a();
      this.c($$2);
      this.E = new fmm(this.m.h, $$0, g(4), 212, 20, xj.c("mco.configure.world.name"));
      this.E.f(32);
      this.E.a(this.C.b());
      this.c(this.E);
      this.D = new fmm(this.m.h, $$0, g(8), 212, 20, xj.c("mco.configure.world.description"));
      this.D.f(32);
      this.D.a(this.C.a());
      this.c(this.D);
      fmd $$3 = this.c(fmd.a(xj.c("mco.configure.world.buttons.done"), $$0x -> this.g()).a($$0 - 2, g(12), 106, 20).a());
      this.E.b($$1x -> $$3.j = !baj.h($$1x));
      this.c(fmd.a(xi.e, $$0x -> this.aO_()).a(this.n / 2 + 2, g(12), 106, 20).a());
   }

   @Override
   protected void aF_() {
      this.b(this.E);
   }

   @Override
   public void aO_() {
      this.m.a(this.B);
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, -1);
      $$0.a(this.p, b, this.n / 2 - 106, g(3), -1, false);
      $$0.a(this.p, c, this.n / 2 - 106, g(7), -1, false);
   }

   public void g() {
      this.B.a(this.E.a(), this.D.a());
   }
}
