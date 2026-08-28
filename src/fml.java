import javax.annotation.Nullable;

public class fml extends hpb {
   private static final wy a = wy.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fvu c = fvu.d();
   private final fxu C;
   @Nullable
   private fsw D;

   public fml(fxu $$0) {
      super(foi.a);
      this.C = $$0;
   }

   @Override
   public void aN_() {
      this.c.a(15).c().b();
      this.D = new fsw(a, this.p).b(true);
      this.c.a(this.D);
      fvu $$0 = this.c.a(fvu.e().a(8));
      wy $$1 = wy.c("mco.account.privacy.info.button");
      $$0.a(fsc.a($$1, fwr.b(this, ayh.a)).a());
      $$0.a(fsc.a(wx.k, $$0x -> this.aK_()).a());
      this.c.a($$1x -> {
         fsa var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   public void aK_() {
      this.m.a(this.C);
   }

   @Override
   protected void c() {
      if (this.D != null) {
         this.D.d(this.n - 15);
      }

      this.c.a();
      fvo.a(this.c, this.J());
   }

   @Override
   public wy i() {
      return a;
   }
}
