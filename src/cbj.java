public class cbj extends bzz {
   private final btk a;

   public cbj(btk $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aF() && !this.a.dQ().b_(this.a.dq()).a(awc.a);
   }

   @Override
   public void c() {
      ja $$0 = null;

      for (ja $$2 : ja.b(
         ayg.a(this.a.dv() - 2.0), ayg.a(this.a.dx() - 2.0), ayg.a(this.a.dB() - 2.0), ayg.a(this.a.dv() + 2.0), this.a.dw(), ayg.a(this.a.dB() + 2.0)
      )) {
         if (this.a.dQ().b_($$2).a(awc.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.H().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
