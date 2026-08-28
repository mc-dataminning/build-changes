public class dcp extends dbq {
   public dcp(dbn $$0) {
      super($$0);
   }

   public boolean a(dbo $$0, dha $$1) {
      cxk $$2 = cxk.k;
      cxk $$3 = cxk.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxk $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cvn) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cxo.wi)) {
                  return false;
               }

               if (!$$2.f()) {
                  return false;
               }

               dug $$6 = $$5.a(ku.ai, dug.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.f() && !$$3.f();
   }

   public cxk a(dbo $$0, js.a $$1) {
      cxk $$2 = cxk.k;
      cxk $$3 = cxk.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxk $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cvn) {
               $$2 = $$5;
            } else if ($$5.a(cxo.wi)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(ku.ai, $$2.a(ku.ai));
         $$3.b(ku.aj, ((cvn)$$2.h()).b());
         return $$3;
      }
   }

   @Override
   public dci<dcp> a() {
      return dci.l;
   }
}
