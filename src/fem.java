import java.util.UUID;
import java.util.function.Supplier;

public class fem extends fef<fma.a> {
   private static final int r = 120;
   private static final int t = 85;
   private static final int u = 178;
   private static final ur v = ur.c("gui.abuseReport.skin.title");
   private final eya w = eya.d().a(8);
   private eve x;
   private eum y;
   private eum z;

   private fem(fah $$0, flz $$1, fma.a $$2) {
      super(v, $$0, $$1, $$2);
   }

   public fem(fah $$0, flz $$1, UUID $$2, Supplier<gch> $$3) {
      this($$0, $$1, new fma.a($$2, $$3, $$1.a().b()));
   }

   public fem(fah $$0, flz $$1, fma $$2) {
      this($$0, $$1, new fma.a($$2, $$1.a().b()));
   }

   @Override
   protected void aO_() {
      this.w.c().b();
      this.w.a(new evt(this.e, this.i));
      eya $$0 = this.w.a(eya.e().a(8));
      $$0.c().e();
      $$0.a(new evm(85, 120, this.f.aO(), this.q.e().a()));
      eya $$1 = $$0.a(eya.d().a(8));
      this.z = eum.a(c, $$0x -> this.f.a(new fel(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.C();
         }))).a(178).a();
      $$1.a(exs.a(this.i, this.z, b));
      this.x = this.a(178, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      $$1.a(exs.a(this.i, this.x, k, $$0x -> $$0x.e(12)));
      eya $$2 = this.w.a(eya.e().a(8));
      $$2.a(eum.a(uq.k, $$0x -> this.aE_()).a(120).a());
      this.y = $$2.a(eum.a(a, $$0x -> this.l()).a(120).a());
      this.w.a($$1x -> {
         euk var10000 = this.d($$1x);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.w.a();
      exu.a(this.w, this.s());
   }

   private void C() {
      flx $$0 = this.q.h();
      if ($$0 != null) {
         this.z.b($$0.b());
      } else {
         this.z.b(c);
      }

      flv.b $$1 = this.q.c();
      this.y.i = $$1 == null;
      this.y.a(x.a($$1, flv.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.x.b($$0, $$1, $$2);
   }
}
