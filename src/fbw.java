import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fbw extends fct {
   private static final vd a = vd.c("addServer.enterName");
   private static final vd b = vd.c("addServer.enterIp");
   private ewy c;
   private final BooleanConsumer k;
   private final fnv l;
   private exh m;
   private exh n;
   private final fct o;

   public fbw(fct $$0, BooleanConsumer $$1, fnv $$2) {
      super(vd.c("addServer.title"));
      this.o = $$0;
      this.k = $$1;
      this.l = $$2;
   }

   @Override
   protected void aN_() {
      this.n = new exh(this.i, this.g / 2 - 100, 66, 200, 20, vd.c("addServer.enterName"));
      this.n.a(this.l.a);
      this.n.b($$0 -> this.C());
      this.e(this.n);
      this.m = new exh(this.i, this.g / 2 - 100, 106, 200, 20, vd.c("addServer.enterIp"));
      this.m.e(128);
      this.m.a(this.l.b);
      this.m.b($$0 -> this.C());
      this.e(this.m);
      this.d(
         exf.a(fnv.a::a)
            .a(fnv.a.values())
            .a(this.l.b())
            .a(this.g / 2 - 100, this.h / 4 + 72, 200, 20, vd.c("addServer.resourcePack"), ($$0, $$1) -> this.l.a($$1))
      );
      this.c = this.d(ewy.a(vd.c("addServer.add"), $$0 -> this.n()).a(this.g / 2 - 100, this.h / 4 + 96 + 18, 200, 20).a());
      this.d(ewy.a(vc.e, $$0 -> this.k.accept(false)).a(this.g / 2 - 100, this.h / 4 + 120 + 18, 200, 20).a());
      this.c(this.n);
      this.C();
   }

   @Override
   public void a(eva $$0, int $$1, int $$2) {
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

   private void C() {
      this.c.j = fox.b(this.m.a()) && !this.n.a().isEmpty();
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, 16777215);
      $$0.b(this.i, a, this.g / 2 - 100 + 1, 53, 10526880);
      $$0.b(this.i, b, this.g / 2 - 100 + 1, 94, 10526880);
      this.n.a($$0, $$1, $$2, $$3);
      this.m.a($$0, $$1, $$2, $$3);
   }
}
