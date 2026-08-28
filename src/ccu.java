public class ccu extends cbk {
   private final buv a;

   public ccu(buv $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.aH() && !this.a.dS().b_(this.a.ds()).a(axb.a);
   }

   @Override
   public void d() {
      jf $$0 = null;

      for (jf $$2 : jf.b(
         azf.a(this.a.dx() - 2.0), azf.a(this.a.dz() - 2.0), azf.a(this.a.dD() - 2.0), azf.a(this.a.dx() + 2.0), this.a.dy(), azf.a(this.a.dD() + 2.0)
      )) {
         if (this.a.dS().b_($$2).a(axb.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.M().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
