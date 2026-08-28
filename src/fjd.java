import javax.annotation.Nullable;

public class fjd extends hkx {
   private static final wo a = wo.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fsk c = fsk.d();
   private final fuk C;
   @Nullable
   private fpm D;

   public fjd(fuk $$0) {
      super(fla.a);
      this.C = $$0;
   }

   @Override
   public void aR_() {
      this.c.a(15).c().b();
      this.D = new fpm(a, this.p).b(true);
      this.c.a(this.D);
      fsk $$0 = this.c.a(fsk.e().a(8));
      wo $$1 = wo.c("mco.account.privacy.info.button");
      $$0.a(fos.a($$1, fth.b(this, axv.a)).a());
      $$0.a(fos.a(wn.k, $$0x -> this.aO_()).a());
      this.c.a($$1x -> {
         fop var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   public void aO_() {
      this.m.a(this.C);
   }

   @Override
   protected void c() {
      if (this.D != null) {
         this.D.d(this.n - 15);
      }

      this.c.a();
      fse.a(this.c, this.J());
   }

   @Override
   public wo i() {
      return a;
   }
}
