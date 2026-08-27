import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class exd extends eya {
   private static final tf a = tf.c("addServer.enterName");
   private static final tf b = tf.c("addServer.enterIp");
   private esg c;
   private final BooleanConsumer k;
   private final fix l;
   private esp m;
   private esp n;
   private final eya o;

   public exd(eya $$0, BooleanConsumer $$1, fix $$2) {
      super(tf.c("addServer.title"));
      this.o = $$0;
      this.k = $$1;
      this.l = $$2;
   }

   @Override
   protected void aC_() {
      this.n = new esp(this.i, this.g / 2 - 100, 66, 200, 20, tf.c("addServer.enterName"));
      this.n.a(this.l.a);
      this.n.b($$0 -> this.C());
      this.e(this.n);
      this.m = new esp(this.i, this.g / 2 - 100, 106, 200, 20, tf.c("addServer.enterIp"));
      this.m.l(128);
      this.m.a(this.l.b);
      this.m.b($$0 -> this.C());
      this.e(this.m);
      this.d(
         esn.a(fix.a::a)
            .a(fix.a.values())
            .a(this.l.b())
            .a(this.g / 2 - 100, this.h / 4 + 72, 200, 20, tf.c("addServer.resourcePack"), ($$0, $$1) -> this.l.a($$1))
      );
      this.c = this.d(esg.a(tf.c("addServer.add"), $$0 -> this.l()).a(this.g / 2 - 100, this.h / 4 + 96 + 18, 200, 20).a());
      this.d(esg.a(te.e, $$0 -> this.k.accept(false)).a(this.g / 2 - 100, this.h / 4 + 120 + 18, 200, 20).a());
      this.c(this.n);
      this.C();
   }

   @Override
   public void a(eql $$0, int $$1, int $$2) {
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
   public void at_() {
      this.f.a(this.o);
   }

   private void C() {
      this.c.i = fjy.b(this.m.a()) && !this.n.a().isEmpty();
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, 16777215);
      $$0.b(this.i, a, this.g / 2 - 100 + 1, 53, 10526880);
      $$0.b(this.i, b, this.g / 2 - 100 + 1, 94, 10526880);
      this.n.a($$0, $$1, $$2, $$3);
      this.m.a($$0, $$1, $$2, $$3);
   }
}
