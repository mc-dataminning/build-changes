public class ddm extends dcb {
   public ddm(dby $$0) {
      super($$0);
   }

   public boolean a(dbz $$0, dhp $$1) {
      if ($$0.f() == 3 && $$0.g() == 3 && $$0.e() == 9) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cxy $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cyc.wv)) {
                     return false;
                  }
               } else if (!$$4.a(cyc.pf)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cxy a(dbz $$0, ju.a $$1) {
      cxy $$2 = $$0.a(1, 1);
      if (!$$2.a(cyc.wv)) {
         return cxy.k;
      } else {
         cxy $$3 = new cxy(cyc.wu, 8);
         $$3.b(kx.R, $$2.a(kx.R));
         return $$3;
      }
   }

   @Override
   public dcv<ddm> a() {
      return dcv.j;
   }
}
