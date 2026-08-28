import java.util.UUID;
import java.util.function.Supplier;

public class frc extends fqv<fyz.a> {
   private static final int y = 120;
   private static final int z = 85;
   private static final int A = 178;
   private static final xl B = xl.c("gui.abuseReport.skin.title");
   private final fkq C = fkq.d().a(8);
   private fhr D;
   private fgz E;
   private fgz F;

   private frc(fmy $$0, fyy $$1, fyz.a $$2) {
      super(B, $$0, $$1, $$2);
   }

   public frc(fmy $$0, fyy $$1, UUID $$2, Supplier<gpu> $$3) {
      this($$0, $$1, new fyz.a($$2, $$3, $$1.a().b()));
   }

   public frc(fmy $$0, fyy $$1, fyz $$2) {
      this($$0, $$1, new fyz.a($$2, $$1.a().b()));
   }

   @Override
   protected void aN_() {
      this.C.c().b();
      this.C.a(new fig(this.l, this.p));
      fkq $$0 = this.C.a(fkq.e().a(8));
      $$0.c().e();
      $$0.a(new fhz(85, 120, this.m.aR(), this.x.e().a()));
      fkq $$1 = $$0.a(fkq.d().a(8));
      this.F = fgz.a(c, $$0x -> this.m.a(new frb(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.C();
         }))).a(178).a();
      $$1.a(fki.a(this.p, this.F, b));
      this.D = this.a(178, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.C();
      });
      $$1.a(fki.a(this.p, this.D, d, $$0x -> $$0x.e(12)));
      fkq $$2 = this.C.a(fkq.e().a(8));
      $$2.a(fgz.a(xk.k, $$0x -> this.d()).a(120).a());
      this.E = $$2.a(fgz.a(a, $$0x -> this.m()).a(120).a());
      this.C.a($$1x -> {
         fgx var10000 = this.c($$1x);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.C.a();
      fkk.a(this.C, this.G());
   }

   private void C() {
      fyw $$0 = this.x.h();
      if ($$0 != null) {
         this.F.b($$0.b());
      } else {
         this.F.b(c);
      }

      fyu.b $$1 = this.x.c();
      this.E.j = $$1 == null;
      this.E.a(x.a($$1, fyu.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.D.b($$0, $$1, $$2);
   }
}
