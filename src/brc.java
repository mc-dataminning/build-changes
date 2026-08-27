public class brc extends bps {
   private final bjf a;

   public brc(bjf $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aA() && !this.a.dK().b_(this.a.dk()).a(apo.a);
   }

   @Override
   public void c() {
      gv $$0 = null;

      for (gv $$2 : gv.b(
         aro.a(this.a.dp() - 2.0), aro.a(this.a.dr() - 2.0), aro.a(this.a.dv() - 2.0), aro.a(this.a.dp() + 2.0), this.a.dq(), aro.a(this.a.dv() + 2.0)
      )) {
         if (this.a.dK().b_($$2).a(apo.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.E().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
