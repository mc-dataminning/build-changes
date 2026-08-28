import java.util.ArrayList;
import java.util.List;

public class dbc extends dbl {
   public dbc(dbi $$0) {
      super($$0);
   }

   public boolean a(dbj $$0, dgz $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxh $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.a(awy.bO)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$5.h() instanceof cwf)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cxh a(dbj $$0, jt.a $$1) {
      List<cwf> $$2 = new ArrayList<>();
      cxh $$3 = cxh.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxh $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(awy.bO)) {
               if (!$$3.f()) {
                  return cxh.k;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof cwf $$6)) {
                  return cxh.k;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? czt.a($$3, $$2) : cxh.k;
   }

   @Override
   public dcf<dbc> a() {
      return dcf.c;
   }
}
