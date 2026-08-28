import java.util.UUID;

public class fsi extends fse<gad.a> {
   private static final int y = 120;
   private static final wy z = wy.c("gui.abuseReport.name.title");
   private final flx A = flx.d().a(8);
   private fiy B;
   private fig C;

   private fsi(fnx $$0, gai $$1, gad.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public fsi(fnx $$0, gai $$1, UUID $$2, String $$3) {
      this($$0, $$1, new gad.a($$2, $$3, $$1.a().b()));
   }

   public fsi(fnx $$0, gai $$1, gad $$2) {
      this($$0, $$1, new gad.a($$2, $$1.a().b()));
   }

   @Override
   protected void aP_() {
      this.A.c().b();
      this.A.a(new fjn(this.k, this.o));
      wy $$0 = wy.b(this.x.e().a()).a(n.o);
      this.A.a(new fjn(wy.a("gui.abuseReport.name.reporting", $$0), this.o), $$0x -> $$0x.a().a(0, 8));
      this.B = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.D();
      });
      this.A.a(flp.a(this.o, this.B, q, $$0x -> $$0x.e(12)));
      flx $$1 = this.A.a(flx.e().a(8));
      $$1.a(fig.a(wx.k, $$0x -> this.d()).a(120).a());
      this.C = $$1.a(fig.a(a, $$0x -> this.m()).a(120).a());
      this.D();
      this.A.a($$1x -> {
         fie var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.A.a();
      flr.a(this.A, this.H());
   }

   private void D() {
      gae.b $$0 = this.x.c();
      this.C.j = $$0 == null;
      this.C.a(x.a($$0, gae.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.B.b($$0, $$1, $$2);
   }
}
