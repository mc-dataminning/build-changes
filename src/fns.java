import java.util.UUID;
import java.util.function.Supplier;

public class fns extends fnl<fvq.a> {
   private static final int v = 120;
   private static final int w = 85;
   private static final int x = 178;
   private static final wg y = wg.c("gui.abuseReport.skin.title");
   private final fhg z = fhg.d().a(8);
   private feh A;
   private fdp B;
   private fdp C;

   private fns(fjo $$0, fvp $$1, fvq.a $$2) {
      super(y, $$0, $$1, $$2);
   }

   public fns(fjo $$0, fvp $$1, UUID $$2, Supplier<gmi> $$3) {
      this($$0, $$1, new fvq.a($$2, $$3, $$1.a().b()));
   }

   public fns(fjo $$0, fvp $$1, fvq $$2) {
      this($$0, $$1, new fvq.a($$2, $$1.a().b()));
   }

   @Override
   protected void aN_() {
      this.z.c().b();
      this.z.a(new few(this.i, this.m));
      fhg $$0 = this.z.a(fhg.e().a(8));
      $$0.c().e();
      $$0.a(new fep(85, 120, this.j.aR(), this.u.e().a()));
      fhg $$1 = $$0.a(fhg.d().a(8));
      this.C = fdp.a(c, $$0x -> this.j.a(new fnr(this, this.u.h(), $$0xx -> {
            this.u.a($$0xx);
            this.C();
         }))).a(178).a();
      $$1.a(fgy.a(this.m, this.C, b));
      this.A = this.a(178, 9 * 8, $$0x -> {
         this.u.a($$0x);
         this.C();
      });
      $$1.a(fgy.a(this.m, this.A, d, $$0x -> $$0x.e(12)));
      fhg $$2 = this.z.a(fhg.e().a(8));
      $$2.a(fdp.a(wf.k, $$0x -> this.d()).a(120).a());
      this.B = $$2.a(fdp.a(a, $$0x -> this.m()).a(120).a());
      this.z.a($$1x -> {
         fdn var10000 = this.c($$1x);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.z.a();
      fha.a(this.z, this.G());
   }

   private void C() {
      fvn $$0 = this.u.h();
      if ($$0 != null) {
         this.C.b($$0.b());
      } else {
         this.C.b(c);
      }

      fvl.b $$1 = this.u.c();
      this.B.j = $$1 == null;
      this.B.a(x.a($$1, fvl.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.A.b($$0, $$1, $$2);
   }
}
