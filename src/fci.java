import java.util.UUID;
import java.util.function.Supplier;

public class fci extends fcb<fjw.a> {
   private static final int s = 120;
   private static final int t = 85;
   private static final int u = 178;
   private static final tl v = tl.c("gui.abuseReport.skin.title");
   private final evy w = evy.d().a(8);
   private etc x;
   private esk y;
   private esk z;

   private fci(eye $$0, fjv $$1, fjw.a $$2) {
      super(v, $$0, $$1, $$2);
   }

   public fci(eye $$0, fjv $$1, UUID $$2, Supplier<gaa> $$3) {
      this($$0, $$1, new fjw.a($$2, $$3, $$1.a().b()));
   }

   public fci(eye $$0, fjv $$1, fjw $$2) {
      this($$0, $$1, new fjw.a($$2, $$1.a().b()));
   }

   @Override
   protected void aH_() {
      this.w.c().b();
      this.w.a(new etr(this.e, this.i));
      evy $$0 = this.w.a(evy.e().a(8));
      $$0.c().e();
      $$0.a(new etk(85, 120, this.f.aP(), this.q.e().a()));
      evy $$1 = $$0.a(evy.d().a(8));
      this.z = esk.a(c, $$0x -> this.f.a(new fch(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.D();
         }))).a(178).a();
      $$1.a(evq.a(this.i, this.z, b));
      this.x = this.a(178, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.D();
      });
      $$1.a(evq.a(this.i, this.x, k, $$0x -> $$0x.e(12)));
      evy $$2 = this.w.a(evy.e().a(8));
      $$2.a(esk.a(tk.k, $$0x -> this.az_()).a(120).a());
      this.y = $$2.a(esk.a(a, $$0x -> this.l()).a(120).a());
      this.w.a($$1x -> {
         esi var10000 = this.d($$1x);
      });
      this.b();
      this.D();
   }

   @Override
   protected void b() {
      this.w.a();
      evs.a(this.w, this.s());
   }

   private void D() {
      fjt $$0 = this.q.h();
      if ($$0 != null) {
         this.z.b($$0.b());
      } else {
         this.z.b(c);
      }

      fjr.b $$1 = this.q.c();
      this.y.i = $$1 == null;
      this.y.a(x.a($$1, fjr.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.x.b($$0, $$1, $$2);
   }
}
