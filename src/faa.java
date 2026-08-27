import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class faa extends faz {
   private static final uv a = uv.c("addServer.enterIp");
   private eve b;
   private final flz c;
   private evn k;
   private final BooleanConsumer l;
   private final faz m;

   public faa(faz $$0, BooleanConsumer $$1, flz $$2) {
      super(uv.c("selectServer.direct"));
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
   protected void aQ_() {
      this.k = new evn(this.i, this.g / 2 - 100, 116, 200, 20, uv.c("addServer.enterIp"));
      this.k.l(128);
      this.k.a(this.f.m.aa);
      this.k.b($$0 -> this.C());
      this.e(this.k);
      this.b = this.d(eve.a(uv.c("selectServer.select"), $$0 -> this.l()).a(this.g / 2 - 100, this.h / 4 + 96 + 12, 200, 20).a());
      this.d(eve.a(uu.e, $$0 -> this.l.accept(false)).a(this.g / 2 - 100, this.h / 4 + 120 + 12, 200, 20).a());
      this.c(this.k);
      this.C();
   }

   @Override
   public void a(eti $$0, int $$1, int $$2) {
      String $$3 = this.k.a();
      this.b($$0, $$1, $$2);
      this.k.a($$3);
   }

   private void l() {
      this.c.b = this.k.a();
      this.l.accept(true);
   }

   @Override
   public void aG_() {
      this.f.a(this.m);
   }

   @Override
   public void aH_() {
      this.f.m.aa = this.k.a();
      this.f.m.as();
   }

   private void C() {
      this.b.i = fna.b(this.k.a());
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      $$0.b(this.i, a, this.g / 2 - 100 + 1, 100, 10526880);
      this.k.a($$0, $$1, $$2, $$3);
   }
}
