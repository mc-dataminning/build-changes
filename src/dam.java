import java.util.ArrayList;
import java.util.List;

public class dam extends dav {
   public dam(das $$0) {
      super($$0);
   }

   public boolean a(dat $$0, dgj $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwq $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.a(awy.bO)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$5.h() instanceof cvo)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cwq a(dat $$0, jt.a $$1) {
      List<cvo> $$2 = new ArrayList<>();
      cwq $$3 = cwq.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwq $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(awy.bO)) {
               if (!$$3.f()) {
                  return cwq.j;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof cvo $$6)) {
                  return cwq.j;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? cze.a($$3, $$2) : cwq.j;
   }

   @Override
   public dbp<dam> a() {
      return dbp.c;
   }
}
