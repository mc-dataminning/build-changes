import javax.annotation.Nullable;

public class ffs extends hct {
   private static final xd a = xd.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fns c = fns.d();
   private final fpt B;
   @Nullable
   private fku C;

   public ffs(fpt $$0) {
      super(fhs.a);
      this.B = $$0;
   }

   @Override
   public void aT_() {
      this.c.a(15).c().b();
      this.C = new fku(a, this.p).b(true);
      this.c.a(this.C);
      fns $$0 = this.c.a(fns.e().a(8));
      xd $$1 = xd.c("mco.account.privacy.info.button");
      $$0.a(fka.a($$1, fop.b(this, axy.a)).a());
      $$0.a(fka.a(xc.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fjy var10000 = this.c($$1x);
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
      fnm.a(this.c, this.H());
   }

   @Override
   public xd i() {
      return a;
   }
}
