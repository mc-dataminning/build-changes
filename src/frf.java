import java.util.UUID;
import java.util.function.Supplier;

public class frf extends fqy<fzc.a> {
   private static final int y = 120;
   private static final int z = 85;
   private static final int A = 178;
   private static final xo B = xo.c("gui.abuseReport.skin.title");
   private final fkt C = fkt.d().a(8);
   private fhu D;
   private fhc E;
   private fhc F;

   private frf(fnb $$0, fzb $$1, fzc.a $$2) {
      super(B, $$0, $$1, $$2);
   }

   public frf(fnb $$0, fzb $$1, UUID $$2, Supplier<gpx> $$3) {
      this($$0, $$1, new fzc.a($$2, $$3, $$1.a().b()));
   }

   public frf(fnb $$0, fzb $$1, fzc $$2) {
      this($$0, $$1, new fzc.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.C.c().b();
      this.C.a(new fij(this.l, this.p));
      fkt $$0 = this.C.a(fkt.e().a(8));
      $$0.c().e();
      $$0.a(new fic(85, 120, this.m.aR(), this.x.e().a()));
      fkt $$1 = $$0.a(fkt.d().a(8));
      this.F = fhc.a(c, $$0x -> this.m.a(new fre(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.D();
         }))).a(178).a();
      $$1.a(fkl.a(this.p, this.F, b));
      this.D = this.a(178, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.D();
      });
      $$1.a(fkl.a(this.p, this.D, d, $$0x -> $$0x.e(12)));
      fkt $$2 = this.C.a(fkt.e().a(8));
      $$2.a(fhc.a(xn.k, $$0x -> this.d()).a(120).a());
      this.E = $$2.a(fhc.a(a, $$0x -> this.m()).a(120).a());
      this.C.a($$1x -> {
         fha var10000 = this.c($$1x);
      });
      this.c();
      this.D();
   }

   @Override
   protected void c() {
      this.C.a();
      fkn.a(this.C, this.G());
   }

   private void D() {
      fyz $$0 = this.x.h();
      if ($$0 != null) {
         this.F.b($$0.b());
      } else {
         this.F.b(c);
      }

      fyx.b $$1 = this.x.c();
      this.E.j = $$1 == null;
      this.E.a(x.a($$1, fyx.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.D.b($$0, $$1, $$2);
   }
}
