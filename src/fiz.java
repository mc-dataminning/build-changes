import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fiz extends fjx {
   private static final wi a = wi.c("addServer.enterName");
   private static final wi b = wi.c("addServer.enterIp");
   private fdy c;
   private final BooleanConsumer d;
   private final fve o;
   private feh p;
   private feh q;
   private final fjx r;

   public fiz(fjx $$0, BooleanConsumer $$1, fve $$2) {
      super(wi.c("addServer.title"));
      this.r = $$0;
      this.d = $$1;
      this.o = $$2;
   }

   @Override
   protected void aM_() {
      this.q = new feh(this.m, this.k / 2 - 100, 66, 200, 20, wi.c("addServer.enterName"));
      this.q.a(this.o.a);
      this.q.b($$0 -> this.C());
      this.d(this.q);
      this.p = new feh(this.m, this.k / 2 - 100, 106, 200, 20, wi.c("addServer.enterIp"));
      this.p.f(128);
      this.p.a(this.o.b);
      this.p.b($$0 -> this.C());
      this.d(this.p);
      this.c(
         fef.a(fve.a::a)
            .a(fve.a.values())
            .a(this.o.b())
            .a(this.k / 2 - 100, this.l / 4 + 72, 200, 20, wi.c("addServer.resourcePack"), ($$0, $$1) -> this.o.a($$1))
      );
      this.c = this.c(fdy.a(wi.c("addServer.add"), $$0 -> this.m()).a(this.k / 2 - 100, this.l / 4 + 96 + 18, 200, 20).a());
      this.c(fdy.a(wh.e, $$0 -> this.d.accept(false)).a(this.k / 2 - 100, this.l / 4 + 120 + 18, 200, 20).a());
      this.C();
   }

   @Override
   protected void aC_() {
      this.b(this.q);
   }

   @Override
   public void a(fby $$0, int $$1, int $$2) {
      String $$3 = this.p.a();
      String $$4 = this.q.a();
      this.b($$0, $$1, $$2);
      this.p.a($$3);
      this.q.a($$4);
   }

   private void m() {
      this.o.a = this.q.a();
      this.o.b = this.p.a();
      this.d.accept(true);
   }

   @Override
   public void d() {
      this.j.a(this.r);
   }

   private void C() {
      this.c.j = fwh.b(this.p.a()) && !this.q.a().isEmpty();
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 17, 16777215);
      $$0.b(this.m, a, this.k / 2 - 100 + 1, 53, 10526880);
      $$0.b(this.m, b, this.k / 2 - 100 + 1, 94, 10526880);
      this.q.a($$0, $$1, $$2, $$3);
      this.p.a($$0, $$1, $$2, $$3);
   }
}
