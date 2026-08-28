public class cga extends ceq {
   private final byc a;

   public cga(byc $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.aH() && !this.a.dV().b_(this.a.dv()).a(axj.a);
   }

   @Override
   public void d() {
      iv $$0 = null;

      for (iv $$2 : iv.b(
         azo.a(this.a.dA() - 2.0), azo.a(this.a.dC() - 2.0), azo.a(this.a.dG() - 2.0), azo.a(this.a.dA() + 2.0), this.a.dB(), azo.a(this.a.dG() + 2.0)
      )) {
         if (this.a.dV().b_($$2).a(axj.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.L().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
