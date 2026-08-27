import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fcn extends fdm {
   private static final vg a = vg.c("addServer.enterIp");
   private exr b;
   private final fop c;
   private eya k;
   private final BooleanConsumer l;
   private final fdm m;

   public fcn(fdm $$0, BooleanConsumer $$1, fop $$2) {
      super(vg.c("selectServer.direct"));
      this.m = $$0;
      this.c = $$2;
      this.l = $$1;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.b.j || this.aJ_() != this.k || $$0 != 257 && $$0 != 335) {
         return super.a($$0, $$1, $$2);
      } else {
         this.o();
         return true;
      }
   }

   @Override
   protected void aP_() {
      this.k = new eya(this.i, this.g / 2 - 100, 116, 200, 20, vg.c("addServer.enterIp"));
      this.k.f(128);
      this.k.a(this.f.m.aa);
      this.k.b($$0 -> this.E());
      this.e(this.k);
      this.b = this.d(exr.a(vg.c("selectServer.select"), $$0 -> this.o()).a(this.g / 2 - 100, this.h / 4 + 96 + 12, 200, 20).a());
      this.d(exr.a(vf.e, $$0 -> this.l.accept(false)).a(this.g / 2 - 100, this.h / 4 + 120 + 12, 200, 20).a());
      this.c(this.k);
      this.E();
   }

   @Override
   public void a(evr $$0, int $$1, int $$2) {
      String $$3 = this.k.a();
      this.b($$0, $$1, $$2);
      this.k.a($$3);
   }

   private void o() {
      this.c.b = this.k.a();
      this.l.accept(true);
   }

   @Override
   public void d() {
      this.f.a(this.m);
   }

   @Override
   public void k() {
      this.f.m.aa = this.k.a();
      this.f.m.as();
   }

   private void E() {
      this.b.j = fpr.b(this.k.a());
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      $$0.b(this.i, a, this.g / 2 - 100 + 1, 100, 10526880);
      this.k.a($$0, $$1, $$2, $$3);
   }
}
