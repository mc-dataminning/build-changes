public class ctu extends cvc {
   private final dey a;

   public ctu(csk $$0, dex.d $$1) {
      super($$1);
      this.a = $$0.n();
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, dey $$3, byd $$4) {
      if (b($$0, $$1, $$3)) {
         $$0.a($$1, this.a, 3);
      }
   }

   @Override
   public dey a(cle $$0) {
      coq $$1 = $$0.q();
      gv $$2 = $$0.a();
      dey $$3 = $$1.a_($$2);
      return b($$1, $$2, $$3) ? this.a : super.a($$0);
   }

   private static boolean b(coq $$0, gv $$1, dey $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(coq $$0, gv $$1) {
      boolean $$2 = false;
      gv.a $$3 = $$1.j();

      for (hb $$4 : hb.values()) {
         dey $$5 = $$0.a_($$3);
         if ($$4 != hb.a || n($$5)) {
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

   private static boolean n(dey $$0) {
      return $$0.u().a(apo.a);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return a($$3, $$4) ? this.a : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int d(dey $$0, coq $$1, gv $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
