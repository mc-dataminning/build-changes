import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fqa extends fqs {
   private static final xh a = xh.c("addServer.enterName");
   private static final xh b = xh.c("addServer.enterIp");
   private fkz c;
   private final BooleanConsumer d;
   private final gcl s;
   private fli u;
   private fli v;
   private final fqs w;

   public fqa(fqs $$0, BooleanConsumer $$1, gcl $$2) {
      super(xh.c("addServer.title"));
      this.w = $$0;
      this.d = $$1;
      this.s = $$2;
   }

   @Override
   protected void aS_() {
      this.v = new fli(this.p, this.n / 2 - 100, 66, 200, 20, xh.c("addServer.enterName"));
      this.v.a(this.s.a);
      this.v.b($$0 -> this.D());
      this.d(this.v);
      this.u = new fli(this.p, this.n / 2 - 100, 106, 200, 20, xh.c("addServer.enterIp"));
      this.u.f(128);
      this.u.a(this.s.b);
      this.u.b($$0 -> this.D());
      this.d(this.u);
      this.c(
         flg.a(gcl.a::a)
            .a(gcl.a.values())
            .a(this.s.b())
            .a(this.n / 2 - 100, this.o / 4 + 72, 200, 20, xh.c("addServer.resourcePack"), ($$0, $$1) -> this.s.a($$1))
      );
      this.c = this.c(fkz.a(xh.c("addServer.add"), $$0 -> this.m()).a(this.n / 2 - 100, this.o / 4 + 96 + 18, 200, 20).a());
      this.c(fkz.a(xg.e, $$0 -> this.d.accept(false)).a(this.n / 2 - 100, this.o / 4 + 120 + 18, 200, 20).a());
      this.D();
   }

   @Override
   protected void aH_() {
      this.b(this.v);
   }

   @Override
   public void a(fja $$0, int $$1, int $$2) {
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
      this.c.j = gdo.b(this.u.a()) && !this.v.a().isEmpty();
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, 16777215);
      $$0.b(this.p, a, this.n / 2 - 100 + 1, 53, 10526880);
      $$0.b(this.p, b, this.n / 2 - 100 + 1, 94, 10526880);
      this.v.a($$0, $$1, $$2, $$3);
      this.u.a($$0, $$1, $$2, $$3);
   }
}
