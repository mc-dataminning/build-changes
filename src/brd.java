public class brd extends bpt {
   private final bjh a;

   public brd(bjh $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aA() && !this.a.dK().b_(this.a.dk()).a(apq.a);
   }

   @Override
   public void c() {
      gu $$0 = null;

      for (gu $$2 : gu.b(
         arp.a(this.a.dp() - 2.0), arp.a(this.a.dr() - 2.0), arp.a(this.a.dv() - 2.0), arp.a(this.a.dp() + 2.0), this.a.dq(), arp.a(this.a.dv() + 2.0)
      )) {
         if (this.a.dK().b_($$2).a(apq.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.E().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }
   }
}
