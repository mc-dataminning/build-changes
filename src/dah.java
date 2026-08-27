public abstract class dah extends daa {
   protected dah(dfd.d $$0) {
      super($$0);
   }

   private static boolean b(dfe $$0, cpt $$1, gw $$2) {
      gw $$3 = $$2.c();
      dfe $$4 = $$1.a_($$3);
      if ($$4.a(csr.dN) && $$4.c(czz.b) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = dzy.a($$1, $$0, $$2, $$4, $$3, hc.b, $$4.b($$1, $$3));
         return $$5 < $$1.M();
      }
   }

   private static boolean c(dfe $$0, cpt $$1, gw $$2) {
      gw $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(apt.a);
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, csr.j.n());
      } else {
         if ($$1.z($$2.c()) >= 9) {
            dfe $$4 = this.n();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               gw $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(csr.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(a, Boolean.valueOf($$1.a_($$6.c()).a(csr.dN))));
               }
            }
         }
      }
   }
}
