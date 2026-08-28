public class cdm extends ccc {
   private final bvm a;

   public cdm(bvm $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.aL() && !this.a.dY().b_(this.a.dy()).a(axj.a);
   }

   @Override
   public void d() {
      jh $$0 = null;

      for (jh $$2 : jh.b(
         azn.a(this.a.dD() - 2.0), azn.a(this.a.dF() - 2.0), azn.a(this.a.dJ() - 2.0), azn.a(this.a.dD() + 2.0), this.a.dE(), azn.a(this.a.dJ() + 2.0)
      )) {
         if (this.a.dY().b_($$2).a(axj.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.M().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
