import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class exi extends eyf {
   private static final ti a = ti.c("addServer.enterName");
   private static final ti b = ti.c("addServer.enterIp");
   private esl c;
   private final BooleanConsumer k;
   private final fjc l;
   private esu m;
   private esu n;
   private final eyf o;

   public exi(eyf $$0, BooleanConsumer $$1, fjc $$2) {
      super(ti.c("addServer.title"));
      this.o = $$0;
      this.k = $$1;
      this.l = $$2;
   }

   @Override
   protected void aD_() {
      this.n = new esu(this.i, this.g / 2 - 100, 66, 200, 20, ti.c("addServer.enterName"));
      this.n.a(this.l.a);
      this.n.b($$0 -> this.C());
      this.e(this.n);
      this.m = new esu(this.i, this.g / 2 - 100, 106, 200, 20, ti.c("addServer.enterIp"));
      this.m.l(128);
      this.m.a(this.l.b);
      this.m.b($$0 -> this.C());
      this.e(this.m);
      this.d(
         ess.a(fjc.a::a)
            .a(fjc.a.values())
            .a(this.l.b())
            .a(this.g / 2 - 100, this.h / 4 + 72, 200, 20, ti.c("addServer.resourcePack"), ($$0, $$1) -> this.l.a($$1))
      );
      this.c = this.d(esl.a(ti.c("addServer.add"), $$0 -> this.l()).a(this.g / 2 - 100, this.h / 4 + 96 + 18, 200, 20).a());
      this.d(esl.a(th.e, $$0 -> this.k.accept(false)).a(this.g / 2 - 100, this.h / 4 + 120 + 18, 200, 20).a());
      this.c(this.n);
      this.C();
   }

   @Override
   public void a(eqq $$0, int $$1, int $$2) {
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

   private void C() {
      this.c.i = fkd.b(this.m.a()) && !this.n.a().isEmpty();
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, 16777215);
      $$0.b(this.i, a, this.g / 2 - 100 + 1, 53, 10526880);
      $$0.b(this.i, b, this.g / 2 - 100 + 1, 94, 10526880);
      this.n.a($$0, $$1, $$2, $$3);
      this.m.a($$0, $$1, $$2, $$3);
   }
}
