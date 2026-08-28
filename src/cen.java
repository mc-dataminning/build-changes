public class cen extends cdd {
   private final bwn a;

   public cen(bwn $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.aJ() && !this.a.dW().b_(this.a.dw()).a(aya.a);
   }

   @Override
   public void d() {
      jh $$0 = null;

      for (jh $$2 : jh.b(
         bae.a(this.a.dB() - 2.0), bae.a(this.a.dD() - 2.0), bae.a(this.a.dH() - 2.0), bae.a(this.a.dB() + 2.0), this.a.dC(), bae.a(this.a.dH() + 2.0)
      )) {
         if (this.a.dW().b_($$2).a(aya.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.I().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
