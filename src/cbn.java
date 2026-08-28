import java.util.EnumSet;

public class cbn extends ccc {
   private final bvm a;

   public cbn(bvm $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccc.a.a, ccc.a.b));
   }

   @Override
   public boolean b() {
      return this.a.cv() < 140;
   }

   @Override
   public boolean c() {
      return this.b();
   }

   @Override
   public boolean U_() {
      return false;
   }

   @Override
   public void d() {
      this.h();
   }

   private void h() {
      Iterable<jh> $$0 = jh.b(
         azn.a(this.a.dD() - 1.0), this.a.dE(), azn.a(this.a.dJ() - 1.0), azn.a(this.a.dD() + 1.0), azn.a(this.a.dF() + 8.0), azn.a(this.a.dJ() + 1.0)
      );
      jh $$1 = null;

      for (jh $$2 : $$0) {
         if (this.a(this.a.dY(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = jh.a(this.a.dD(), this.a.dF() + 8.0, this.a.dJ());
      }

      this.a.P().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void a() {
      this.h();
      this.a.a(0.02F, new ezr((double)this.a.bo, (double)this.a.bp, (double)this.a.bq));
      this.a.a(bvi.a, this.a.dB());
   }

   private boolean a(dfi $$0, jh $$1) {
      dvo $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dil.nd)) && $$2.a(esd.a);
   }
}
