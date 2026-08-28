import javax.annotation.Nullable;

public class fgc extends hdk {
   private static final xd a = xd.c("mco.account.privacy.information");
   private static final int b = 15;
   private final foc c = foc.d();
   private final fqd B;
   @Nullable
   private fle C;

   public fgc(fqd $$0) {
      super(fic.a);
      this.B = $$0;
   }

   @Override
   public void aR_() {
      this.c.a(15).c().b();
      this.C = new fle(a, this.p).b(true);
      this.c.a(this.C);
      foc $$0 = this.c.a(foc.e().a(8));
      xd $$1 = xd.c("mco.account.privacy.info.button");
      $$0.a(fkk.a($$1, fpa.b(this, axz.a)).a());
      $$0.a(fkk.a(xc.k, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fki var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   public void d() {
      this.m.a(this.B);
   }

   @Override
   protected void c() {
      if (this.C != null) {
         this.C.d(this.n - 15);
      }

      this.c.a();
      fnw.a(this.c, this.H());
   }

   @Override
   public xd i() {
      return a;
   }
}
