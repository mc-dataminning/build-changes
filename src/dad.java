public abstract class dad extends czw {
   protected dad(dez.d $$0) {
      super($$0);
   }

   private static boolean b(dfa $$0, cpp $$1, gu $$2) {
      gu $$3 = $$2.c();
      dfa $$4 = $$1.a_($$3);
      if ($$4.a(csn.dN) && $$4.c(czv.b) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = dzu.a($$1, $$0, $$2, $$4, $$3, ha.b, $$4.b($$1, $$3));
         return $$5 < $$1.M();
      }
   }

   private static boolean c(dfa $$0, cpp $$1, gu $$2) {
      gu $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(apq.a);
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, csn.j.n());
      } else {
         if ($$1.z($$2.c()) >= 9) {
            dfa $$4 = this.n();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               gu $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(csn.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(a, Boolean.valueOf($$1.a_($$6.c()).a(csn.dN))));
               }
            }
         }
      }
   }
}
