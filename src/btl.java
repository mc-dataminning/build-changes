public class btl extends bsb {
   private final blp a;

   public btl(blp $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aC() && !this.a.dN().b_(this.a.dn()).a(arl.a);
   }

   @Override
   public void c() {
      ht $$0 = null;

      for (ht $$2 : ht.b(
         atm.a(this.a.ds() - 2.0), atm.a(this.a.du() - 2.0), atm.a(this.a.dy() - 2.0), atm.a(this.a.ds() + 2.0), this.a.dt(), atm.a(this.a.dy() + 2.0)
      )) {
         if (this.a.dN().b_($$2).a(arl.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.K().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
