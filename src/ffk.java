import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class ffk extends fgh {
   private static final vs a = vs.c("addServer.enterName");
   private static final vs b = vs.c("addServer.enterIp");
   private fak c;
   private final BooleanConsumer k;
   private final frn l;
   private fat m;
   private fat n;
   private final fgh o;

   public ffk(fgh $$0, BooleanConsumer $$1, frn $$2) {
      super(vs.c("addServer.title"));
      this.o = $$0;
      this.k = $$1;
      this.l = $$2;
   }

   @Override
   protected void aP_() {
      this.n = new fat(this.i, this.g / 2 - 100, 66, 200, 20, vs.c("addServer.enterName"));
      this.n.a(this.l.a);
      this.n.b($$0 -> this.E());
      this.d(this.n);
      this.m = new fat(this.i, this.g / 2 - 100, 106, 200, 20, vs.c("addServer.enterIp"));
      this.m.f(128);
      this.m.a(this.l.b);
      this.m.b($$0 -> this.E());
      this.d(this.m);
      this.c(
         far.a(frn.a::a)
            .a(frn.a.values())
            .a(this.l.b())
            .a(this.g / 2 - 100, this.h / 4 + 72, 200, 20, vs.c("addServer.resourcePack"), ($$0, $$1) -> this.l.a($$1))
      );
      this.c = this.c(fak.a(vs.c("addServer.add"), $$0 -> this.o()).a(this.g / 2 - 100, this.h / 4 + 96 + 18, 200, 20).a());
      this.c(fak.a(vr.e, $$0 -> this.k.accept(false)).a(this.g / 2 - 100, this.h / 4 + 120 + 18, 200, 20).a());
      this.E();
   }

   @Override
   protected void aG_() {
      this.b(this.n);
   }

   @Override
   public void a(eyk $$0, int $$1, int $$2) {
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
      this.c.j = fsp.b(this.m.a()) && !this.n.a().isEmpty();
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, 16777215);
      $$0.b(this.i, a, this.g / 2 - 100 + 1, 53, 10526880);
      $$0.b(this.i, b, this.g / 2 - 100 + 1, 94, 10526880);
      this.n.a($$0, $$1, $$2, $$3);
      this.m.a($$0, $$1, $$2, $$3);
   }
}
