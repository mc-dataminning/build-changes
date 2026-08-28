import javax.annotation.Nullable;

public class fgg extends hdp {
   private static final xe a = xe.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fog c = fog.d();
   private final fqh B;
   @Nullable
   private fli C;

   public fgg(fqh $$0) {
      super(fig.a);
      this.B = $$0;
   }

   @Override
   public void aS_() {
      this.c.a(15).c().b();
      this.C = new fli(a, this.p).b(true);
      this.c.a(this.C);
      fog $$0 = this.c.a(fog.e().a(8));
      xe $$1 = xe.c("mco.account.privacy.info.button");
      $$0.a(fko.a($$1, fpe.b(this, ayb.a)).a());
      $$0.a(fko.a(xd.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fkm var10000 = this.c($$1x);
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
      foa.a(this.c, this.H());
   }

   @Override
   public xe i() {
      return a;
   }
}
