public class cua extends cvi {
   private final dfe a;

   public cua(csq $$0, dfd.d $$1) {
      super($$1);
      this.a = $$0.n();
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, dfe $$3, byh $$4) {
      if (b($$0, $$1, $$3)) {
         $$0.a($$1, this.a, 3);
      }
   }

   @Override
   public dfe a(cli $$0) {
      cow $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfe $$3 = $$1.a_($$2);
      return b($$1, $$2, $$3) ? this.a : super.a($$0);
   }

   private static boolean b(cow $$0, gw $$1, dfe $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(cow $$0, gw $$1) {
      boolean $$2 = false;
      gw.a $$3 = $$1.j();

      for (hc $$4 : hc.values()) {
         dfe $$5 = $$0.a_($$3);
         if ($$4 != hc.a || n($$5)) {
            $$3.a($$1, $$4);
            $$5 = $$0.a_($$3);
            if (n($$5) && !$$5.d($$0, $$1, $$4.g())) {
               $$2 = true;
               break;
            }
         }
      }

      return $$2;
   }

   private static boolean n(dfe $$0) {
      return $$0.u().a(apt.a);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return a($$3, $$4) ? this.a : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int d(dfe $$0, cow $$1, gw $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
