import javax.annotation.Nullable;

public class fbs extends gty {
   private static final wx a = wx.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fjq c = fjq.d();
   private final fly B;
   @Nullable
   private fgt C;

   public fbs(fly $$0) {
      super(fdr.a);
      this.B = $$0;
   }

   @Override
   public void aM_() {
      this.c.a(15).c().b();
      this.C = new fgt(a, this.p).b(true);
      this.c.a(this.C);
      fjq $$0 = this.c.a(fjq.e().a(8));
      wx $$1 = wx.c("mco.account.privacy.info.button");
      $$0.a(ffz.a($$1, fkp.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(ffz.a(ww.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         ffx var10000 = this.c($$1x);
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
      fjk.a(this.c, this.G());
   }

   @Override
   public wx i() {
      return a;
   }
}
