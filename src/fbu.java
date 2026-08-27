import javax.annotation.Nullable;

public class fbu extends gty {
   private static final wx a = wx.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fjr c = fjr.d();
   private final flz B;
   @Nullable
   private fgu C;

   public fbu(flz $$0) {
      super(fdt.a);
      this.B = $$0;
   }

   @Override
   public void aN_() {
      this.c.a(15).c().b();
      this.C = new fgu(a, this.p).b(true);
      this.c.a(this.C);
      fjr $$0 = this.c.a(fjr.e().a(8));
      wx $$1 = wx.c("mco.account.privacy.info.button");
      $$0.a(fga.a($$1, fkq.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(fga.a(ww.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         ffy var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   public void d() {
      this.m.a(this.B);
   }

   @Override
   protected void c() {
      if (this.C != null) {
         this.C.d(this.n - 15);
      }

      this.c.a();
      fjl.a(this.c, this.G());
   }

   @Override
   public wx i() {
      return a;
   }
}
