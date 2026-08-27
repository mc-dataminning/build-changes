import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class eww extends exv {
   private static final te a = te.c("addServer.enterIp");
   private esi b;
   private final fin c;
   private esr k;
   private final BooleanConsumer l;
   private final exv m;

   public eww(exv $$0, BooleanConsumer $$1, fin $$2) {
      super(te.c("selectServer.direct"));
      this.m = $$0;
      this.c = $$2;
      this.l = $$1;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.b.i || this.t() != this.k || $$0 != 257 && $$0 != 335) {
         return super.a($$0, $$1, $$2);
      } else {
         this.l();
         return true;
      }
   }

   @Override
   protected void aE_() {
      this.k = new esr(this.i, this.g / 2 - 100, 116, 200, 20, te.c("addServer.enterIp"));
      this.k.k(128);
      this.k.a(this.f.m.ad);
      this.k.b($$0 -> this.B());
      this.e(this.k);
      this.b = this.d(esi.a(te.c("selectServer.select"), $$0 -> this.l()).a(this.g / 2 - 100, this.h / 4 + 96 + 12, 200, 20).a());
      this.d(esi.a(td.e, $$0 -> this.l.accept(false)).a(this.g / 2 - 100, this.h / 4 + 120 + 12, 200, 20).a());
      this.c(this.k);
      this.B();
   }

   @Override
   public void a(eqn $$0, int $$1, int $$2) {
      String $$3 = this.k.a();
      this.b($$0, $$1, $$2);
      this.k.a($$3);
   }

   private void l() {
      this.c.b = this.k.a();
      this.l.accept(true);
   }

   @Override
   public void au_() {
      this.f.a(this.m);
   }

   @Override
   public void h() {
      this.f.m.ad = this.k.a();
      this.f.m.aq();
   }

   private void B() {
      this.b.i = fjk.b(this.k.a());
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      $$0.b(this.i, a, this.g / 2 - 100, 100, 10526880);
      this.k.a($$0, $$1, $$2, $$3);
   }
}
