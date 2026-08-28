public class ccm extends cbc {
   private final bun a;

   public ccm(bun $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.aH() && !this.a.dS().b_(this.a.ds()).a(awy.a);
   }

   @Override
   public void d() {
      je $$0 = null;

      for (je $$2 : je.b(
         azc.a(this.a.dx() - 2.0), azc.a(this.a.dz() - 2.0), azc.a(this.a.dD() - 2.0), azc.a(this.a.dx() + 2.0), this.a.dy(), azc.a(this.a.dD() + 2.0)
      )) {
         if (this.a.dS().b_($$2).a(awy.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.M().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
