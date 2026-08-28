public class cgl extends cfb {
   private final byn a;

   public cgl(byn $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.aH() && !this.a.dV().b_(this.a.dv()).a(axs.a);
   }

   @Override
   public void d() {
      iw $$0 = null;

      for (iw $$2 : iw.b(
         azz.a(this.a.dA() - 2.0), azz.a(this.a.dC() - 2.0), azz.a(this.a.dG() - 2.0), azz.a(this.a.dA() + 2.0), this.a.dB(), azz.a(this.a.dG() + 2.0)
      )) {
         if (this.a.dV().b_($$2).a(axs.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.L().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
