public class fei extends gwj {
   private static final int a = 212;
   private static final wy b = wy.c("mco.configure.world.name");
   private static final wy c = wy.c("mco.configure.world.description");
   private final fdr A;
   private final fcj B;
   private fip C;
   private fip D;

   public fei(fdr $$0, fcj $$1) {
      super(wy.c("mco.configure.world.settings.title"));
      this.A = $$0;
      this.B = $$1;
   }

   @Override
   public void aP_() {
      int $$0 = this.m / 2 - 106;
      String $$1 = this.B.e == fcj.c.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
      fig $$2 = fig.a(wy.c($$1), $$0x -> {
         if (this.B.e == fcj.c.b) {
            this.l.a(fed.a(this, wy.c("mco.configure.world.close.question.line1"), $$0xx -> this.A.b()));
         } else {
            this.A.b(false);
         }
      }).a(this.m / 2 - 53, g(0), 106, 20).a();
      this.c($$2);
      this.D = new fip(this.l.h, $$0, g(4), 212, 20, wy.c("mco.configure.world.name"));
      this.D.f(32);
      this.D.a(this.B.b());
      this.c(this.D);
      this.C = new fip(this.l.h, $$0, g(8), 212, 20, wy.c("mco.configure.world.description"));
      this.C.f(32);
      this.C.a(this.B.a());
      this.c(this.C);
      fig $$3 = this.c(fig.a(wy.c("mco.configure.world.buttons.done"), $$0x -> this.g()).a($$0 - 2, g(12), 106, 20).a());
      this.D.b($$1x -> $$3.j = !azk.h($$1x));
      this.c(fig.a(wx.e, $$0x -> this.d()).a(this.m / 2 + 2, g(12), 106, 20).a());
   }

   @Override
   protected void aE_() {
      this.b(this.D);
   }

   @Override
   public void d() {
      this.l.a(this.A);
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 17, -1);
      $$0.a(this.o, b, this.m / 2 - 106, g(3), -1, false);
      $$0.a(this.o, c, this.m / 2 - 106, g(7), -1, false);
   }

   public void g() {
      this.A.a(this.D.a(), this.C.a());
   }
}
