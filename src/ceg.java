public class ceg extends ccw {
   private final bwg a;

   public ceg(bwg $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.aJ() && !this.a.dU().b_(this.a.du()).a(awv.a);
   }

   @Override
   public void d() {
      ji $$0 = null;

      for (ji $$2 : ji.b(
         ayz.a(this.a.dz() - 2.0), ayz.a(this.a.dB() - 2.0), ayz.a(this.a.dF() - 2.0), ayz.a(this.a.dz() + 2.0), this.a.dA(), ayz.a(this.a.dF() + 2.0)
      )) {
         if (this.a.dU().b_($$2).a(awv.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.L().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
