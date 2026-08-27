public class buu extends btk {
   private final bmx a;

   public buu(bmx $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aC() && !this.a.dL().b_(this.a.dl()).a(asn.a);
   }

   @Override
   public void c() {
      hx $$0 = null;

      for (hx $$2 : hx.b(
         aup.a(this.a.dq() - 2.0), aup.a(this.a.ds() - 2.0), aup.a(this.a.dw() - 2.0), aup.a(this.a.dq() + 2.0), this.a.dr(), aup.a(this.a.dw() + 2.0)
      )) {
         if (this.a.dL().b_($$2).a(asn.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.K().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
