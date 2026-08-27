import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fcd extends fda {
   private static final vf a = vf.c("addServer.enterName");
   private static final vf b = vf.c("addServer.enterIp");
   private exf c;
   private final BooleanConsumer k;
   private final foc l;
   private exo m;
   private exo n;
   private final fda o;

   public fcd(fda $$0, BooleanConsumer $$1, foc $$2) {
      super(vf.c("addServer.title"));
      this.o = $$0;
      this.k = $$1;
      this.l = $$2;
   }

   @Override
   protected void aN_() {
      this.n = new exo(this.i, this.g / 2 - 100, 66, 200, 20, vf.c("addServer.enterName"));
      this.n.a(this.l.a);
      this.n.b($$0 -> this.D());
      this.e(this.n);
      this.m = new exo(this.i, this.g / 2 - 100, 106, 200, 20, vf.c("addServer.enterIp"));
      this.m.f(128);
      this.m.a(this.l.b);
      this.m.b($$0 -> this.D());
      this.e(this.m);
      this.d(
         exm.a(foc.a::a)
            .a(foc.a.values())
            .a(this.l.b())
            .a(this.g / 2 - 100, this.h / 4 + 72, 200, 20, vf.c("addServer.resourcePack"), ($$0, $$1) -> this.l.a($$1))
      );
      this.c = this.d(exf.a(vf.c("addServer.add"), $$0 -> this.n()).a(this.g / 2 - 100, this.h / 4 + 96 + 18, 200, 20).a());
      this.d(exf.a(ve.e, $$0 -> this.k.accept(false)).a(this.g / 2 - 100, this.h / 4 + 120 + 18, 200, 20).a());
      this.c(this.n);
      this.D();
   }

   @Override
   public void a(evh $$0, int $$1, int $$2) {
      String $$3 = this.m.a();
      String $$4 = this.n.a();
      this.b($$0, $$1, $$2);
      this.m.a($$3);
      this.n.a($$4);
   }

   private void n() {
      this.l.a = this.n.a();
      this.l.b = this.m.a();
      this.k.accept(true);
   }

   @Override
   public void aE_() {
      this.f.a(this.o);
   }

   private void D() {
      this.c.j = fpe.b(this.m.a()) && !this.n.a().isEmpty();
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, 16777215);
      $$0.b(this.i, a, this.g / 2 - 100 + 1, 53, 10526880);
      $$0.b(this.i, b, this.g / 2 - 100 + 1, 94, 10526880);
      this.n.a($$0, $$1, $$2, $$3);
      this.m.a($$0, $$1, $$2, $$3);
   }
}
