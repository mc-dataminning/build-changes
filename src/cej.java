public class cej extends ccz {
   private final bwj a;

   public cej(bwj $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.aJ() && !this.a.dV().b_(this.a.dv()).a(aya.a);
   }

   @Override
   public void d() {
      jh $$0 = null;

      for (jh $$2 : jh.b(
         bae.a(this.a.dA() - 2.0), bae.a(this.a.dC() - 2.0), bae.a(this.a.dG() - 2.0), bae.a(this.a.dA() + 2.0), this.a.dB(), bae.a(this.a.dG() + 2.0)
      )) {
         if (this.a.dV().b_($$2).a(aya.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.I().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
