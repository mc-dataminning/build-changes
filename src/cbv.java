public class cbv extends cal {
   private final btw a;

   public cbv(btw $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aE() && !this.a.dP().b_(this.a.dp()).a(awu.a);
   }

   @Override
   public void c() {
      iz $$0 = null;

      for (iz $$2 : iz.b(
         ayx.a(this.a.du() - 2.0), ayx.a(this.a.dw() - 2.0), ayx.a(this.a.dA() - 2.0), ayx.a(this.a.du() + 2.0), this.a.dv(), ayx.a(this.a.dA() + 2.0)
      )) {
         if (this.a.dP().b_($$2).a(awu.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.H().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
