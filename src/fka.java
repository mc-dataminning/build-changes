import javax.annotation.Nullable;

public class fka extends hmd {
   private static final wp a = wp.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fti c = fti.d();
   private final fvi C;
   @Nullable
   private fqk D;

   public fka(fvi $$0) {
      super(flx.a);
      this.C = $$0;
   }

   @Override
   public void aR_() {
      this.c.a(15).c().b();
      this.D = new fqk(a, this.p).b(true);
      this.c.a(this.D);
      fti $$0 = this.c.a(fti.e().a(8));
      wp $$1 = wp.c("mco.account.privacy.info.button");
      $$0.a(fpq.a($$1, fuf.b(this, axv.a)).a());
      $$0.a(fpq.a(wo.k, $$0x -> this.aO_()).a());
      this.c.a($$1x -> {
         fpo var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   public void aO_() {
      this.m.a(this.C);
   }

   @Override
   protected void c() {
      if (this.D != null) {
         this.D.d(this.n - 15);
      }

      this.c.a();
      ftc.a(this.c, this.J());
   }

   @Override
   public wp i() {
      return a;
   }
}
