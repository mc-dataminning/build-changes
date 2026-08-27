import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fbu extends fct {
   private static final vd a = vd.c("addServer.enterIp");
   private ewy b;
   private final fnv c;
   private exh k;
   private final BooleanConsumer l;
   private final fct m;

   public fbu(fct $$0, BooleanConsumer $$1, fnv $$2) {
      super(vd.c("selectServer.direct"));
      this.m = $$0;
      this.c = $$2;
      this.l = $$1;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.b.j || this.aH_() != this.k || $$0 != 257 && $$0 != 335) {
         return super.a($$0, $$1, $$2);
      } else {
         this.n();
         return true;
      }
   }

   @Override
   protected void aN_() {
      this.k = new exh(this.i, this.g / 2 - 100, 116, 200, 20, vd.c("addServer.enterIp"));
      this.k.e(128);
      this.k.a(this.f.m.aa);
      this.k.b($$0 -> this.C());
      this.e(this.k);
      this.b = this.d(ewy.a(vd.c("selectServer.select"), $$0 -> this.n()).a(this.g / 2 - 100, this.h / 4 + 96 + 12, 200, 20).a());
      this.d(ewy.a(vc.e, $$0 -> this.l.accept(false)).a(this.g / 2 - 100, this.h / 4 + 120 + 12, 200, 20).a());
      this.c(this.k);
      this.C();
   }

   @Override
   public void a(eva $$0, int $$1, int $$2) {
      String $$3 = this.k.a();
      this.b($$0, $$1, $$2);
      this.k.a($$3);
   }

   private void n() {
      this.c.b = this.k.a();
      this.l.accept(true);
   }

   @Override
   public void aE_() {
      this.f.a(this.m);
   }

   @Override
   public void j() {
      this.f.m.aa = this.k.a();
      this.f.m.as();
   }

   private void C() {
      this.b.j = fox.b(this.k.a());
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      $$0.b(this.i, a, this.g / 2 - 100 + 1, 100, 10526880);
      this.k.a($$0, $$1, $$2, $$3);
   }
}
