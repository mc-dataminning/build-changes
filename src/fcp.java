import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fcp extends fdm {
   private static final vg a = vg.c("addServer.enterName");
   private static final vg b = vg.c("addServer.enterIp");
   private exr c;
   private final BooleanConsumer k;
   private final fop l;
   private eya m;
   private eya n;
   private final fdm o;

   public fcp(fdm $$0, BooleanConsumer $$1, fop $$2) {
      super(vg.c("addServer.title"));
      this.o = $$0;
      this.k = $$1;
      this.l = $$2;
   }

   @Override
   protected void aP_() {
      this.n = new eya(this.i, this.g / 2 - 100, 66, 200, 20, vg.c("addServer.enterName"));
      this.n.a(this.l.a);
      this.n.b($$0 -> this.E());
      this.e(this.n);
      this.m = new eya(this.i, this.g / 2 - 100, 106, 200, 20, vg.c("addServer.enterIp"));
      this.m.f(128);
      this.m.a(this.l.b);
      this.m.b($$0 -> this.E());
      this.e(this.m);
      this.d(
         exy.a(fop.a::a)
            .a(fop.a.values())
            .a(this.l.b())
            .a(this.g / 2 - 100, this.h / 4 + 72, 200, 20, vg.c("addServer.resourcePack"), ($$0, $$1) -> this.l.a($$1))
      );
      this.c = this.d(exr.a(vg.c("addServer.add"), $$0 -> this.o()).a(this.g / 2 - 100, this.h / 4 + 96 + 18, 200, 20).a());
      this.d(exr.a(vf.e, $$0 -> this.k.accept(false)).a(this.g / 2 - 100, this.h / 4 + 120 + 18, 200, 20).a());
      this.c(this.n);
      this.E();
   }

   @Override
   public void a(evr $$0, int $$1, int $$2) {
      String $$3 = this.m.a();
      String $$4 = this.n.a();
      this.b($$0, $$1, $$2);
      this.m.a($$3);
      this.n.a($$4);
   }

   private void o() {
      this.l.a = this.n.a();
      this.l.b = this.m.a();
      this.k.accept(true);
   }

   @Override
   public void d() {
      this.f.a(this.o);
   }

   private void E() {
      this.c.j = fpr.b(this.m.a()) && !this.n.a().isEmpty();
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, 16777215);
      $$0.b(this.i, a, this.g / 2 - 100 + 1, 53, 10526880);
      $$0.b(this.i, b, this.g / 2 - 100 + 1, 94, 10526880);
      this.n.a($$0, $$1, $$2, $$3);
      this.m.a($$0, $$1, $$2, $$3);
   }
}
