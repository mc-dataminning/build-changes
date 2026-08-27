public class brg extends bpw {
   private final bjk a;

   public brg(bjk $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aA() && !this.a.dK().b_(this.a.dk()).a(apt.a);
   }

   @Override
   public void c() {
      gw $$0 = null;

      for (gw $$2 : gw.b(
         ars.a(this.a.dp() - 2.0), ars.a(this.a.dr() - 2.0), ars.a(this.a.dv() - 2.0), ars.a(this.a.dp() + 2.0), this.a.dq(), ars.a(this.a.dv() + 2.0)
      )) {
         if (this.a.dK().b_($$2).a(apt.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.E().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
