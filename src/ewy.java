import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class ewy extends exv {
   private static final te a = te.c("addServer.enterName");
   private static final te b = te.c("addServer.enterIp");
   private esi c;
   private final BooleanConsumer k;
   private final fin l;
   private esr m;
   private esr n;
   private final exv o;

   public ewy(exv $$0, BooleanConsumer $$1, fin $$2) {
      super(te.c("addServer.title"));
      this.o = $$0;
      this.k = $$1;
      this.l = $$2;
   }

   @Override
   protected void aE_() {
      this.n = new esr(this.i, this.g / 2 - 100, 66, 200, 20, te.c("addServer.enterName"));
      this.n.a(this.l.a);
      this.n.b($$0 -> this.B());
      this.e(this.n);
      this.m = new esr(this.i, this.g / 2 - 100, 106, 200, 20, te.c("addServer.enterIp"));
      this.m.k(128);
      this.m.a(this.l.b);
      this.m.b($$0 -> this.B());
      this.e(this.m);
      this.d(
         esp.a(fin.a::a)
            .a(fin.a.values())
            .a(this.l.b())
            .a(this.g / 2 - 100, this.h / 4 + 72, 200, 20, te.c("addServer.resourcePack"), ($$0, $$1) -> this.l.a($$1))
      );
      this.c = this.d(esi.a(te.c("addServer.add"), $$0 -> this.l()).a(this.g / 2 - 100, this.h / 4 + 96 + 18, 200, 20).a());
      this.d(esi.a(td.e, $$0 -> this.k.accept(false)).a(this.g / 2 - 100, this.h / 4 + 120 + 18, 200, 20).a());
      this.c(this.n);
      this.B();
   }

   @Override
   public void a(eqn $$0, int $$1, int $$2) {
      String $$3 = this.m.a();
      String $$4 = this.n.a();
      this.b($$0, $$1, $$2);
      this.m.a($$3);
      this.n.a($$4);
   }

   private void l() {
      this.l.a = this.n.a();
      this.l.b = this.m.a();
      this.k.accept(true);
   }

   @Override
   public void au_() {
      this.f.a(this.o);
   }

   private void B() {
      this.c.i = fjk.b(this.m.a()) && !this.n.a().isEmpty();
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, 16777215);
      $$0.b(this.i, a, this.g / 2 - 100, 53, 10526880);
      $$0.b(this.i, b, this.g / 2 - 100, 94, 10526880);
      this.n.a($$0, $$1, $$2, $$3);
      this.m.a($$0, $$1, $$2, $$3);
   }
}
