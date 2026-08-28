public class dcz extends dbq {
   public dcz(dbn $$0) {
      super($$0);
   }

   public boolean a(dbo $$0, dha $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cxk $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cxo.wh)) {
                     return false;
                  }
               } else if (!$$4.a(cxo.oS)) {
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
      cxk $$2 = $$0.a(1, 1);
      if (!$$2.a(cxo.wh)) {
         return cxk.k;
      } else {
         cxk $$3 = new cxk(cxo.wg, 8);
         $$3.b(ku.Q, $$2.a(ku.Q));
         return $$3;
      }
   }

   @Override
   public dci<dcz> a() {
      return dci.j;
   }
}
