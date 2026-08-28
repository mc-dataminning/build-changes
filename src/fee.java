import javax.annotation.Nullable;

public class fee extends gwo {
   private static final wz a = wz.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fmb c = fmb.d();
   private final fob B;
   @Nullable
   private fje C;

   public fee(fob $$0) {
      super(fge.a);
      this.B = $$0;
   }

   @Override
   public void aT_() {
      this.c.a(15).c().b();
      this.C = new fje(a, this.o).b(true);
      this.c.a(this.C);
      fmb $$0 = this.c.a(fmb.e().a(8));
      wz $$1 = wz.c("mco.account.privacy.info.button");
      $$0.a(fik.a($$1, fmy.b(this, axj.a)).a());
      $$0.a(fik.a(wy.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fii var10000 = this.c($$1x);
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
      flv.a(this.c, this.H());
   }

   @Override
   public wz i() {
      return a;
   }
}
