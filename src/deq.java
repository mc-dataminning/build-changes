public class deq extends ddf {
   public deq(ddc $$0) {
      super($$0);
   }

   public boolean a(ddd $$0, div $$1) {
      if ($$0.f() == 3 && $$0.g() == 3 && $$0.e() == 9) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cyy $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(czc.wx)) {
                     return false;
                  }
               } else if (!$$4.a(czc.ph)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cyy a(ddd $$0, jg.a $$1) {
      cyy $$2 = $$0.a(1, 1);
      if (!$$2.a(czc.wx)) {
         return cyy.k;
      } else {
         cyy $$3 = new cyy(czc.ww, 8);
         $$3.b(kj.R, $$2.a(kj.R));
         return $$3;
      }
   }

   @Override
   public ddz<deq> a() {
      return ddz.j;
   }
}
