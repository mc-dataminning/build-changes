import java.util.EnumSet;

public class cbj extends cby {
   private final bvi a;

   public cbj(bvi $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cby.a.a, cby.a.b));
   }

   @Override
   public boolean b() {
      return this.a.cu() < 140;
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
         azk.a(this.a.dC() - 1.0), this.a.dD(), azk.a(this.a.dI() - 1.0), azk.a(this.a.dC() + 1.0), azk.a(this.a.dE() + 8.0), azk.a(this.a.dI() + 1.0)
      );
      jh $$1 = null;

      for (jh $$2 : $$0) {
         if (this.a(this.a.dX(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = jh.a(this.a.dC(), this.a.dE() + 8.0, this.a.dI());
      }

      this.a.P().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void a() {
      this.h();
      this.a.a(0.02F, new ezn((double)this.a.bo, (double)this.a.bp, (double)this.a.bq));
      this.a.a(bve.a, this.a.dA());
   }

   private boolean a(dfe $$0, jh $$1) {
      dvj $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dig.nd)) && $$2.a(erz.a);
   }
}
