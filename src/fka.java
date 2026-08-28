import javax.annotation.Nullable;

public class fka extends hhv {
   private static final xv a = xv.c("mco.account.privacy.information");
   private static final int b = 15;
   private final frx c = frx.d();
   private final ftx C;
   @Nullable
   private foz D;

   public fka(ftx $$0) {
      super(flw.a);
      this.C = $$0;
   }

   @Override
   public void aT_() {
      this.c.a(15).c().b();
      this.D = new foz(a, this.p).b(true);
      this.c.a(this.D);
      frx $$0 = this.c.a(frx.e().a(8));
      xv $$1 = xv.c("mco.account.privacy.info.button");
      $$0.a(foe.a($$1, fsu.b(this, aza.a)).a());
      $$0.a(foe.a(xu.k, $$0x -> this.aP_()).a());
      this.c.a($$1x -> {
         foc var10000 = this.c($$1x);
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
      frr.a(this.c, this.H());
   }

   @Override
   public xv i() {
      return a;
   }
}
