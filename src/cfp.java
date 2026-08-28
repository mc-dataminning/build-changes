public class cfp extends cef {
   private final bxr a;

   public cfp(bxr $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.aH() && !this.a.dU().b_(this.a.du()).a(axh.a);
   }

   @Override
   public void d() {
      iv $$0 = null;

      for (iv $$2 : iv.b(
         azm.a(this.a.dz() - 2.0), azm.a(this.a.dB() - 2.0), azm.a(this.a.dF() - 2.0), azm.a(this.a.dz() + 2.0), this.a.dA(), azm.a(this.a.dF() + 2.0)
      )) {
         if (this.a.dU().b_($$2).a(axh.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.L().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
