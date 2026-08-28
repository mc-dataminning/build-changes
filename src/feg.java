import javax.annotation.Nullable;

public class feg extends gwq {
   private static final wz a = wz.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fmd c = fmd.d();
   private final fod B;
   @Nullable
   private fjg C;

   public feg(fod $$0) {
      super(fgg.a);
      this.B = $$0;
   }

   @Override
   public void aT_() {
      this.c.a(15).c().b();
      this.C = new fjg(a, this.o).b(true);
      this.c.a(this.C);
      fmd $$0 = this.c.a(fmd.e().a(8));
      wz $$1 = wz.c("mco.account.privacy.info.button");
      $$0.a(fim.a($$1, fna.b(this, axj.a)).a());
      $$0.a(fim.a(wy.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fik var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   public void d() {
      this.l.a(this.B);
   }

   @Override
   protected void c() {
      if (this.C != null) {
         this.C.d(this.m - 15);
      }

      this.c.a();
      flx.a(this.c, this.H());
   }

   @Override
   public wz i() {
      return a;
   }
}
