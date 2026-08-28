import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fqv extends frp {
   private static final xl a = xl.c("addServer.enterIp");
   private flw b;
   private final gdm c;
   private fmf d;
   private final BooleanConsumer s;
   private final frp u;

   public fqv(frp $$0, BooleanConsumer $$1, gdm $$2) {
      super(xl.c("selectServer.direct"));
      this.u = $$0;
      this.c = $$2;
      this.s = $$1;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.b.j || this.aL_() != this.d || $$0 != 257 && $$0 != 335) {
         return super.a($$0, $$1, $$2);
      } else {
         this.m();
         return true;
      }
   }

   @Override
   protected void aS_() {
      this.d = new fmf(this.p, this.n / 2 - 100, 116, 200, 20, xl.c("addServer.enterIp"));
      this.d.f(128);
      this.d.a(this.m.n.Y);
      this.d.b($$0 -> this.D());
      this.d(this.d);
      this.b = this.c(flw.a(xl.c("selectServer.select"), $$0 -> this.m()).a(this.n / 2 - 100, this.o / 4 + 96 + 12, 200, 20).a());
      this.c(flw.a(xk.e, $$0 -> this.s.accept(false)).a(this.n / 2 - 100, this.o / 4 + 120 + 12, 200, 20).a());
      this.D();
   }

   @Override
   protected void aG_() {
      this.b(this.d);
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2) {
      String $$3 = this.d.a();
      this.b($$0, $$1, $$2);
      this.d.a($$3);
   }

   private void m() {
      this.c.b = this.d.a();
      this.s.accept(true);
   }

   @Override
   public void aP_() {
      this.m.a(this.u);
   }

   @Override
   public void j() {
      this.m.n.Y = this.d.a();
      this.m.n.ay();
   }

   private void D() {
      this.b.j = gep.b(this.d.a());
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
      $$0.b(this.p, a, this.n / 2 - 100 + 1, 100, 10526880);
      this.d.a($$0, $$1, $$2, $$3);
   }
}
