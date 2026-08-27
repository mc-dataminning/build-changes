public class cuh extends cvp {
   private final dfl a;

   public cuh(csx $$0, dfk.d $$1) {
      super($$1);
      this.a = $$0.n();
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, dfl $$3, byo $$4) {
      if (b($$0, $$1, $$3)) {
         $$0.a($$1, this.a, 3);
      }
   }

   @Override
   public dfl a(clp $$0) {
      cpd $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfl $$3 = $$1.a_($$2);
      return b($$1, $$2, $$3) ? this.a : super.a($$0);
   }

   private static boolean b(cpd $$0, gw $$1, dfl $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(cpd $$0, gw $$1) {
      boolean $$2 = false;
      gw.a $$3 = $$1.j();

      for (hc $$4 : hc.values()) {
         dfl $$5 = $$0.a_($$3);
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

   private static boolean n(dfl $$0) {
      return $$0.u().a(apz.a);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return a($$3, $$4) ? this.a : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int d(dfl $$0, cpd $$1, gw $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
