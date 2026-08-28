import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fmh extends fnf {
   private static final xp a = xp.c("addServer.enterName");
   private static final xp b = xp.c("addServer.enterIp");
   private fhg c;
   private final BooleanConsumer d;
   private final fyl r;
   private fhp s;
   private fhp u;
   private final fnf v;

   public fmh(fnf $$0, BooleanConsumer $$1, fyl $$2) {
      super(xp.c("addServer.title"));
      this.v = $$0;
      this.d = $$1;
      this.r = $$2;
   }

   @Override
   protected void aM_() {
      this.u = new fhp(this.p, this.n / 2 - 100, 66, 200, 20, xp.c("addServer.enterName"));
      this.u.a(this.r.a);
      this.u.b($$0 -> this.E());
      this.d(this.u);
      this.s = new fhp(this.p, this.n / 2 - 100, 106, 200, 20, xp.c("addServer.enterIp"));
      this.s.f(128);
      this.s.a(this.r.b);
      this.s.b($$0 -> this.E());
      this.d(this.s);
      this.c(
         fhn.a(fyl.a::a)
            .a(fyl.a.values())
            .a(this.r.b())
            .a(this.n / 2 - 100, this.o / 4 + 72, 200, 20, xp.c("addServer.resourcePack"), ($$0, $$1) -> this.r.a($$1))
      );
      this.c = this.c(fhg.a(xp.c("addServer.add"), $$0 -> this.m()).a(this.n / 2 - 100, this.o / 4 + 96 + 18, 200, 20).a());
      this.c(fhg.a(xo.e, $$0 -> this.d.accept(false)).a(this.n / 2 - 100, this.o / 4 + 120 + 18, 200, 20).a());
      this.E();
   }

   @Override
   protected void aB_() {
      this.b(this.u);
   }

   @Override
   public void a(ffh $$0, int $$1, int $$2) {
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

   private void E() {
      this.c.j = fzo.b(this.s.a()) && !this.u.a().isEmpty();
   }

   @Override
   public void a(fgt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, 16777215);
      $$0.b(this.p, a, this.n / 2 - 100 + 1, 53, 10526880);
      $$0.b(this.p, b, this.n / 2 - 100 + 1, 94, 10526880);
      this.u.a($$0, $$1, $$2, $$3);
      this.s.a($$0, $$1, $$2, $$3);
   }
}
