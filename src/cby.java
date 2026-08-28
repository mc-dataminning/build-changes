public class cby extends cao {
   private final btz a;

   public cby(btz $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aE() && !this.a.dP().b_(this.a.dp()).a(awv.a);
   }

   @Override
   public void c() {
      iz $$0 = null;

      for (iz $$2 : iz.b(
         ayz.a(this.a.du() - 2.0), ayz.a(this.a.dw() - 2.0), ayz.a(this.a.dA() - 2.0), ayz.a(this.a.du() + 2.0), this.a.dv(), ayz.a(this.a.dA() + 2.0)
      )) {
         if (this.a.dP().b_($$2).a(awv.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.H().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
