public class cdd extends cbt {
   private final bvd a;

   public cdd(bvd $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.aJ() && !this.a.dX().b_(this.a.dx()).a(axf.a);
   }

   @Override
   public void d() {
      jg $$0 = null;

      for (jg $$2 : jg.b(
         azj.a(this.a.dC() - 2.0), azj.a(this.a.dE() - 2.0), azj.a(this.a.dI() - 2.0), azj.a(this.a.dC() + 2.0), this.a.dD(), azj.a(this.a.dI() + 2.0)
      )) {
         if (this.a.dX().b_($$2).a(axf.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.M().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
