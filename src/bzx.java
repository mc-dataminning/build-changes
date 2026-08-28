import java.util.EnumSet;

public class bzx extends cam {
   private final btx a;

   public bzx(btx $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cam.a.a, cam.a.b));
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
      Iterable<iz> $$0 = iz.b(
         ayy.a(this.a.du() - 1.0), this.a.dv(), ayy.a(this.a.dA() - 1.0), ayy.a(this.a.du() + 1.0), ayy.a(this.a.dw() + 8.0), ayy.a(this.a.dA() + 1.0)
      );
      iz $$1 = null;

      for (iz $$2 : $$0) {
         if (this.a(this.a.dP(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = iz.a(this.a.du(), this.a.dw() + 8.0, this.a.dA());
      }

      this.a.K().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new evq((double)this.a.bo, (double)this.a.bp, (double)this.a.bq));
      this.a.a(btt.a, this.a.ds());
   }

   private boolean a(dca $$0, iz $$1) {
      dsb $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dfa.nd)) && $$2.a(eoj.a);
   }
}
