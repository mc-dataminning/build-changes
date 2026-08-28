import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class ftu extends fum {
   private static final wp a = wp.c("addServer.enterName");
   private static final wp b = wp.c("addServer.enterIp");
   private fou c;
   private final BooleanConsumer d;
   private final ggp s;
   private fpd u;
   private fpd v;
   private final fum w;

   public ftu(fum $$0, BooleanConsumer $$1, ggp $$2) {
      super(wp.c("addServer.title"));
      this.w = $$0;
      this.d = $$1;
      this.s = $$2;
   }

   @Override
   protected void aR_() {
      this.v = new fpd(this.p, this.n / 2 - 100, 66, 200, 20, wp.c("addServer.enterName"));
      this.v.a(this.s.a);
      this.v.b($$0 -> this.E());
      this.d(this.v);
      this.u = new fpd(this.p, this.n / 2 - 100, 106, 200, 20, wp.c("addServer.enterIp"));
      this.u.f(128);
      this.u.a(this.s.b);
      this.u.b($$0 -> this.E());
      this.d(this.u);
      this.c(
         fpb.a(ggp.a::a)
            .a(ggp.a.values())
            .a(this.s.b())
            .a(this.n / 2 - 100, this.o / 4 + 72, 200, 20, wp.c("addServer.resourcePack"), ($$0, $$1) -> this.s.a($$1))
      );
      this.c = this.c(fou.a(wp.c("addServer.add"), $$0 -> this.m()).a(this.n / 2 - 100, this.o / 4 + 96 + 18, 200, 20).a());
      this.c(fou.a(wo.e, $$0 -> this.d.accept(false)).a(this.n / 2 - 100, this.o / 4 + 120 + 18, 200, 20).a());
      this.E();
   }

   @Override
   protected void aF_() {
      this.b(this.v);
   }

   @Override
   public void a(flk $$0, int $$1, int $$2) {
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
   public void aO_() {
      this.m.a(this.w);
   }

   private void E() {
      this.c.j = ghs.b(this.u.a()) && !this.v.a().isEmpty();
   }

   @Override
   public void a(fof $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, 16777215);
      $$0.b(this.p, a, this.n / 2 - 100 + 1, 53, 10526880);
      $$0.b(this.p, b, this.n / 2 - 100 + 1, 94, 10526880);
      this.v.a($$0, $$1, $$2, $$3);
      this.u.a($$0, $$1, $$2, $$3);
   }
}
