import javax.annotation.Nullable;

public class fhz extends hfq {
   private static final xj a = xj.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fpw c = fpw.d();
   private final frw B;
   @Nullable
   private fmx C;

   public fhz(frw $$0) {
      super(fjv.a);
      this.B = $$0;
   }

   @Override
   public void aR_() {
      this.c.a(15).c().b();
      this.C = new fmx(a, this.p).b(true);
      this.c.a(this.C);
      fpw $$0 = this.c.a(fpw.e().a(8));
      xj $$1 = xj.c("mco.account.privacy.info.button");
      $$0.a(fmd.a($$1, fqt.b(this, ayi.a)).a());
      $$0.a(fmd.a(xi.k, $$0x -> this.aO_()).a());
      this.c.a($$1x -> {
         fmb var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   public void aO_() {
      this.m.a(this.B);
   }

   @Override
   protected void c() {
      if (this.C != null) {
         this.C.d(this.n - 15);
      }

      this.c.a();
      fpq.a(this.c, this.H());
   }

   @Override
   public xj i() {
      return a;
   }
}
