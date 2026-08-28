public class fga extends hct {
   private static final int a = 212;
   private static final xd b = xd.c("mco.configure.world.name");
   private static final xd c = xd.c("mco.configure.world.description");
   private final ffj B;
   private final feb C;
   private fkj D;
   private fkj E;

   public fga(ffj $$0, feb $$1) {
      super(xd.c("mco.configure.world.settings.title"));
      this.B = $$0;
      this.C = $$1;
   }

   @Override
   public void aT_() {
      int $$0 = this.n / 2 - 106;
      String $$1 = this.C.e == feb.c.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
      fka $$2 = fka.a(xd.c($$1), $$0x -> {
         if (this.C.e == feb.c.b) {
            this.m.a(ffv.a(this, xd.c("mco.configure.world.close.question.line1"), $$0xx -> this.B.b()));
         } else {
            this.B.b(false);
         }
      }).a(this.n / 2 - 53, g(0), 106, 20).a();
      this.c($$2);
      this.E = new fkj(this.m.h, $$0, g(4), 212, 20, xd.c("mco.configure.world.name"));
      this.E.f(32);
      this.E.a(this.C.b());
      this.c(this.E);
      this.D = new fkj(this.m.h, $$0, g(8), 212, 20, xd.c("mco.configure.world.description"));
      this.D.f(32);
      this.D.a(this.C.a());
      this.c(this.D);
      fka $$3 = this.c(fka.a(xd.c("mco.configure.world.buttons.done"), $$0x -> this.g()).a($$0 - 2, g(12), 106, 20).a());
      this.E.b($$1x -> $$3.j = !azz.h($$1x));
      this.c(fka.a(xc.e, $$0x -> this.d()).a(this.n / 2 + 2, g(12), 106, 20).a());
   }

   @Override
   protected void aI_() {
      this.b(this.E);
   }

   @Override
   public void d() {
      this.m.a(this.B);
   }

   @Override
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, -1);
      $$0.a(this.p, b, this.n / 2 - 106, g(3), -1, false);
      $$0.a(this.p, c, this.n / 2 - 106, g(7), -1, false);
   }

   public void g() {
      this.B.a(this.E.a(), this.D.a());
   }
}
