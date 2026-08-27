import java.util.UUID;
import java.util.function.Supplier;

public class fob extends fnu<fvz.a> {
   private static final int v = 120;
   private static final int w = 85;
   private static final int x = 178;
   private static final wi y = wi.c("gui.abuseReport.skin.title");
   private final fhp z = fhp.d().a(8);
   private feq A;
   private fdy B;
   private fdy C;

   private fob(fjx $$0, fvy $$1, fvz.a $$2) {
      super(y, $$0, $$1, $$2);
   }

   public fob(fjx $$0, fvy $$1, UUID $$2, Supplier<gmr> $$3) {
      this($$0, $$1, new fvz.a($$2, $$3, $$1.a().b()));
   }

   public fob(fjx $$0, fvy $$1, fvz $$2) {
      this($$0, $$1, new fvz.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.z.c().b();
      this.z.a(new fff(this.i, this.m));
      fhp $$0 = this.z.a(fhp.e().a(8));
      $$0.c().e();
      $$0.a(new fey(85, 120, this.j.aR(), this.u.e().a()));
      fhp $$1 = $$0.a(fhp.d().a(8));
      this.C = fdy.a(c, $$0x -> this.j.a(new foa(this, this.u.h(), $$0xx -> {
            this.u.a($$0xx);
            this.C();
         }))).a(178).a();
      $$1.a(fhh.a(this.m, this.C, b));
      this.A = this.a(178, 9 * 8, $$0x -> {
         this.u.a($$0x);
         this.C();
      });
      $$1.a(fhh.a(this.m, this.A, d, $$0x -> $$0x.e(12)));
      fhp $$2 = this.z.a(fhp.e().a(8));
      $$2.a(fdy.a(wh.k, $$0x -> this.d()).a(120).a());
      this.B = $$2.a(fdy.a(a, $$0x -> this.m()).a(120).a());
      this.z.a($$1x -> {
         fdw var10000 = this.c($$1x);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.z.a();
      fhj.a(this.z, this.G());
   }

   private void C() {
      fvw $$0 = this.u.h();
      if ($$0 != null) {
         this.C.b($$0.b());
      } else {
         this.C.b(c);
      }

      fvu.b $$1 = this.u.c();
      this.B.j = $$1 == null;
      this.B.a(x.a($$1, fvu.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.A.b($$0, $$1, $$2);
   }
}
