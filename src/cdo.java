public class cdo extends cce {
   private final bvo a;

   public cdo(bvo $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.aJ() && !this.a.dW().b_(this.a.dw()).a(awv.a);
   }

   @Override
   public void d() {
      ji $$0 = null;

      for (ji $$2 : ji.b(
         ayz.a(this.a.dB() - 2.0), ayz.a(this.a.dD() - 2.0), ayz.a(this.a.dH() - 2.0), ayz.a(this.a.dB() + 2.0), this.a.dC(), ayz.a(this.a.dH() + 2.0)
      )) {
         if (this.a.dW().b_($$2).a(awv.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.I().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
