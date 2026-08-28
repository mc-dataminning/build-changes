import javax.annotation.Nullable;

public class fox extends hrm {
   private static final xa a = xa.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fyd c = fyd.d();
   private final gad C;
   @Nullable
   private fvf D;

   public fox(gad $$0) {
      super(fqu.a);
      this.C = $$0;
   }

   @Override
   public void aS_() {
      this.c.a(15).c().b();
      this.D = new fvf(a, this.p).b(true);
      this.c.a(this.D);
      fyd $$0 = this.c.a(fyd.e().a(8));
      xa $$1 = xa.c("mco.account.privacy.info.button");
      $$0.a(ful.a($$1, fza.b(this, ayj.a)).a());
      $$0.a(ful.a(wz.k, $$0x -> this.aP_()).a());
      this.c.a($$1x -> {
         fuj var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   public void aP_() {
      this.m.a(this.C);
   }

   @Override
   protected void c() {
      if (this.D != null) {
         this.D.d(this.n - 15);
      }

      this.c.a();
      fxx.a(this.c, this.J());
   }

   @Override
   public xa i() {
      return a;
   }
}
