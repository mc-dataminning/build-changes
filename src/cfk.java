public class cfk extends cea {
   private final bxm a;

   public cfk(bxm $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.aJ() && !this.a.dV().b_(this.a.dv()).a(axh.a);
   }

   @Override
   public void d() {
      iu $$0 = null;

      for (iu $$2 : iu.b(
         azm.a(this.a.dA() - 2.0), azm.a(this.a.dC() - 2.0), azm.a(this.a.dG() - 2.0), azm.a(this.a.dA() + 2.0), this.a.dB(), azm.a(this.a.dG() + 2.0)
      )) {
         if (this.a.dV().b_($$2).a(axh.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.L().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
