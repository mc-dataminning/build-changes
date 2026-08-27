public class btd extends brt {
   private final blh a;

   public btd(blh $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aA() && !this.a.dL().b_(this.a.dl()).a(arh.a);
   }

   @Override
   public void c() {
      ht $$0 = null;

      for (ht $$2 : ht.b(
         ati.a(this.a.dq() - 2.0), ati.a(this.a.ds() - 2.0), ati.a(this.a.dw() - 2.0), ati.a(this.a.dq() + 2.0), this.a.dr(), ati.a(this.a.dw() + 2.0)
      )) {
         if (this.a.dL().b_($$2).a(arh.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.I().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
