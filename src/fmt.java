import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fmt extends fnl {
   private static final wu a = wu.c("addServer.enterName");
   private static final wu b = wu.c("addServer.enterIp");
   private fhu c;
   private final BooleanConsumer q;
   private final fyz r;
   private fid s;
   private fid u;
   private final fnl v;

   public fmt(fnl $$0, BooleanConsumer $$1, fyz $$2) {
      super(wu.c("addServer.title"));
      this.v = $$0;
      this.q = $$1;
      this.r = $$2;
   }

   @Override
   protected void aP_() {
      this.u = new fid(this.o, this.m / 2 - 100, 66, 200, 20, wu.c("addServer.enterName"));
      this.u.a(this.r.a);
      this.u.b($$0 -> this.D());
      this.d(this.u);
      this.s = new fid(this.o, this.m / 2 - 100, 106, 200, 20, wu.c("addServer.enterIp"));
      this.s.f(128);
      this.s.a(this.r.b);
      this.s.b($$0 -> this.D());
      this.d(this.s);
      this.c(
         fib.a(fyz.a::a)
            .a(fyz.a.values())
            .a(this.r.b())
            .a(this.m / 2 - 100, this.n / 4 + 72, 200, 20, wu.c("addServer.resourcePack"), ($$0, $$1) -> this.r.a($$1))
      );
      this.c = this.c(fhu.a(wu.c("addServer.add"), $$0 -> this.m()).a(this.m / 2 - 100, this.n / 4 + 96 + 18, 200, 20).a());
      this.c(fhu.a(wt.e, $$0 -> this.q.accept(false)).a(this.m / 2 - 100, this.n / 4 + 120 + 18, 200, 20).a());
      this.D();
   }

   @Override
   protected void aE_() {
      this.b(this.u);
   }

   @Override
   public void a(ffw $$0, int $$1, int $$2) {
      String $$3 = this.s.a();
      String $$4 = this.u.a();
      this.b($$0, $$1, $$2);
      this.s.a($$3);
      this.u.a($$4);
   }

   private void m() {
      this.r.a = this.u.a();
      this.r.b = this.s.a();
      this.q.accept(true);
   }

   @Override
   public void d() {
      this.l.a(this.v);
   }

   private void D() {
      this.c.j = gad.b(this.s.a()) && !this.u.a().isEmpty();
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 17, 16777215);
      $$0.b(this.o, a, this.m / 2 - 100 + 1, 53, 10526880);
      $$0.b(this.o, b, this.m / 2 - 100 + 1, 94, 10526880);
      this.u.a($$0, $$1, $$2, $$3);
      this.s.a($$0, $$1, $$2, $$3);
   }
}
