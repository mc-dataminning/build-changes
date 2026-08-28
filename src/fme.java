import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fme extends fne {
   private static final xp a = xp.c("addServer.enterIp");
   private fhf b;
   private final fyk c;
   private fho d;
   private final BooleanConsumer r;
   private final fne s;

   public fme(fne $$0, BooleanConsumer $$1, fyk $$2) {
      super(xp.c("selectServer.direct"));
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
      this.d = new fho(this.p, this.n / 2 - 100, 116, 200, 20, xp.c("addServer.enterIp"));
      this.d.f(128);
      this.d.a(this.m.m.Z);
      this.d.b($$0 -> this.E());
      this.d(this.d);
      this.b = this.c(fhf.a(xp.c("selectServer.select"), $$0 -> this.m()).a(this.n / 2 - 100, this.o / 4 + 96 + 12, 200, 20).a());
      this.c(fhf.a(xo.e, $$0 -> this.r.accept(false)).a(this.n / 2 - 100, this.o / 4 + 120 + 12, 200, 20).a());
      this.E();
   }

   @Override
   protected void aB_() {
      this.b(this.d);
   }

   @Override
   public void a(ffg $$0, int $$1, int $$2) {
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
      this.b.j = fzn.b(this.d.a());
   }

   @Override
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
      $$0.b(this.p, a, this.n / 2 - 100 + 1, 100, 10526880);
      this.d.a($$0, $$1, $$2, $$3);
   }
}
