public class cgc extends ces {
   private final bye a;

   public cgc(bye $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.aH() && !this.a.dV().b_(this.a.dv()).a(axl.a);
   }

   @Override
   public void d() {
      iw $$0 = null;

      for (iw $$2 : iw.b(
         azq.a(this.a.dA() - 2.0), azq.a(this.a.dC() - 2.0), azq.a(this.a.dG() - 2.0), azq.a(this.a.dA() + 2.0), this.a.dB(), azq.a(this.a.dG() + 2.0)
      )) {
         if (this.a.dV().b_($$2).a(axl.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.L().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
