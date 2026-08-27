public class bso extends bre {
   private final bks a;

   public bso(bks $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aA() && !this.a.dL().b_(this.a.dl()).a(aqx.a);
   }

   @Override
   public void c() {
      ht $$0 = null;

      for (ht $$2 : ht.b(
         asy.a(this.a.dq() - 2.0), asy.a(this.a.ds() - 2.0), asy.a(this.a.dw() - 2.0), asy.a(this.a.dq() + 2.0), this.a.dr(), asy.a(this.a.dw() + 2.0)
      )) {
         if (this.a.dL().b_($$2).a(aqx.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.I().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
