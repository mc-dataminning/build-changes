public class dbr extends dbq {
   public dbr(dbn $$0) {
      super($$0);
   }

   public boolean a(dbo $$0, dha $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
            cxk $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(ayd.bI)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(cxo.a)) {
                     return false;
                  }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cxk a(dbo $$0, js.a $$1) {
      dvw $$2 = new dvw($$0.a(1).h(), $$0.a(3).h(), $$0.a(5).h(), $$0.a(7).h());
      return dvg.a($$2);
   }

   @Override
   public dci<dbr> a() {
      return dci.v;
   }
}
