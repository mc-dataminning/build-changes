import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fmp extends fnj {
   private static final wu a = wu.c("addServer.enterIp");
   private fhs b;
   private final fyx c;
   private fib q;
   private final BooleanConsumer r;
   private final fnj s;

   public fmp(fnj $$0, BooleanConsumer $$1, fyx $$2) {
      super(wu.c("selectServer.direct"));
      this.s = $$0;
      this.c = $$2;
      this.r = $$1;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.b.j || this.aJ_() != this.q || $$0 != 257 && $$0 != 335) {
         return super.a($$0, $$1, $$2);
      } else {
         this.m();
         return true;
      }
   }

   @Override
   protected void aP_() {
      this.q = new fib(this.o, this.m / 2 - 100, 116, 200, 20, wu.c("addServer.enterIp"));
      this.q.f(128);
      this.q.a(this.l.m.Z);
      this.q.b($$0 -> this.E());
      this.d(this.q);
      this.b = this.c(fhs.a(wu.c("selectServer.select"), $$0 -> this.m()).a(this.m / 2 - 100, this.n / 4 + 96 + 12, 200, 20).a());
      this.c(fhs.a(wt.e, $$0 -> this.r.accept(false)).a(this.m / 2 - 100, this.n / 4 + 120 + 12, 200, 20).a());
      this.E();
   }

   @Override
   protected void aE_() {
      this.b(this.q);
   }

   @Override
   public void a(fft $$0, int $$1, int $$2) {
      String $$3 = this.q.a();
      this.b($$0, $$1, $$2);
      this.q.a($$3);
   }

   private void m() {
      this.c.b = this.q.a();
      this.r.accept(true);
   }

   @Override
   public void d() {
      this.l.a(this.s);
   }

   @Override
   public void j() {
      this.l.m.Z = this.q.a();
      this.l.m.av();
   }

   private void E() {
      this.b.j = gab.b(this.q.a());
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 20, 16777215);
      $$0.b(this.o, a, this.m / 2 - 100 + 1, 100, 10526880);
      this.q.a($$0, $$1, $$2, $$3);
   }
}
