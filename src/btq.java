public class btq extends bsg {
   private final blu a;

   public btq(blu $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aC() && !this.a.dN().b_(this.a.dn()).a(arp.a);
   }

   @Override
   public void c() {
      hx $$0 = null;

      for (hx $$2 : hx.b(
         atq.a(this.a.ds() - 2.0), atq.a(this.a.du() - 2.0), atq.a(this.a.dy() - 2.0), atq.a(this.a.ds() + 2.0), this.a.dt(), atq.a(this.a.dy() + 2.0)
      )) {
         if (this.a.dN().b_($$2).a(arp.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.K().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
