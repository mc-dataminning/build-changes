import java.util.EnumSet;

public class bzk extends bzz {
   private final btk a;

   public bzk(btk $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bzz.a.a, bzz.a.b));
   }

   @Override
   public boolean a() {
      return this.a.cm() < 140;
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
         ayg.a(this.a.dv() - 1.0), this.a.dw(), ayg.a(this.a.dB() - 1.0), ayg.a(this.a.dv() + 1.0), ayg.a(this.a.dx() + 8.0), ayg.a(this.a.dB() + 1.0)
      );
      ja $$1 = null;

      for (ja $$2 : $$0) {
         if (this.a(this.a.dQ(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = ja.a(this.a.dv(), this.a.dx() + 8.0, this.a.dB());
      }

      this.a.K().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new ewf((double)this.a.bo, (double)this.a.bp, (double)this.a.bq));
      this.a.a(btg.a, this.a.dt());
   }

   private boolean a(dci $$0, ja $$1) {
      dsk $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dfj.nd)) && $$2.a(eow.a);
   }
}
