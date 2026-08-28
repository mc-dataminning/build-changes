import javax.annotation.Nullable;

public class fcx extends gvf {
   private static final xo a = xo.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fku c = fku.d();
   private final fnc B;
   @Nullable
   private fhx C;

   public fcx(fnc $$0) {
      super(few.a);
      this.B = $$0;
   }

   @Override
   public void aM_() {
      this.c.a(15).c().b();
      this.C = new fhx(a, this.p).b(true);
      this.c.a(this.C);
      fku $$0 = this.c.a(fku.e().a(8));
      xo $$1 = xo.c("mco.account.privacy.info.button");
      $$0.a(fhd.a($$1, flt.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(fhd.a(xn.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fhb var10000 = this.c($$1x);
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
      fko.a(this.c, this.G());
   }

   @Override
   public xo i() {
      return a;
   }
}
