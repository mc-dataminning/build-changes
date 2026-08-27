import java.util.UUID;
import java.util.function.Supplier;

public class fcp extends fci<fkc.a> {
   private static final int s = 120;
   private static final int t = 85;
   private static final int u = 178;
   private static final tn v = tn.c("gui.abuseReport.skin.title");
   private final ewf w = ewf.d().a(8);
   private etk x;
   private ess y;
   private ess z;

   private fcp(eym $$0, fkb $$1, fkc.a $$2) {
      super(v, $$0, $$1, $$2);
   }

   public fcp(eym $$0, fkb $$1, UUID $$2, Supplier<gag> $$3) {
      this($$0, $$1, new fkc.a($$2, $$3, $$1.a().b()));
   }

   public fcp(eym $$0, fkb $$1, fkc $$2) {
      this($$0, $$1, new fkc.a($$2, $$1.a().b()));
   }

   @Override
   protected void aH_() {
      this.w.c().b();
      this.w.a(new ety(this.e, this.i));
      ewf $$0 = this.w.a(ewf.e().a(8));
      $$0.c().e();
      $$0.a(new ets(85, 120, this.f.aP(), this.q.e().a()));
      ewf $$1 = $$0.a(ewf.d().a(8));
      this.z = ess.a(c, $$0x -> this.f.a(new fco(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.D();
         }))).a(178).a();
      $$1.a(evx.a(this.i, this.z, b));
      this.x = this.a(178, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.D();
      });
      $$1.a(evx.a(this.i, this.x, k, $$0x -> $$0x.e(12)));
      ewf $$2 = this.w.a(ewf.e().a(8));
      $$2.a(ess.a(tm.k, $$0x -> this.az_()).a(120).a());
      this.y = $$2.a(ess.a(a, $$0x -> this.l()).a(120).a());
      this.w.a($$1x -> {
         esq var10000 = this.d($$1x);
      });
      this.b();
      this.D();
   }

   @Override
   protected void b() {
      this.w.a();
      evz.a(this.w, this.s());
   }

   private void D() {
      fjz $$0 = this.q.h();
      if ($$0 != null) {
         this.z.b($$0.b());
      } else {
         this.z.b(c);
      }

      fjx.b $$1 = this.q.c();
      this.y.i = $$1 == null;
      this.y.a(x.a($$1, fjx.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.x.b($$0, $$1, $$2);
   }
}
