import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class ftd extends ftx {
   private static final xv a = xv.c("addServer.enterIp");
   private foe b;
   private final gfy c;
   private fon d;
   private final BooleanConsumer s;
   private final ftx u;

   public ftd(ftx $$0, BooleanConsumer $$1, gfy $$2) {
      super(xv.c("selectServer.direct"));
      this.u = $$0;
      this.c = $$2;
      this.s = $$1;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.b.j || this.aM_() != this.d || $$0 != 257 && $$0 != 335) {
         return super.a($$0, $$1, $$2);
      } else {
         this.l();
         return true;
      }
   }

   @Override
   protected void aT_() {
      this.d = new fon(this.p, this.n / 2 - 100, 116, 200, 20, xv.c("addServer.enterIp"));
      this.d.f(128);
      this.d.a(this.m.n.Y);
      this.d.b($$0 -> this.E());
      this.d(this.d);
      this.b = this.c(foe.a(xv.c("selectServer.select"), $$0 -> this.l()).a(this.n / 2 - 100, this.o / 4 + 96 + 12, 200, 20).a());
      this.c(foe.a(xu.e, $$0 -> this.s.accept(false)).a(this.n / 2 - 100, this.o / 4 + 120 + 12, 200, 20).a());
      this.E();
   }

   @Override
   protected void aG_() {
      this.b(this.d);
   }

   @Override
   public void a(fmf $$0, int $$1, int $$2) {
      String $$3 = this.d.a();
      this.b($$0, $$1, $$2);
      this.d.a($$3);
   }

   private void l() {
      this.c.b = this.d.a();
      this.s.accept(true);
   }

   @Override
   public void aP_() {
      this.m.a(this.u);
   }

   @Override
   public void aJ_() {
      this.m.n.Y = this.d.a();
      this.m.n.az();
   }

   private void E() {
      this.b.j = ghb.b(this.d.a());
   }

   @Override
   public void a(fnr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
      $$0.b(this.p, a, this.n / 2 - 100 + 1, 100, 10526880);
      this.d.a($$0, $$1, $$2, $$3);
   }
}
