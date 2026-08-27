import javax.annotation.Nullable;

public class fec extends gxb {
   private static final xe a = xe.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fme c = fme.d();
   private final fon B;
   @Nullable
   private fjh C;

   public fec(fon $$0) {
      super(fgb.a);
      this.B = $$0;
   }

   @Override
   public void aN_() {
      this.c.a(15).c().b();
      this.C = new fjh(a, this.p).b(true);
      this.c.a(this.C);
      fme $$0 = this.c.a(fme.e().a(8));
      xe $$1 = xe.c("mco.account.privacy.info.button");
      $$0.a(fin.a($$1, fnd.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(fin.a(xd.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fil var10000 = this.c($$1x);
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
      fly.a(this.c, this.G());
   }

   @Override
   public xe i() {
      return a;
   }
}
