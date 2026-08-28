import javax.annotation.Nullable;

public class fms extends hpj {
   private static final wy a = wy.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fwb c = fwb.d();
   private final fyb C;
   @Nullable
   private ftd D;

   public fms(fyb $$0) {
      super(fop.a);
      this.C = $$0;
   }

   @Override
   public void aO_() {
      this.c.a(15).c().b();
      this.D = new ftd(a, this.p).b(true);
      this.c.a(this.D);
      fwb $$0 = this.c.a(fwb.e().a(8));
      wy $$1 = wy.c("mco.account.privacy.info.button");
      $$0.a(fsj.a($$1, fwy.b(this, ayh.a)).a());
      $$0.a(fsj.a(wx.k, $$0x -> this.aL_()).a());
      this.c.a($$1x -> {
         fsh var10000 = this.c($$1x);
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
      fvv.a(this.c, this.J());
   }

   @Override
   public wy i() {
      return a;
   }
}
