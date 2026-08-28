import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fnh extends fob {
   private static final wz a = wz.c("addServer.enterIp");
   private fik b;
   private final fzr c;
   private fit r;
   private final BooleanConsumer s;
   private final fob u;

   public fnh(fob $$0, BooleanConsumer $$1, fzr $$2) {
      super(wz.c("selectServer.direct"));
      this.u = $$0;
      this.c = $$2;
      this.s = $$1;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.b.j || this.aN_() != this.r || $$0 != 257 && $$0 != 335) {
         return super.a($$0, $$1, $$2);
      } else {
         this.m();
         return true;
      }
   }

   @Override
   protected void aT_() {
      this.r = new fit(this.o, this.m / 2 - 100, 116, 200, 20, wz.c("addServer.enterIp"));
      this.r.f(128);
      this.r.a(this.l.m.Z);
      this.r.b($$0 -> this.C());
      this.d(this.r);
      this.b = this.c(fik.a(wz.c("selectServer.select"), $$0 -> this.m()).a(this.m / 2 - 100, this.n / 4 + 96 + 12, 200, 20).a());
      this.c(fik.a(wy.e, $$0 -> this.s.accept(false)).a(this.m / 2 - 100, this.n / 4 + 120 + 12, 200, 20).a());
      this.C();
   }

   @Override
   protected void aI_() {
      this.b(this.r);
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2) {
      String $$3 = this.r.a();
      this.b($$0, $$1, $$2);
      this.r.a($$3);
   }

   private void m() {
      this.c.b = this.r.a();
      this.s.accept(true);
   }

   @Override
   public void d() {
      this.l.a(this.u);
   }

   @Override
   public void j() {
      this.l.m.Z = this.r.a();
      this.l.m.av();
   }

   private void C() {
      this.b.j = gav.b(this.r.a());
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 20, 16777215);
      $$0.b(this.o, a, this.m / 2 - 100 + 1, 100, 10526880);
      this.r.a($$0, $$1, $$2, $$3);
   }
}
