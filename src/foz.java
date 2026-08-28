import javax.annotation.Nullable;

public class foz extends hro {
   private static final xc a = xc.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fyf c = fyf.d();
   private final gaf C;
   @Nullable
   private fvh D;

   public foz(gaf $$0) {
      super(fqw.a);
      this.C = $$0;
   }

   @Override
   public void aS_() {
      this.c.a(15).c().b();
      this.D = new fvh(a, this.p).b(true);
      this.c.a(this.D);
      fyf $$0 = this.c.a(fyf.e().a(8));
      xc $$1 = xc.c("mco.account.privacy.info.button");
      $$0.a(fun.a($$1, fzc.b(this, ayl.a)).a());
      $$0.a(fun.a(xb.k, $$0x -> this.aP_()).a());
      this.c.a($$1x -> {
         ful var10000 = this.c($$1x);
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
      fxz.a(this.c, this.J());
   }

   @Override
   public xc i() {
      return a;
   }
}
