import javax.annotation.Nullable;

public class fhs extends hff {
   private static final xl a = xl.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fpp c = fpp.d();
   private final frp B;
   @Nullable
   private fmq C;

   public fhs(frp $$0) {
      super(fjo.a);
      this.B = $$0;
   }

   @Override
   public void aS_() {
      this.c.a(15).c().b();
      this.C = new fmq(a, this.p).b(true);
      this.c.a(this.C);
      fpp $$0 = this.c.a(fpp.e().a(8));
      xl $$1 = xl.c("mco.account.privacy.info.button");
      $$0.a(flw.a($$1, fqm.b(this, ayj.a)).a());
      $$0.a(flw.a(xk.k, $$0x -> this.aP_()).a());
      this.c.a($$1x -> {
         flu var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   public void aP_() {
      this.m.a(this.B);
   }

   @Override
   protected void c() {
      if (this.C != null) {
         this.C.d(this.n - 15);
      }

      this.c.a();
      fpj.a(this.c, this.H());
   }

   @Override
   public xl i() {
      return a;
   }
}
