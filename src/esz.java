import javax.annotation.Nullable;

public class esz extends gkn {
   private static final vf a = vf.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fas c = fas.d();
   private final fcz v;
   @Nullable
   private exy w;

   public esz(fcz $$0) {
      super(euy.a);
      this.v = $$0;
   }

   @Override
   public void aN_() {
      this.c.a(15).c().b();
      this.w = new exy(a, this.i).b(true);
      this.c.a(this.w);
      fas $$0 = this.c.a(fas.e().a(8));
      vf $$1 = vf.c("mco.account.privacy.info.button");
      $$0.a(exe.a($$1, fbr.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(exe.a(ve.k, $$0x -> this.aE_()).a());
      this.c.a($$1x -> {
         exc var10000 = this.d($$1x);
      });
      this.c();
   }

   @Override
   public void aE_() {
      this.f.a(this.v);
   }

   @Override
   protected void c() {
      if (this.w != null) {
         this.w.c(this.g - 15);
      }

      this.c.a();
      fam.a(this.c, this.F());
   }

   @Override
   public vf h() {
      return a;
   }
}
