public class cbk extends caa {
   private final btl a;

   public cbk(btl $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aG() && !this.a.dR().b_(this.a.dr()).a(awc.a);
   }

   @Override
   public void c() {
      ja $$0 = null;

      for (ja $$2 : ja.b(
         ayg.a(this.a.dw() - 2.0), ayg.a(this.a.dy() - 2.0), ayg.a(this.a.dC() - 2.0), ayg.a(this.a.dw() + 2.0), this.a.dx(), ayg.a(this.a.dC() + 2.0)
      )) {
         if (this.a.dR().b_($$2).a(awc.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.H().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
