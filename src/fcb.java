public class fcb extends eya {
   private static final tf a = tf.c("gui.abuseReport.title");
   private static final tf b = tf.c("gui.abuseReport.message");
   private static final tf c = tf.c("gui.abuseReport.type.chat");
   private static final tf k = tf.c("gui.abuseReport.type.skin");
   private static final tf l = tf.c("gui.abuseReport.type.name");
   private static final int m = 6;
   private final eya n;
   private final fjp o;
   private final fcf p;
   private final evt q = evt.d().a(6);

   public fcb(eya $$0, fjp $$1, fcf $$2) {
      super(a);
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   @Override
   public tf e() {
      return te.a(super.e(), b);
   }

   @Override
   protected void aC_() {
      this.q.c().b();
      this.q.a(new etm(this.e, this.i), this.q.b().e(6));
      this.q.a(new eta(b, this.i).b(true), this.q.b().e(6));
      esg $$0 = this.q.a(esg.a(c, $$0x -> this.f.a(new fbx(this.n, this.o, this.p.e()))).a());
      if (!this.p.j()) {
         $$0.i = false;
         $$0.a(etq.a(tf.c("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.p.h()) {
         $$0.i = false;
         $$0.a(etq.a(tf.a("gui.socialInteractions.tooltip.report.no_messages", this.p.d())));
      }

      this.q.a(esg.a(k, $$0x -> this.f.a(new fcd(this.n, this.o, this.p.e(), this.p.f()))).a());
      this.q.a(esg.a(l, $$0x -> this.f.a(new fca(this.n, this.o, this.p.e(), this.p.d()))).a());
      this.q.a(evu.b(20));
      this.q.a(esg.a(te.e, $$0x -> this.at_()).a());
      this.q.a($$1 -> {
         ese var10000 = this.d($$1);
      });
      this.b();
   }

   @Override
   protected void b() {
      this.q.a();
      evn.a(this.q, this.s());
   }

   @Override
   public void at_() {
      this.f.a(this.n);
   }
}
