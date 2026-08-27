import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class exb extends eya {
   private static final tf a = tf.c("addServer.enterIp");
   private esg b;
   private final fix c;
   private esp k;
   private final BooleanConsumer l;
   private final eya m;

   public exb(eya $$0, BooleanConsumer $$1, fix $$2) {
      super(tf.c("selectServer.direct"));
      this.m = $$0;
      this.c = $$2;
      this.l = $$1;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.b.i || this.t() != this.k || $$0 != 257 && $$0 != 335) {
         return super.a($$0, $$1, $$2);
      } else {
         this.l();
         return true;
      }
   }

   @Override
   protected void aC_() {
      this.k = new esp(this.i, this.g / 2 - 100, 116, 200, 20, tf.c("addServer.enterIp"));
      this.k.l(128);
      this.k.a(this.f.m.aa);
      this.k.b($$0 -> this.C());
      this.e(this.k);
      this.b = this.d(esg.a(tf.c("selectServer.select"), $$0 -> this.l()).a(this.g / 2 - 100, this.h / 4 + 96 + 12, 200, 20).a());
      this.d(esg.a(te.e, $$0 -> this.l.accept(false)).a(this.g / 2 - 100, this.h / 4 + 120 + 12, 200, 20).a());
      this.c(this.k);
      this.C();
   }

   @Override
   public void a(eql $$0, int $$1, int $$2) {
      String $$3 = this.k.a();
      this.b($$0, $$1, $$2);
      this.k.a($$3);
   }

   private void l() {
      this.c.b = this.k.a();
      this.l.accept(true);
   }

   @Override
   public void at_() {
      this.f.a(this.m);
   }

   @Override
   public void h() {
      this.f.m.aa = this.k.a();
      this.f.m.ar();
   }

   private void C() {
      this.b.i = fjy.b(this.k.a());
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      $$0.b(this.i, a, this.g / 2 - 100 + 1, 100, 10526880);
      this.k.a($$0, $$1, $$2, $$3);
   }
}
