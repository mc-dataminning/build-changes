import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fma extends fmy {
   private static final xl a = xl.c("addServer.enterName");
   private static final xl b = xl.c("addServer.enterIp");
   private fgz c;
   private final BooleanConsumer d;
   private final fye r;
   private fhi s;
   private fhi u;
   private final fmy v;

   public fma(fmy $$0, BooleanConsumer $$1, fye $$2) {
      super(xl.c("addServer.title"));
      this.v = $$0;
      this.d = $$1;
      this.r = $$2;
   }

   @Override
   protected void aN_() {
      this.u = new fhi(this.p, this.n / 2 - 100, 66, 200, 20, xl.c("addServer.enterName"));
      this.u.a(this.r.a);
      this.u.b($$0 -> this.C());
      this.d(this.u);
      this.s = new fhi(this.p, this.n / 2 - 100, 106, 200, 20, xl.c("addServer.enterIp"));
      this.s.f(128);
      this.s.a(this.r.b);
      this.s.b($$0 -> this.C());
      this.d(this.s);
      this.c(
         fhg.a(fye.a::a)
            .a(fye.a.values())
            .a(this.r.b())
            .a(this.n / 2 - 100, this.o / 4 + 72, 200, 20, xl.c("addServer.resourcePack"), ($$0, $$1) -> this.r.a($$1))
      );
      this.c = this.c(fgz.a(xl.c("addServer.add"), $$0 -> this.m()).a(this.n / 2 - 100, this.o / 4 + 96 + 18, 200, 20).a());
      this.c(fgz.a(xk.e, $$0 -> this.d.accept(false)).a(this.n / 2 - 100, this.o / 4 + 120 + 18, 200, 20).a());
      this.C();
   }

   @Override
   protected void aD_() {
      this.b(this.u);
   }

   @Override
   public void a(ffa $$0, int $$1, int $$2) {
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
      this.c.j = fzh.b(this.s.a()) && !this.u.a().isEmpty();
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, 16777215);
      $$0.b(this.p, a, this.n / 2 - 100 + 1, 53, 10526880);
      $$0.b(this.p, b, this.n / 2 - 100 + 1, 94, 10526880);
      this.u.a($$0, $$1, $$2, $$3);
      this.s.a($$0, $$1, $$2, $$3);
   }
}
