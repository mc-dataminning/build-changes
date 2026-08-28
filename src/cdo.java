public class cdo extends cce {
   private final bvo a;

   public cdo(bvo $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.aJ() && !this.a.dV().b_(this.a.dv()).a(awv.a);
   }

   @Override
   public void d() {
      ji $$0 = null;

      for (ji $$2 : ji.b(
         ayz.a(this.a.dA() - 2.0), ayz.a(this.a.dC() - 2.0), ayz.a(this.a.dG() - 2.0), ayz.a(this.a.dA() + 2.0), this.a.dB(), ayz.a(this.a.dG() + 2.0)
      )) {
         if (this.a.dV().b_($$2).a(awv.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.N().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
