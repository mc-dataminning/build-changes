public abstract class dao extends dah {
   protected dao(dfk.d $$0) {
      super($$0);
   }

   private static boolean b(dfl $$0, cqa $$1, gw $$2) {
      gw $$3 = $$2.c();
      dfl $$4 = $$1.a_($$3);
      if ($$4.a(csy.dN) && $$4.c(dag.b) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = eaf.a($$1, $$0, $$2, $$4, $$3, hc.b, $$4.b($$1, $$3));
         return $$5 < $$1.M();
      }
   }

   private static boolean c(dfl $$0, cqa $$1, gw $$2) {
      gw $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(apz.a);
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, csy.j.n());
      } else {
         if ($$1.z($$2.c()) >= 9) {
            dfl $$4 = this.n();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               gw $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(csy.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(a, Boolean.valueOf($$1.a_($$6.c()).a(csy.dN))));
               }
            }
         }
      }
   }
}
