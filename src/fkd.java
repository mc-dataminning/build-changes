import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fkd extends fld {
   private static final wu a = wu.c("addServer.enterIp");
   private ffe b;
   private final fwk c;
   private ffn d;
   private final BooleanConsumer r;
   private final fld s;

   public fkd(fld $$0, BooleanConsumer $$1, fwk $$2) {
      super(wu.c("selectServer.direct"));
      this.s = $$0;
      this.c = $$2;
      this.r = $$1;
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
      this.d = new ffn(this.p, this.n / 2 - 100, 116, 200, 20, wu.c("addServer.enterIp"));
      this.d.f(128);
      this.d.a(this.m.m.aa);
      this.d.b($$0 -> this.C());
      this.d(this.d);
      this.b = this.c(ffe.a(wu.c("selectServer.select"), $$0 -> this.m()).a(this.n / 2 - 100, this.o / 4 + 96 + 12, 200, 20).a());
      this.c(ffe.a(wt.e, $$0 -> this.r.accept(false)).a(this.n / 2 - 100, this.o / 4 + 120 + 12, 200, 20).a());
      this.C();
   }

   @Override
   protected void aC_() {
      this.b(this.d);
   }

   @Override
   public void a(fde $$0, int $$1, int $$2) {
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
      this.m.m.aa = this.d.a();
      this.m.m.av();
   }

   private void C() {
      this.b.j = fxn.b(this.d.a());
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
      $$0.b(this.p, a, this.n / 2 - 100 + 1, 100, 10526880);
      this.d.a($$0, $$1, $$2, $$3);
   }
}
