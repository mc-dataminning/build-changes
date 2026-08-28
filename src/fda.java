import javax.annotation.Nullable;

public class fda extends gvi {
   private static final xp a = xp.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fkx c = fkx.d();
   private final fnf B;
   @Nullable
   private fia C;

   public fda(fnf $$0) {
      super(fez.a);
      this.B = $$0;
   }

   @Override
   public void aM_() {
      this.c.a(15).c().b();
      this.C = new fia(a, this.p).b(true);
      this.c.a(this.C);
      fkx $$0 = this.c.a(fkx.e().a(8));
      xp $$1 = xp.c("mco.account.privacy.info.button");
      $$0.a(fhg.a($$1, flw.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(fhg.a(xo.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fhe var10000 = this.c($$1x);
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
      fkr.a(this.c, this.G());
   }

   @Override
   public xp i() {
      return a;
   }
}
