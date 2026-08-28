public class cdi extends cby {
   private final bvi a;

   public cdi(bvi $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.aK() && !this.a.dX().b_(this.a.dx()).a(axg.a);
   }

   @Override
   public void d() {
      jh $$0 = null;

      for (jh $$2 : jh.b(
         azk.a(this.a.dC() - 2.0), azk.a(this.a.dE() - 2.0), azk.a(this.a.dI() - 2.0), azk.a(this.a.dC() + 2.0), this.a.dD(), azk.a(this.a.dI() + 2.0)
      )) {
         if (this.a.dX().b_($$2).a(axg.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.M().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
