import javax.annotation.Nullable;

public class fcz extends gvh {
   private static final xp a = xp.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fkw c = fkw.d();
   private final fne B;
   @Nullable
   private fhz C;

   public fcz(fne $$0) {
      super(fey.a);
      this.B = $$0;
   }

   @Override
   public void aM_() {
      this.c.a(15).c().b();
      this.C = new fhz(a, this.p).b(true);
      this.c.a(this.C);
      fkw $$0 = this.c.a(fkw.e().a(8));
      xp $$1 = xp.c("mco.account.privacy.info.button");
      $$0.a(fhf.a($$1, flv.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(fhf.a(xo.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fhd var10000 = this.c($$1x);
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
      fkq.a(this.c, this.G());
   }

   @Override
   public xp i() {
      return a;
   }
}
