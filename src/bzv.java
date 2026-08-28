import java.util.EnumSet;

public class bzv extends cak {
   private final btu a;

   public bzv(btu $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cak.a.a, cak.a.b));
   }

   @Override
   public boolean b() {
      return this.a.cm() < 140;
   }

   @Override
   public boolean c() {
      return this.b();
   }

   @Override
   public boolean Q_() {
      return false;
   }

   @Override
   public void d() {
      this.h();
   }

   private void h() {
      Iterable<jd> $$0 = jd.b(
         ayn.a(this.a.dv() - 1.0), this.a.dw(), ayn.a(this.a.dB() - 1.0), ayn.a(this.a.dv() + 1.0), ayn.a(this.a.dx() + 8.0), ayn.a(this.a.dB() + 1.0)
      );
      jd $$1 = null;

      for (jd $$2 : $$0) {
         if (this.a(this.a.dQ(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = jd.a(this.a.dv(), this.a.dx() + 8.0, this.a.dB());
      }

      this.a.J().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void a() {
      this.h();
      this.a.a(0.02F, new eww((double)this.a.bo, (double)this.a.bp, (double)this.a.bq));
      this.a.a(btq.a, this.a.dt());
   }

   private boolean a(dcx $$0, jd $$1) {
      dta $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dfy.nd)) && $$2.a(epn.a);
   }
}
