public class buq extends btg {
   private final bmt a;

   public buq(bmt $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aC() && !this.a.dM().b_(this.a.dm()).a(asl.a);
   }

   @Override
   public void c() {
      hx $$0 = null;

      for (hx $$2 : hx.b(
         aun.a(this.a.dr() - 2.0), aun.a(this.a.dt() - 2.0), aun.a(this.a.dx() - 2.0), aun.a(this.a.dr() + 2.0), this.a.ds(), aun.a(this.a.dx() + 2.0)
      )) {
         if (this.a.dM().b_($$2).a(asl.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.K().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
