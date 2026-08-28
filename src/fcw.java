import javax.annotation.Nullable;

public class fcw extends gve {
   private static final xo a = xo.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fkt c = fkt.d();
   private final fnb B;
   @Nullable
   private fhw C;

   public fcw(fnb $$0) {
      super(fev.a);
      this.B = $$0;
   }

   @Override
   public void aM_() {
      this.c.a(15).c().b();
      this.C = new fhw(a, this.p).b(true);
      this.c.a(this.C);
      fkt $$0 = this.c.a(fkt.e().a(8));
      xo $$1 = xo.c("mco.account.privacy.info.button");
      $$0.a(fhc.a($$1, fls.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(fhc.a(xn.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fha var10000 = this.c($$1x);
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
      fkn.a(this.c, this.G());
   }

   @Override
   public xo i() {
      return a;
   }
}
