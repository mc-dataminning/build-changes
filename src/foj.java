import javax.annotation.Nullable;

public class foj extends hrc {
   private static final xg a = xg.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fxq c = fxq.d();
   private final fzq C;
   @Nullable
   private fus D;

   public foj(fzq $$0) {
      super(fqh.a);
      this.C = $$0;
   }

   @Override
   public void aO_() {
      this.c.a(15).c().b();
      this.D = new fus(a, this.p).b(true);
      this.c.a(this.D);
      fxq $$0 = this.c.a(fxq.e().a(8));
      xg $$1 = xg.c("mco.account.privacy.info.button");
      $$0.a(fty.a($$1, fyn.b(this, ayt.a)).a());
      $$0.a(fty.a(xf.k, $$0x -> this.aL_()).a());
      this.c.a($$1x -> {
         ftw var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   public void aL_() {
      this.m.a(this.C);
   }

   @Override
   protected void c() {
      if (this.D != null) {
         this.D.d(this.n - 15);
      }

      this.c.a();
      fxk.a(this.c, this.J());
   }

   @Override
   public xg i() {
      return a;
   }
}
