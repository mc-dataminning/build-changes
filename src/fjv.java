import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fjv extends fkt {
   private static final ws a = ws.c("addServer.enterName");
   private static final ws b = ws.c("addServer.enterIp");
   private feu c;
   private final BooleanConsumer d;
   private final fwa r;
   private ffd s;
   private ffd u;
   private final fkt v;

   public fjv(fkt $$0, BooleanConsumer $$1, fwa $$2) {
      super(ws.c("addServer.title"));
      this.v = $$0;
      this.d = $$1;
      this.r = $$2;
   }

   @Override
   protected void aM_() {
      this.u = new ffd(this.p, this.n / 2 - 100, 66, 200, 20, ws.c("addServer.enterName"));
      this.u.a(this.r.a);
      this.u.b($$0 -> this.C());
      this.d(this.u);
      this.s = new ffd(this.p, this.n / 2 - 100, 106, 200, 20, ws.c("addServer.enterIp"));
      this.s.f(128);
      this.s.a(this.r.b);
      this.s.b($$0 -> this.C());
      this.d(this.s);
      this.c(
         ffb.a(fwa.a::a)
            .a(fwa.a.values())
            .a(this.r.b())
            .a(this.n / 2 - 100, this.o / 4 + 72, 200, 20, ws.c("addServer.resourcePack"), ($$0, $$1) -> this.r.a($$1))
      );
      this.c = this.c(feu.a(ws.c("addServer.add"), $$0 -> this.m()).a(this.n / 2 - 100, this.o / 4 + 96 + 18, 200, 20).a());
      this.c(feu.a(wr.e, $$0 -> this.d.accept(false)).a(this.n / 2 - 100, this.o / 4 + 120 + 18, 200, 20).a());
      this.C();
   }

   @Override
   protected void aC_() {
      this.b(this.u);
   }

   @Override
   public void a(fcu $$0, int $$1, int $$2) {
      String $$3 = this.s.a();
      String $$4 = this.u.a();
      this.b($$0, $$1, $$2);
      this.s.a($$3);
      this.u.a($$4);
   }

   private void m() {
      this.r.a = this.u.a();
      this.r.b = this.s.a();
      this.d.accept(true);
   }

   @Override
   public void d() {
      this.m.a(this.v);
   }

   private void C() {
      this.c.j = fxd.b(this.s.a()) && !this.u.a().isEmpty();
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, 16777215);
      $$0.b(this.p, a, this.n / 2 - 100 + 1, 53, 10526880);
      $$0.b(this.p, b, this.n / 2 - 100 + 1, 94, 10526880);
      this.u.a($$0, $$1, $$2, $$3);
      this.s.a($$0, $$1, $$2, $$3);
   }
}
