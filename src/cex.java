public class cex extends cdn {
   private final bwz a;

   public cex(bwz $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.aJ() && !this.a.dV().b_(this.a.dv()).a(axf.a);
   }

   @Override
   public void d() {
      jj $$0 = null;

      for (jj $$2 : jj.b(
         azk.a(this.a.dA() - 2.0), azk.a(this.a.dC() - 2.0), azk.a(this.a.dG() - 2.0), azk.a(this.a.dA() + 2.0), this.a.dB(), azk.a(this.a.dG() + 2.0)
      )) {
         if (this.a.dV().b_($$2).a(axf.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.L().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
