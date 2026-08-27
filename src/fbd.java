import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fbd extends fcc {
   private static final vb a = vb.c("addServer.enterIp");
   private ewh b;
   private final fne c;
   private ewq k;
   private final BooleanConsumer l;
   private final fcc m;

   public fbd(fcc $$0, BooleanConsumer $$1, fne $$2) {
      super(vb.c("selectServer.direct"));
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
   protected void aP_() {
      this.k = new ewq(this.i, this.g / 2 - 100, 116, 200, 20, vb.c("addServer.enterIp"));
      this.k.l(128);
      this.k.a(this.f.m.aa);
      this.k.b($$0 -> this.C());
      this.e(this.k);
      this.b = this.d(ewh.a(vb.c("selectServer.select"), $$0 -> this.l()).a(this.g / 2 - 100, this.h / 4 + 96 + 12, 200, 20).a());
      this.d(ewh.a(va.e, $$0 -> this.l.accept(false)).a(this.g / 2 - 100, this.h / 4 + 120 + 12, 200, 20).a());
      this.c(this.k);
      this.C();
   }

   @Override
   public void a(euk $$0, int $$1, int $$2) {
      String $$3 = this.k.a();
      this.b($$0, $$1, $$2);
      this.k.a($$3);
   }

   private void l() {
      this.c.b = this.k.a();
      this.l.accept(true);
   }

   @Override
   public void aF_() {
      this.f.a(this.m);
   }

   @Override
   public void aG_() {
      this.f.m.aa = this.k.a();
      this.f.m.as();
   }

   private void C() {
      this.b.i = fof.b(this.k.a());
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      $$0.b(this.i, a, this.g / 2 - 100 + 1, 100, 10526880);
      this.k.a($$0, $$1, $$2, $$3);
   }
}
