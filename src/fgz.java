public class fgz extends hee {
   private static final int a = 212;
   private static final xh b = xh.c("mco.configure.world.name");
   private static final xh c = xh.c("mco.configure.world.description");
   private final fgi B;
   private final ffa C;
   private fli D;
   private fli E;

   public fgz(fgi $$0, ffa $$1) {
      super(xh.c("mco.configure.world.settings.title"));
      this.B = $$0;
      this.C = $$1;
   }

   @Override
   public void aS_() {
      int $$0 = this.n / 2 - 106;
      String $$1 = this.C.e == ffa.c.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
      fkz $$2 = fkz.a(xh.c($$1), $$0x -> {
         if (this.C.e == ffa.c.b) {
            this.m.a(fgu.a(this, xh.c("mco.configure.world.close.question.line1"), $$0xx -> this.B.b()));
         } else {
            this.B.b(false);
         }
      }).a(this.n / 2 - 53, g(0), 106, 20).a();
      this.c($$2);
      this.E = new fli(this.m.h, $$0, g(4), 212, 20, xh.c("mco.configure.world.name"));
      this.E.f(32);
      this.E.a(this.C.b());
      this.c(this.E);
      this.D = new fli(this.m.h, $$0, g(8), 212, 20, xh.c("mco.configure.world.description"));
      this.D.f(32);
      this.D.a(this.C.a());
      this.c(this.D);
      fkz $$3 = this.c(fkz.a(xh.c("mco.configure.world.buttons.done"), $$0x -> this.g()).a($$0 - 2, g(12), 106, 20).a());
      this.E.b($$1x -> $$3.j = !bag.h($$1x));
      this.c(fkz.a(xg.e, $$0x -> this.d()).a(this.n / 2 + 2, g(12), 106, 20).a());
   }

   @Override
   protected void aH_() {
      this.b(this.E);
   }

   @Override
   public void d() {
      this.m.a(this.B);
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, -1);
      $$0.a(this.p, b, this.n / 2 - 106, g(3), -1, false);
      $$0.a(this.p, c, this.n / 2 - 106, g(7), -1, false);
   }

   public void g() {
      this.B.a(this.E.a(), this.D.a());
   }
}
