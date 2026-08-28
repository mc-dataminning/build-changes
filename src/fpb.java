import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fpb extends fpt {
   private static final xd a = xd.c("addServer.enterName");
   private static final xd b = xd.c("addServer.enterIp");
   private fka c;
   private final BooleanConsumer d;
   private final gbl s;
   private fkj u;
   private fkj v;
   private final fpt w;

   public fpb(fpt $$0, BooleanConsumer $$1, gbl $$2) {
      super(xd.c("addServer.title"));
      this.w = $$0;
      this.d = $$1;
      this.s = $$2;
   }

   @Override
   protected void aT_() {
      this.v = new fkj(this.p, this.n / 2 - 100, 66, 200, 20, xd.c("addServer.enterName"));
      this.v.a(this.s.a);
      this.v.b($$0 -> this.D());
      this.d(this.v);
      this.u = new fkj(this.p, this.n / 2 - 100, 106, 200, 20, xd.c("addServer.enterIp"));
      this.u.f(128);
      this.u.a(this.s.b);
      this.u.b($$0 -> this.D());
      this.d(this.u);
      this.c(
         fkh.a(gbl.a::a)
            .a(gbl.a.values())
            .a(this.s.b())
            .a(this.n / 2 - 100, this.o / 4 + 72, 200, 20, xd.c("addServer.resourcePack"), ($$0, $$1) -> this.s.a($$1))
      );
      this.c = this.c(fka.a(xd.c("addServer.add"), $$0 -> this.m()).a(this.n / 2 - 100, this.o / 4 + 96 + 18, 200, 20).a());
      this.c(fka.a(xc.e, $$0 -> this.d.accept(false)).a(this.n / 2 - 100, this.o / 4 + 120 + 18, 200, 20).a());
      this.D();
   }

   @Override
   protected void aI_() {
      this.b(this.v);
   }

   @Override
   public void a(fib $$0, int $$1, int $$2) {
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
      this.c.j = gco.b(this.u.a()) && !this.v.a().isEmpty();
   }

   @Override
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, 16777215);
      $$0.b(this.p, a, this.n / 2 - 100 + 1, 53, 10526880);
      $$0.b(this.p, b, this.n / 2 - 100 + 1, 94, 10526880);
      this.v.a($$0, $$1, $$2, $$3);
      this.u.a($$0, $$1, $$2, $$3);
   }
}
