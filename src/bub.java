public class bub extends bsr {
   private final bme a;

   public bub(bme $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aC() && !this.a.dM().b_(this.a.dm()).a(arw.a);
   }

   @Override
   public void c() {
      hv $$0 = null;

      for (hv $$2 : hv.b(
         aty.a(this.a.dr() - 2.0), aty.a(this.a.dt() - 2.0), aty.a(this.a.dx() - 2.0), aty.a(this.a.dr() + 2.0), this.a.ds(), aty.a(this.a.dx() + 2.0)
      )) {
         if (this.a.dM().b_($$2).a(arw.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.K().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
