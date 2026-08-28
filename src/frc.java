import java.util.UUID;

public class frc extends fqy<fyw.a> {
   private static final int y = 120;
   private static final xo z = xo.c("gui.abuseReport.name.title");
   private final fkt A = fkt.d().a(8);
   private fhu B;
   private fhc C;

   private frc(fnb $$0, fzb $$1, fyw.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public frc(fnb $$0, fzb $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fyw.a($$2, $$3, $$1.a().b()));
   }

   public frc(fnb $$0, fzb $$1, fyw $$2) {
      this($$0, $$1, new fyw.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.A.c().b();
      this.A.a(new fij(this.l, this.p));
      xo $$0 = xo.b(this.x.e().a()).a(n.o);
      this.A.a(new fij(xo.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.a().a(0, 8));
      this.B = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.D();
      });
      this.A.a(fkl.a(this.p, this.B, d, $$0x -> $$0x.e(12)));
      fkt $$1 = this.A.a(fkt.e().a(8));
      $$1.a(fhc.a(xn.k, $$0x -> this.d()).a(120).a());
      this.C = $$1.a(fhc.a(a, $$0x -> this.m()).a(120).a());
      this.D();
      this.A.a($$1x -> {
         fha var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.A.a();
      fkn.a(this.A, this.G());
   }

   private void D() {
      fyx.b $$0 = this.x.c();
      this.C.j = $$0 == null;
      this.C.a(x.a($$0, fyx.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.B.b($$0, $$1, $$2);
   }
}
