import javax.annotation.Nullable;

public class fcy extends gvg {
   private static final xp a = xp.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fkv c = fkv.d();
   private final fnd B;
   @Nullable
   private fhy C;

   public fcy(fnd $$0) {
      super(fex.a);
      this.B = $$0;
   }

   @Override
   public void aM_() {
      this.c.a(15).c().b();
      this.C = new fhy(a, this.p).b(true);
      this.c.a(this.C);
      fkv $$0 = this.c.a(fkv.e().a(8));
      xp $$1 = xp.c("mco.account.privacy.info.button");
      $$0.a(fhe.a($$1, flu.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(fhe.a(xo.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fhc var10000 = this.c($$1x);
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
      fkp.a(this.c, this.G());
   }

   @Override
   public xp i() {
      return a;
   }
}
