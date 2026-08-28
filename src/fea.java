import javax.annotation.Nullable;

public class fea extends gwj {
   private static final wy a = wy.c("mco.account.privacy.information");
   private static final int b = 15;
   private final flx c = flx.d();
   private final fnx A;
   @Nullable
   private fja B;

   public fea(fnx $$0) {
      super(fga.a);
      this.A = $$0;
   }

   @Override
   public void aP_() {
      this.c.a(15).c().b();
      this.B = new fja(a, this.o).b(true);
      this.c.a(this.B);
      flx $$0 = this.c.a(flx.e().a(8));
      wy $$1 = wy.c("mco.account.privacy.info.button");
      $$0.a(fig.a($$1, fmu.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(fig.a(wx.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fie var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   public void d() {
      this.l.a(this.A);
   }

   @Override
   protected void c() {
      if (this.B != null) {
         this.B.d(this.m - 15);
      }

      this.c.a();
      flr.a(this.c, this.H());
   }

   @Override
   public wy i() {
      return a;
   }
}
