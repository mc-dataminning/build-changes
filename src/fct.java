import javax.annotation.Nullable;

public class fct extends gvb {
   private static final xl a = xl.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fkq c = fkq.d();
   private final fmy B;
   @Nullable
   private fht C;

   public fct(fmy $$0) {
      super(fes.a);
      this.B = $$0;
   }

   @Override
   public void aN_() {
      this.c.a(15).c().b();
      this.C = new fht(a, this.p).b(true);
      this.c.a(this.C);
      fkq $$0 = this.c.a(fkq.e().a(8));
      xl $$1 = xl.c("mco.account.privacy.info.button");
      $$0.a(fgz.a($$1, flp.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(fgz.a(xk.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fgx var10000 = this.c($$1x);
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
      fkk.a(this.c, this.G());
   }

   @Override
   public xl i() {
      return a;
   }
}
