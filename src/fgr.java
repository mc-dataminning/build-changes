import javax.annotation.Nullable;

public class fgr extends hee {
   private static final xh a = xh.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fos c = fos.d();
   private final fqs B;
   @Nullable
   private flt C;

   public fgr(fqs $$0) {
      super(fir.a);
      this.B = $$0;
   }

   @Override
   public void aS_() {
      this.c.a(15).c().b();
      this.C = new flt(a, this.p).b(true);
      this.c.a(this.C);
      fos $$0 = this.c.a(fos.e().a(8));
      xh $$1 = xh.c("mco.account.privacy.info.button");
      $$0.a(fkz.a($$1, fpp.b(this, ayf.a)).a());
      $$0.a(fkz.a(xg.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fkx var10000 = this.c($$1x);
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
      fol.a(this.c, this.H());
   }

   @Override
   public xh i() {
      return a;
   }
}
