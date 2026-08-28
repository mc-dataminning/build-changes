import javax.annotation.Nullable;

public class fnh extends hpw {
   private static final wy a = wy.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fwn c = fwn.d();
   private final fyn C;
   @Nullable
   private ftp D;

   public fnh(fyn $$0) {
      super(fpf.a);
      this.C = $$0;
   }

   @Override
   public void aO_() {
      this.c.a(15).c().b();
      this.D = new ftp(a, this.p).b(true);
      this.c.a(this.D);
      fwn $$0 = this.c.a(fwn.e().a(8));
      wy $$1 = wy.c("mco.account.privacy.info.button");
      $$0.a(fsv.a($$1, fxk.b(this, ayh.a)).a());
      $$0.a(fsv.a(wx.k, $$0x -> this.aL_()).a());
      this.c.a($$1x -> {
         fst var10000 = this.c($$1x);
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
      fwh.a(this.c, this.J());
   }

   @Override
   public wy i() {
      return a;
   }
}
