import java.util.EnumSet;

public class bzh extends bzw {
   private final bth a;

   public bzh(bth $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bzw.a.a, bzw.a.b));
   }

   @Override
   public boolean a() {
      return this.a.cl() < 140;
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
         aye.a(this.a.du() - 1.0), this.a.dv(), aye.a(this.a.dA() - 1.0), aye.a(this.a.du() + 1.0), aye.a(this.a.dw() + 8.0), aye.a(this.a.dA() + 1.0)
      );
      ja $$1 = null;

      for (ja $$2 : $$0) {
         if (this.a(this.a.dP(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = ja.a(this.a.du(), this.a.dw() + 8.0, this.a.dA());
      }

      this.a.K().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new evz((double)this.a.bo, (double)this.a.bp, (double)this.a.bq));
      this.a.a(btd.a, this.a.ds());
   }

   private boolean a(dcg $$0, ja $$1) {
      dsh $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dfh.nd)) && $$2.a(eoq.a);
   }
}
