public class cef extends ccv {
   private final bwf a;

   public cef(bwf $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.aJ() && !this.a.dW().b_(this.a.dw()).a(axq.a);
   }

   @Override
   public void d() {
      jh $$0 = null;

      for (jh $$2 : jh.b(
         azu.a(this.a.dB() - 2.0), azu.a(this.a.dD() - 2.0), azu.a(this.a.dH() - 2.0), azu.a(this.a.dB() + 2.0), this.a.dC(), azu.a(this.a.dH() + 2.0)
      )) {
         if (this.a.dW().b_($$2).a(axq.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.I().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
