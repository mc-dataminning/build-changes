import java.util.EnumSet;

public class bzl extends caa {
   private final btl a;

   public bzl(btl $$0) {
      this.a = $$0;
      this.a(EnumSet.of(caa.a.a, caa.a.b));
   }

   @Override
   public boolean a() {
      return this.a.cn() < 140;
   }

   @Override
   public boolean b() {
      return this.a();
   }

   @Override
   public boolean Q_() {
      return false;
   }

   @Override
   public void c() {
      this.h();
   }

   private void h() {
      Iterable<ja> $$0 = ja.b(
         ayg.a(this.a.dw() - 1.0), this.a.dx(), ayg.a(this.a.dC() - 1.0), ayg.a(this.a.dw() + 1.0), ayg.a(this.a.dy() + 8.0), ayg.a(this.a.dC() + 1.0)
      );
      ja $$1 = null;

      for (ja $$2 : $$0) {
         if (this.a(this.a.dR(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = ja.a(this.a.dw(), this.a.dy() + 8.0, this.a.dC());
      }

      this.a.J().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new ewh((double)this.a.bp, (double)this.a.bq, (double)this.a.br));
      this.a.a(bth.a, this.a.du());
   }

   private boolean a(dcj $$0, ja $$1) {
      dsl $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dfk.nd)) && $$2.a(eoy.a);
   }
}
