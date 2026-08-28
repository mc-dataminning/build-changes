import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fmc extends fnc {
   private static final xo a = xo.c("addServer.enterIp");
   private fhd b;
   private final fyi c;
   private fhm d;
   private final BooleanConsumer r;
   private final fnc s;

   public fmc(fnc $$0, BooleanConsumer $$1, fyi $$2) {
      super(xo.c("selectServer.direct"));
      this.s = $$0;
      this.c = $$2;
      this.r = $$1;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.b.j || this.aG_() != this.d || $$0 != 257 && $$0 != 335) {
         return super.a($$0, $$1, $$2);
      } else {
         this.m();
         return true;
      }
   }

   @Override
   protected void aM_() {
      this.d = new fhm(this.p, this.n / 2 - 100, 116, 200, 20, xo.c("addServer.enterIp"));
      this.d.f(128);
      this.d.a(this.m.m.Z);
      this.d.b($$0 -> this.E());
      this.d(this.d);
      this.b = this.c(fhd.a(xo.c("selectServer.select"), $$0 -> this.m()).a(this.n / 2 - 100, this.o / 4 + 96 + 12, 200, 20).a());
      this.c(fhd.a(xn.e, $$0 -> this.r.accept(false)).a(this.n / 2 - 100, this.o / 4 + 120 + 12, 200, 20).a());
      this.E();
   }

   @Override
   protected void aB_() {
      this.b(this.d);
   }

   @Override
   public void a(ffe $$0, int $$1, int $$2) {
      String $$3 = this.d.a();
      this.b($$0, $$1, $$2);
      this.d.a($$3);
   }

   private void m() {
      this.c.b = this.d.a();
      this.r.accept(true);
   }

   @Override
   public void d() {
      this.m.a(this.s);
   }

   @Override
   public void j() {
      this.m.m.Z = this.d.a();
      this.m.m.av();
   }

   private void E() {
      this.b.j = fzl.b(this.d.a());
   }

   @Override
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
      $$0.b(this.p, a, this.n / 2 - 100 + 1, 100, 10526880);
      this.d.a($$0, $$1, $$2, $$3);
   }
}
