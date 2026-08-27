import javax.annotation.Nullable;

public class ezr extends gru {
   private static final wi a = wi.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fhp c = fhp.d();
   private final fjx y;
   @Nullable
   private fes z;

   public ezr(fjx $$0) {
      super(fbq.a);
      this.y = $$0;
   }

   @Override
   public void aM_() {
      this.c.a(15).c().b();
      this.z = new fes(a, this.m).b(true);
      this.c.a(this.z);
      fhp $$0 = this.c.a(fhp.e().a(8));
      wi $$1 = wi.c("mco.account.privacy.info.button");
      $$0.a(fdy.a($$1, fio.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(fdy.a(wh.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fdw var10000 = this.c($$1x);
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
      fhj.a(this.c, this.G());
   }

   @Override
   public wi i() {
      return a;
   }
}
