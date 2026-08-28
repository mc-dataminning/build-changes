import javax.annotation.Nullable;

public class fju extends hhp {
   private static final xv a = xv.c("mco.account.privacy.information");
   private static final int b = 15;
   private final frr c = frr.d();
   private final ftr C;
   @Nullable
   private fot D;

   public fju(ftr $$0) {
      super(flq.a);
      this.C = $$0;
   }

   @Override
   public void aT_() {
      this.c.a(15).c().b();
      this.D = new fot(a, this.p).b(true);
      this.c.a(this.D);
      frr $$0 = this.c.a(frr.e().a(8));
      xv $$1 = xv.c("mco.account.privacy.info.button");
      $$0.a(fny.a($$1, fso.b(this, aza.a)).a());
      $$0.a(fny.a(xu.k, $$0x -> this.aP_()).a());
      this.c.a($$1x -> {
         fnw var10000 = this.c($$1x);
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
      frl.a(this.c, this.H());
   }

   @Override
   public xv i() {
      return a;
   }
}
