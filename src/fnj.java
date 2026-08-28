import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fnj extends fob {
   private static final wz a = wz.c("addServer.enterName");
   private static final wz b = wz.c("addServer.enterIp");
   private fik c;
   private final BooleanConsumer r;
   private final fzr s;
   private fit u;
   private fit v;
   private final fob w;

   public fnj(fob $$0, BooleanConsumer $$1, fzr $$2) {
      super(wz.c("addServer.title"));
      this.w = $$0;
      this.r = $$1;
      this.s = $$2;
   }

   @Override
   protected void aT_() {
      this.v = new fit(this.o, this.m / 2 - 100, 66, 200, 20, wz.c("addServer.enterName"));
      this.v.a(this.s.a);
      this.v.b($$0 -> this.C());
      this.d(this.v);
      this.u = new fit(this.o, this.m / 2 - 100, 106, 200, 20, wz.c("addServer.enterIp"));
      this.u.f(128);
      this.u.a(this.s.b);
      this.u.b($$0 -> this.C());
      this.d(this.u);
      this.c(
         fir.a(fzr.a::a)
            .a(fzr.a.values())
            .a(this.s.b())
            .a(this.m / 2 - 100, this.n / 4 + 72, 200, 20, wz.c("addServer.resourcePack"), ($$0, $$1) -> this.s.a($$1))
      );
      this.c = this.c(fik.a(wz.c("addServer.add"), $$0 -> this.m()).a(this.m / 2 - 100, this.n / 4 + 96 + 18, 200, 20).a());
      this.c(fik.a(wy.e, $$0 -> this.r.accept(false)).a(this.m / 2 - 100, this.n / 4 + 120 + 18, 200, 20).a());
      this.C();
   }

   @Override
   protected void aI_() {
      this.b(this.v);
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2) {
      String $$3 = this.u.a();
      String $$4 = this.v.a();
      this.b($$0, $$1, $$2);
      this.u.a($$3);
      this.v.a($$4);
   }

   private void m() {
      this.s.a = this.v.a();
      this.s.b = this.u.a();
      this.r.accept(true);
   }

   @Override
   public void d() {
      this.l.a(this.w);
   }

   private void C() {
      this.c.j = gav.b(this.u.a()) && !this.v.a().isEmpty();
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 17, 16777215);
      $$0.b(this.o, a, this.m / 2 - 100 + 1, 53, 10526880);
      $$0.b(this.o, b, this.m / 2 - 100 + 1, 94, 10526880);
      this.v.a($$0, $$1, $$2, $$3);
      this.u.a($$0, $$1, $$2, $$3);
   }
}
