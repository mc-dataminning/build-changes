public class cav extends bzl {
   private final bsw a;

   public cav(bsw $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aE() && !this.a.dU().b_(this.a.du()).a(awj.a);
   }

   @Override
   public void c() {
      ir $$0 = null;

      for (ir $$2 : ir.b(
         aym.a(this.a.dz() - 2.0), aym.a(this.a.dB() - 2.0), aym.a(this.a.dF() - 2.0), aym.a(this.a.dz() + 2.0), this.a.dA(), aym.a(this.a.dF() + 2.0)
      )) {
         if (this.a.dU().b_($$2).a(awj.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.G().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
