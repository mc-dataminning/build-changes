import javax.annotation.Nullable;

public class flz extends hol {
   private static final ww a = ww.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fvi c = fvi.d();
   private final fxi C;
   @Nullable
   private fsk D;

   public flz(fxi $$0) {
      super(fnw.a);
      this.C = $$0;
   }

   @Override
   public void aN_() {
      this.c.a(15).c().b();
      this.D = new fsk(a, this.p).b(true);
      this.c.a(this.D);
      fvi $$0 = this.c.a(fvi.e().a(8));
      ww $$1 = ww.c("mco.account.privacy.info.button");
      $$0.a(frq.a($$1, fwf.b(this, ayf.a)).a());
      $$0.a(frq.a(wv.k, $$0x -> this.aK_()).a());
      this.c.a($$1x -> {
         fro var10000 = this.c($$1x);
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
      fvc.a(this.c, this.J());
   }

   @Override
   public ww i() {
      return a;
   }
}
