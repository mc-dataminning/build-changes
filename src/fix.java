import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fix extends fjx {
   private static final wi a = wi.c("addServer.enterIp");
   private fdy b;
   private final fve c;
   private feh d;
   private final BooleanConsumer o;
   private final fjx p;

   public fix(fjx $$0, BooleanConsumer $$1, fve $$2) {
      super(wi.c("selectServer.direct"));
      this.p = $$0;
      this.c = $$2;
      this.o = $$1;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.b.j || this.aH_() != this.d || $$0 != 257 && $$0 != 335) {
         return super.a($$0, $$1, $$2);
      } else {
         this.m();
         return true;
      }
   }

   @Override
   protected void aM_() {
      this.d = new feh(this.m, this.k / 2 - 100, 116, 200, 20, wi.c("addServer.enterIp"));
      this.d.f(128);
      this.d.a(this.j.m.aa);
      this.d.b($$0 -> this.C());
      this.d(this.d);
      this.b = this.c(fdy.a(wi.c("selectServer.select"), $$0 -> this.m()).a(this.k / 2 - 100, this.l / 4 + 96 + 12, 200, 20).a());
      this.c(fdy.a(wh.e, $$0 -> this.o.accept(false)).a(this.k / 2 - 100, this.l / 4 + 120 + 12, 200, 20).a());
      this.C();
   }

   @Override
   protected void aC_() {
      this.b(this.d);
   }

   @Override
   public void a(fby $$0, int $$1, int $$2) {
      String $$3 = this.d.a();
      this.b($$0, $$1, $$2);
      this.d.a($$3);
   }

   private void m() {
      this.c.b = this.d.a();
      this.o.accept(true);
   }

   @Override
   public void d() {
      this.j.a(this.p);
   }

   @Override
   public void j() {
      this.j.m.aa = this.d.a();
      this.j.m.av();
   }

   private void C() {
      this.b.j = fwh.b(this.d.a());
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 20, 16777215);
      $$0.b(this.m, a, this.k / 2 - 100 + 1, 100, 10526880);
      this.d.a($$0, $$1, $$2, $$3);
   }
}
