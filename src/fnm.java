import javax.annotation.Nullable;

public class fnm extends hqd {
   private static final wy a = wy.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fws c = fws.d();
   private final fys C;
   @Nullable
   private ftu D;

   public fnm(fys $$0) {
      super(fpk.a);
      this.C = $$0;
   }

   @Override
   public void aO_() {
      this.c.a(15).c().b();
      this.D = new ftu(a, this.p).b(true);
      this.c.a(this.D);
      fws $$0 = this.c.a(fws.e().a(8));
      wy $$1 = wy.c("mco.account.privacy.info.button");
      $$0.a(fta.a($$1, fxp.b(this, ayh.a)).a());
      $$0.a(fta.a(wx.k, $$0x -> this.aL_()).a());
      this.c.a($$1x -> {
         fsy var10000 = this.c($$1x);
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
      fwm.a(this.c, this.J());
   }

   @Override
   public wy i() {
      return a;
   }
}
