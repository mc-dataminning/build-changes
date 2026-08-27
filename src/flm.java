import java.util.UUID;
import java.util.function.Supplier;

public class flm extends flf<ftj.a> {
   private static final int r = 120;
   private static final int t = 85;
   private static final int u = 178;
   private static final vu v = vu.c("gui.abuseReport.skin.title");
   private final fez w = fez.d().a(8);
   private fca x;
   private fbi y;
   private fbi z;

   private flm(fhh $$0, fti $$1, ftj.a $$2) {
      super(v, $$0, $$1, $$2);
   }

   public flm(fhh $$0, fti $$1, UUID $$2, Supplier<gkb> $$3) {
      this($$0, $$1, new ftj.a($$2, $$3, $$1.a().b()));
   }

   public flm(fhh $$0, fti $$1, ftj $$2) {
      this($$0, $$1, new ftj.a($$2, $$1.a().b()));
   }

   @Override
   protected void aO_() {
      this.w.c().b();
      this.w.a(new fcp(this.e, this.i));
      fez $$0 = this.w.a(fez.e().a(8));
      $$0.c().e();
      $$0.a(new fci(85, 120, this.f.aR(), this.q.e().a()));
      fez $$1 = $$0.a(fez.d().a(8));
      this.z = fbi.a(c, $$0x -> this.f.a(new fll(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.E();
         }))).a(178).a();
      $$1.a(fer.a(this.i, this.z, b));
      this.x = this.a(178, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.E();
      });
      $$1.a(fer.a(this.i, this.x, k, $$0x -> $$0x.e(12)));
      fez $$2 = this.w.a(fez.e().a(8));
      $$2.a(fbi.a(vt.k, $$0x -> this.d()).a(120).a());
      this.y = $$2.a(fbi.a(a, $$0x -> this.o()).a(120).a());
      this.w.a($$1x -> {
         fbg var10000 = this.c($$1x);
      });
      this.c();
      this.E();
   }

   @Override
   protected void c() {
      this.w.a();
      fet.a(this.w, this.F());
   }

   private void E() {
      ftg $$0 = this.q.h();
      if ($$0 != null) {
         this.z.b($$0.b());
      } else {
         this.z.b(c);
      }

      fte.b $$1 = this.q.c();
      this.y.j = $$1 == null;
      this.y.a(x.a($$1, fte.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.x.b($$0, $$1, $$2);
   }
}
