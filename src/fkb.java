import javax.annotation.Nullable;

public class fkb extends hhw {
   private static final xv a = xv.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fry c = fry.d();
   private final fty C;
   @Nullable
   private fpa D;

   public fkb(fty $$0) {
      super(flx.a);
      this.C = $$0;
   }

   @Override
   public void aT_() {
      this.c.a(15).c().b();
      this.D = new fpa(a, this.p).b(true);
      this.c.a(this.D);
      fry $$0 = this.c.a(fry.e().a(8));
      xv $$1 = xv.c("mco.account.privacy.info.button");
      $$0.a(fof.a($$1, fsv.b(this, aza.a)).a());
      $$0.a(fof.a(xu.k, $$0x -> this.aP_()).a());
      this.c.a($$1x -> {
         fod var10000 = this.c($$1x);
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
      frs.a(this.c, this.H());
   }

   @Override
   public xv i() {
      return a;
   }
}
