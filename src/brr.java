public class brr extends bqh {
   private final bjv a;

   public brr(bjv $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aA() && !this.a.dL().b_(this.a.dl()).a(aqa.a);
   }

   @Override
   public void c() {
      gw $$0 = null;

      for (gw $$2 : gw.b(
         asb.a(this.a.dq() - 2.0), asb.a(this.a.ds() - 2.0), asb.a(this.a.dw() - 2.0), asb.a(this.a.dq() + 2.0), this.a.dr(), asb.a(this.a.dw() + 2.0)
      )) {
         if (this.a.dL().b_($$2).a(aqa.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.I().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
