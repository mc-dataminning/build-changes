public class cbg extends bzw {
   private final bth a;

   public cbg(bth $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aE() && !this.a.dP().b_(this.a.dp()).a(awa.a);
   }

   @Override
   public void c() {
      ja $$0 = null;

      for (ja $$2 : ja.b(
         aye.a(this.a.du() - 2.0), aye.a(this.a.dw() - 2.0), aye.a(this.a.dA() - 2.0), aye.a(this.a.du() + 2.0), this.a.dv(), aye.a(this.a.dA() + 2.0)
      )) {
         if (this.a.dP().b_($$2).a(awa.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.H().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
