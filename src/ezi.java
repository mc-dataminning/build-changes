import javax.annotation.Nullable;

public class ezi extends grl {
   private static final wg a = wg.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fhg c = fhg.d();
   private final fjo y;
   @Nullable
   private fej z;

   public ezi(fjo $$0) {
      super(fbh.a);
      this.y = $$0;
   }

   @Override
   public void aN_() {
      this.c.a(15).c().b();
      this.z = new fej(a, this.m).b(true);
      this.c.a(this.z);
      fhg $$0 = this.c.a(fhg.e().a(8));
      wg $$1 = wg.c("mco.account.privacy.info.button");
      $$0.a(fdp.a($$1, fif.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(fdp.a(wf.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fdn var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   public void d() {
      this.j.a(this.y);
   }

   @Override
   protected void c() {
      if (this.z != null) {
         this.z.d(this.k - 15);
      }

      this.c.a();
      fha.a(this.c, this.G());
   }

   @Override
   public wg i() {
      return a;
   }
}
