import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class etu extends euq {
   private static final sw a = sw.c("addServer.enterName");
   private static final sw b = sw.c("addServer.enterIp");
   private epi c;
   private final BooleanConsumer k;
   private final ffd l;
   private epr m;
   private epr n;
   private final euq o;

   public etu(euq $$0, BooleanConsumer $$1, ffd $$2) {
      super(sw.c("addServer.title"));
      this.o = $$0;
      this.k = $$1;
      this.l = $$2;
   }

   @Override
   public void f() {
      this.n.a();
      this.m.a();
   }

   @Override
   protected void b() {
      this.n = new epr(this.i, this.g / 2 - 100, 66, 200, 20, sw.c("addServer.enterName"));
      this.n.a(this.l.a);
      this.n.b($$0 -> this.B());
      this.e(this.n);
      this.m = new epr(this.i, this.g / 2 - 100, 106, 200, 20, sw.c("addServer.enterIp"));
      this.m.m(128);
      this.m.a(this.l.b);
      this.m.b($$0 -> this.B());
      this.e(this.m);
      this.d(
         epp.a(ffd.a::a)
            .a(ffd.a.values())
            .a(this.l.b())
            .a(this.g / 2 - 100, this.h / 4 + 72, 200, 20, sw.c("addServer.resourcePack"), ($$0, $$1) -> this.l.a($$1))
      );
      this.c = this.d(epi.a(sw.c("addServer.add"), $$0 -> this.l()).a(this.g / 2 - 100, this.h / 4 + 96 + 18, 200, 20).a());
      this.d(epi.a(sv.e, $$0 -> this.k.accept(false)).a(this.g / 2 - 100, this.h / 4 + 120 + 18, 200, 20).a());
      this.c(this.n);
      this.B();
   }

   @Override
   public void a(enn $$0, int $$1, int $$2) {
      String $$3 = this.m.b();
      String $$4 = this.n.b();
      this.b($$0, $$1, $$2);
      this.m.a($$3);
      this.n.a($$4);
   }

   private void l() {
      this.l.a = this.n.b();
      this.l.b = this.m.b();
      this.k.accept(true);
   }

   @Override
   public void aw_() {
      this.f.a(this.o);
   }

   private void B() {
      this.c.r = fga.b(this.m.b()) && !this.n.b().isEmpty();
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      $$0.a(this.i, this.e, this.g / 2, 17, 16777215);
      $$0.b(this.i, a, this.g / 2 - 100, 53, 10526880);
      $$0.b(this.i, b, this.g / 2 - 100, 94, 10526880);
      this.n.a($$0, $$1, $$2, $$3);
      this.m.a($$0, $$1, $$2, $$3);
      super.a($$0, $$1, $$2, $$3);
   }
}
