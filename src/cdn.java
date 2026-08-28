public class cdn extends ccd {
   private final bvn a;

   public cdn(bvn $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.aJ() && !this.a.dW().b_(this.a.dw()).a(awu.a);
   }

   @Override
   public void d() {
      ji $$0 = null;

      for (ji $$2 : ji.b(
         ayy.a(this.a.dB() - 2.0), ayy.a(this.a.dD() - 2.0), ayy.a(this.a.dH() - 2.0), ayy.a(this.a.dB() + 2.0), this.a.dC(), ayy.a(this.a.dH() + 2.0)
      )) {
         if (this.a.dW().b_($$2).a(awu.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.I().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
