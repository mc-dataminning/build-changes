public class cay extends bzo {
   private final bsz a;

   public cay(bsz $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aE() && !this.a.dP().b_(this.a.dp()).a(awc.a);
   }

   @Override
   public void c() {
      io $$0 = null;

      for (io $$2 : io.b(
         ayf.a(this.a.du() - 2.0), ayf.a(this.a.dw() - 2.0), ayf.a(this.a.dA() - 2.0), ayf.a(this.a.du() + 2.0), this.a.dv(), ayf.a(this.a.dA() + 2.0)
      )) {
         if (this.a.dP().b_($$2).a(awc.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.H().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
