import java.util.UUID;

public class fca extends fbw<fjk.a> {
   private static final int s = 120;
   private static final tf t = tf.c("gui.abuseReport.name.title");
   private final evt u = evt.d().a(8);
   private esy v;
   private esg w;

   private fca(eya $$0, fjp $$1, fjk.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fca(eya $$0, fjp $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fjk.a($$2, $$3, $$1.a().b()));
   }

   public fca(eya $$0, fjp $$1, fjk $$2) {
      this($$0, $$1, new fjk.a($$2, $$1.a().b()));
   }

   @Override
   protected void aC_() {
      this.u.c().b();
      this.u.a(new etm(this.e, this.i));
      tf $$0 = tf.b(this.q.e().a()).a(n.o);
      this.u.a(new etm(tf.a("gui.abuseReport.name.reporting", $$0), this.i), $$0x -> $$0x.a().a(0, 8));
      this.v = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      this.u.a(evl.a(this.i, this.v, k, $$0x -> $$0x.e(12)));
      evt $$1 = this.u.a(evt.e().a(8));
      $$1.a(esg.a(te.k, $$0x -> this.at_()).a(120).a());
      this.w = $$1.a(esg.a(a, $$0x -> this.l()).a(120).a());
      this.C();
      this.u.a($$1x -> {
         ese var10000 = this.d($$1x);
      });
      this.b();
   }

   @Override
   protected void b() {
      this.u.a();
      evn.a(this.u, this.s());
   }

   private void C() {
      fjl.b $$0 = this.q.c();
      this.w.i = $$0 == null;
      this.w.a(x.a($$0, fjl.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.v.b($$0, $$1, $$2);
   }
}
