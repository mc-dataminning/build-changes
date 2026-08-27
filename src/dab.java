public abstract class dab extends czu {
   protected dab(dex.d $$0) {
      super($$0);
   }

   private static boolean b(dey $$0, cpn $$1, gv $$2) {
      gv $$3 = $$2.c();
      dey $$4 = $$1.a_($$3);
      if ($$4.a(csl.dN) && $$4.c(czt.b) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = dzs.a($$1, $$0, $$2, $$4, $$3, hb.b, $$4.b($$1, $$3));
         return $$5 < $$1.M();
      }
   }

   private static boolean c(dey $$0, cpn $$1, gv $$2) {
      gv $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(apo.a);
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, csl.j.n());
      } else {
         if ($$1.z($$2.c()) >= 9) {
            dey $$4 = this.n();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               gv $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(csl.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(a, Boolean.valueOf($$1.a_($$6.c()).a(csl.dN))));
               }
            }
         }
      }
   }
}
