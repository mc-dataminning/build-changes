import javax.annotation.Nullable;

public class fgz extends hep {
   private static final xi a = xi.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fpa c = fpa.d();
   private final fra B;
   @Nullable
   private fmb C;

   public fgz(fra $$0) {
      super(fiz.a);
      this.B = $$0;
   }

   @Override
   public void aR_() {
      this.c.a(15).c().b();
      this.C = new fmb(a, this.p).b(true);
      this.c.a(this.C);
      fpa $$0 = this.c.a(fpa.e().a(8));
      xi $$1 = xi.c("mco.account.privacy.info.button");
      $$0.a(flh.a($$1, fpx.b(this, ayg.a)).a());
      $$0.a(flh.a(xh.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         flf var10000 = this.c($$1x);
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
      fou.a(this.c, this.H());
   }

   @Override
   public xi i() {
      return a;
   }
}
