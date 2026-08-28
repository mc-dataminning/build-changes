public class cbw extends cam {
   private final btw a;

   public cbw(btw $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.aF() && !this.a.dP().b_(this.a.dp()).a(awk.a);
   }

   @Override
   public void d() {
      jd $$0 = null;

      for (jd $$2 : jd.b(
         ayo.a(this.a.du() - 2.0), ayo.a(this.a.dw() - 2.0), ayo.a(this.a.dA() - 2.0), ayo.a(this.a.du() + 2.0), this.a.dv(), ayo.a(this.a.dA() + 2.0)
      )) {
         if (this.a.dP().b_($$2).a(awk.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.J().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
