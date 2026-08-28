import java.util.UUID;
import java.util.function.Supplier;

public class fsl extends fse<gaj.a> {
   private static final int y = 120;
   private static final int z = 85;
   private static final int A = 178;
   private static final wy B = wy.c("gui.abuseReport.skin.title");
   private final flx C = flx.d().a(8);
   private fiy D;
   private fig E;
   private fig F;

   private fsl(fnx $$0, gai $$1, gaj.a $$2) {
      super(B, $$0, $$1, $$2);
   }

   public fsl(fnx $$0, gai $$1, UUID $$2, Supplier<grf> $$3) {
      this($$0, $$1, new gaj.a($$2, $$3, $$1.a().b()));
   }

   public fsl(fnx $$0, gai $$1, gaj $$2) {
      this($$0, $$1, new gaj.a($$2, $$1.a().b()));
   }

   @Override
   protected void aP_() {
      this.C.c().b();
      this.C.a(new fjn(this.k, this.o));
      flx $$0 = this.C.a(flx.e().a(8));
      $$0.c().e();
      $$0.a(new fjg(85, 120, this.l.aP(), this.x.e().a()));
      flx $$1 = $$0.a(flx.d().a(8));
      this.F = fig.a(c, $$0x -> this.l.a(new fsk(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.D();
         }))).a(178).a();
      $$1.a(flp.a(this.o, this.F, b));
      this.D = this.a(178, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.D();
      });
      $$1.a(flp.a(this.o, this.D, q, $$0x -> $$0x.e(12)));
      flx $$2 = this.C.a(flx.e().a(8));
      $$2.a(fig.a(wx.k, $$0x -> this.d()).a(120).a());
      this.E = $$2.a(fig.a(a, $$0x -> this.m()).a(120).a());
      this.C.a($$1x -> {
         fie var10000 = this.c($$1x);
      });
      this.c();
      this.D();
   }

   @Override
   protected void c() {
      this.C.a();
      flr.a(this.C, this.H());
   }

   private void D() {
      gag $$0 = this.x.h();
      if ($$0 != null) {
         this.F.b($$0.b());
      } else {
         this.F.b(c);
      }

      gae.b $$1 = this.x.c();
      this.E.j = $$1 == null;
      this.E.a(x.a($$1, gae.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.D.b($$0, $$1, $$2);
   }
}
