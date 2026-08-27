import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class flb extends flz {
   private static final wx a = wx.c("addServer.enterName");
   private static final wx b = wx.c("addServer.enterIp");
   private fga c;
   private final BooleanConsumer d;
   private final fxf r;
   private fgj s;
   private fgj u;
   private final flz v;

   public flb(flz $$0, BooleanConsumer $$1, fxf $$2) {
      super(wx.c("addServer.title"));
      this.v = $$0;
      this.d = $$1;
      this.r = $$2;
   }

   @Override
   protected void aN_() {
      this.u = new fgj(this.p, this.n / 2 - 100, 66, 200, 20, wx.c("addServer.enterName"));
      this.u.a(this.r.a);
      this.u.b($$0 -> this.C());
      this.d(this.u);
      this.s = new fgj(this.p, this.n / 2 - 100, 106, 200, 20, wx.c("addServer.enterIp"));
      this.s.f(128);
      this.s.a(this.r.b);
      this.s.b($$0 -> this.C());
      this.d(this.s);
      this.c(
         fgh.a(fxf.a::a)
            .a(fxf.a.values())
            .a(this.r.b())
            .a(this.n / 2 - 100, this.o / 4 + 72, 200, 20, wx.c("addServer.resourcePack"), ($$0, $$1) -> this.r.a($$1))
      );
      this.c = this.c(fga.a(wx.c("addServer.add"), $$0 -> this.m()).a(this.n / 2 - 100, this.o / 4 + 96 + 18, 200, 20).a());
      this.c(fga.a(ww.e, $$0 -> this.d.accept(false)).a(this.n / 2 - 100, this.o / 4 + 120 + 18, 200, 20).a());
      this.C();
   }

   @Override
   protected void aD_() {
      this.b(this.u);
   }

   @Override
   public void a(feb $$0, int $$1, int $$2) {
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
      this.c.j = fyi.b(this.s.a()) && !this.u.a().isEmpty();
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, 16777215);
      $$0.b(this.p, a, this.n / 2 - 100 + 1, 53, 10526880);
      $$0.b(this.p, b, this.n / 2 - 100 + 1, 94, 10526880);
      this.u.a($$0, $$1, $$2, $$3);
      this.s.a($$0, $$1, $$2, $$3);
   }
}
