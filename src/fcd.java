import java.util.UUID;
import java.util.function.Supplier;

public class fcd extends fbw<fjq.a> {
   private static final int s = 120;
   private static final int t = 85;
   private static final int u = 178;
   private static final tf v = tf.c("gui.abuseReport.skin.title");
   private final evt w = evt.d().a(8);
   private esy x;
   private esg y;
   private esg z;

   private fcd(eya $$0, fjp $$1, fjq.a $$2) {
      super(v, $$0, $$1, $$2);
   }

   public fcd(eya $$0, fjp $$1, UUID $$2, Supplier<fzu> $$3) {
      this($$0, $$1, new fjq.a($$2, $$3, $$1.a().b()));
   }

   public fcd(eya $$0, fjp $$1, fjq $$2) {
      this($$0, $$1, new fjq.a($$2, $$1.a().b()));
   }

   @Override
   protected void aC_() {
      this.w.c().b();
      this.w.a(new etm(this.e, this.i));
      evt $$0 = this.w.a(evt.e().a(8));
      $$0.c().e();
      $$0.a(new etg(85, 120, this.f.aP(), this.q.e().a()));
      evt $$1 = $$0.a(evt.d().a(8));
      this.z = esg.a(c, $$0x -> this.f.a(new fcc(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.C();
         }))).a(178).a();
      $$1.a(evl.a(this.i, this.z, b));
      this.x = this.a(178, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      $$1.a(evl.a(this.i, this.x, k, $$0x -> $$0x.e(12)));
      evt $$2 = this.w.a(evt.e().a(8));
      $$2.a(esg.a(te.k, $$0x -> this.at_()).a(120).a());
      this.y = $$2.a(esg.a(a, $$0x -> this.l()).a(120).a());
      this.w.a($$1x -> {
         ese var10000 = this.d($$1x);
      });
      this.b();
      this.C();
   }

   @Override
   protected void b() {
      this.w.a();
      evn.a(this.w, this.s());
   }

   private void C() {
      fjn $$0 = this.q.h();
      if ($$0 != null) {
         this.z.b($$0.b());
      } else {
         this.z.b(c);
      }

      fjl.b $$1 = this.q.c();
      this.y.i = $$1 == null;
      this.y.a(x.a($$1, fjl.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.x.b($$0, $$1, $$2);
   }
}
