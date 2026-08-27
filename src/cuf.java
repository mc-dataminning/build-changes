public class cuf extends cvn {
   private final dfj a;

   public cuf(csv $$0, dfi.d $$1) {
      super($$1);
      this.a = $$0.n();
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, dfj $$3, bym $$4) {
      if (b($$0, $$1, $$3)) {
         $$0.a($$1, this.a, 3);
      }
   }

   @Override
   public dfj a(cln $$0) {
      cpb $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfj $$3 = $$1.a_($$2);
      return b($$1, $$2, $$3) ? this.a : super.a($$0);
   }

   private static boolean b(cpb $$0, gw $$1, dfj $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(cpb $$0, gw $$1) {
      boolean $$2 = false;
      gw.a $$3 = $$1.j();

      for (ha $$4 : ha.values()) {
         dfj $$5 = $$0.a_($$3);
         if ($$4 != ha.a || n($$5)) {
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

   private static boolean n(dfj $$0) {
      return $$0.u().a(apx.a);
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return a($$3, $$4) ? this.a : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int d(dfj $$0, cpb $$1, gw $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
