public class caw extends bzm {
   private final bsx a;

   public caw(bsx $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aE() && !this.a.dP().b_(this.a.dp()).a(awb.a);
   }

   @Override
   public void c() {
      io $$0 = null;

      for (io $$2 : io.b(
         ayd.a(this.a.du() - 2.0), ayd.a(this.a.dw() - 2.0), ayd.a(this.a.dA() - 2.0), ayd.a(this.a.du() + 2.0), this.a.dv(), ayd.a(this.a.dA() + 2.0)
      )) {
         if (this.a.dP().b_($$2).a(awb.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.H().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
