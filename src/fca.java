import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fca extends fcz {
   private static final vf a = vf.c("addServer.enterIp");
   private exe b;
   private final fob c;
   private exn k;
   private final BooleanConsumer l;
   private final fcz m;

   public fca(fcz $$0, BooleanConsumer $$1, fob $$2) {
      super(vf.c("selectServer.direct"));
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
      this.k = new exn(this.i, this.g / 2 - 100, 116, 200, 20, vf.c("addServer.enterIp"));
      this.k.f(128);
      this.k.a(this.f.m.aa);
      this.k.b($$0 -> this.C());
      this.e(this.k);
      this.b = this.d(exe.a(vf.c("selectServer.select"), $$0 -> this.n()).a(this.g / 2 - 100, this.h / 4 + 96 + 12, 200, 20).a());
      this.d(exe.a(ve.e, $$0 -> this.l.accept(false)).a(this.g / 2 - 100, this.h / 4 + 120 + 12, 200, 20).a());
      this.c(this.k);
      this.C();
   }

   @Override
   public void a(evg $$0, int $$1, int $$2) {
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
      this.b.j = fpd.b(this.k.a());
   }

   @Override
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      $$0.b(this.i, a, this.g / 2 - 100 + 1, 100, 10526880);
      this.k.a($$0, $$1, $$2, $$3);
   }
}
