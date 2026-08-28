import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fqi extends fra {
   private static final xi a = xi.c("addServer.enterName");
   private static final xi b = xi.c("addServer.enterIp");
   private flh c;
   private final BooleanConsumer d;
   private final gcw s;
   private flq u;
   private flq v;
   private final fra w;

   public fqi(fra $$0, BooleanConsumer $$1, gcw $$2) {
      super(xi.c("addServer.title"));
      this.w = $$0;
      this.d = $$1;
      this.s = $$2;
   }

   @Override
   protected void aR_() {
      this.v = new flq(this.p, this.n / 2 - 100, 66, 200, 20, xi.c("addServer.enterName"));
      this.v.a(this.s.a);
      this.v.b($$0 -> this.D());
      this.d(this.v);
      this.u = new flq(this.p, this.n / 2 - 100, 106, 200, 20, xi.c("addServer.enterIp"));
      this.u.f(128);
      this.u.a(this.s.b);
      this.u.b($$0 -> this.D());
      this.d(this.u);
      this.c(
         flo.a(gcw.a::a)
            .a(gcw.a.values())
            .a(this.s.b())
            .a(this.n / 2 - 100, this.o / 4 + 72, 200, 20, xi.c("addServer.resourcePack"), ($$0, $$1) -> this.s.a($$1))
      );
      this.c = this.c(flh.a(xi.c("addServer.add"), $$0 -> this.m()).a(this.n / 2 - 100, this.o / 4 + 96 + 18, 200, 20).a());
      this.c(flh.a(xh.e, $$0 -> this.d.accept(false)).a(this.n / 2 - 100, this.o / 4 + 120 + 18, 200, 20).a());
      this.D();
   }

   @Override
   protected void aG_() {
      this.b(this.v);
   }

   @Override
   public void a(fji $$0, int $$1, int $$2) {
      String $$3 = this.u.a();
      String $$4 = this.v.a();
      this.b($$0, $$1, $$2);
      this.u.a($$3);
      this.v.a($$4);
   }

   private void m() {
      this.s.a = this.v.a();
      this.s.b = this.u.a();
      this.d.accept(true);
   }

   @Override
   public void d() {
      this.m.a(this.w);
   }

   private void D() {
      this.c.j = gdz.b(this.u.a()) && !this.v.a().isEmpty();
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, 16777215);
      $$0.b(this.p, a, this.n / 2 - 100 + 1, 53, 10526880);
      $$0.b(this.p, b, this.n / 2 - 100 + 1, 94, 10526880);
      this.v.a($$0, $$1, $$2, $$3);
      this.u.a($$0, $$1, $$2, $$3);
   }
}
