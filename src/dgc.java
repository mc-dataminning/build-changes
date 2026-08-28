public class dgc extends der {
   public dgc(deo $$0) {
      super($$0);
   }

   public boolean a(dep $$0, dkj $$1) {
      if ($$0.f() == 3 && $$0.g() == 3 && $$0.e() == 9) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               dak $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(dao.wC)) {
                     return false;
                  }
               } else if (!$$4.a(dao.pk)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public dak a(dep $$0, ji.a $$1) {
      dak $$2 = $$0.a(1, 1);
      if (!$$2.a(dao.wC)) {
         return dak.l;
      } else {
         dak $$3 = new dak(dao.wB, 8);
         $$3.b(kl.R, $$2.a(kl.R));
         return $$3;
      }
   }

   @Override
   public dfl<dgc> a() {
      return dfl.j;
   }
}
