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
            cxg $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.a(axt.bR)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$5.h() instanceof cwe)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cxg a(dbj $$0, js.a $$1) {
      List<cwe> $$2 = new ArrayList<>();
      cxg $$3 = cxg.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxg $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axt.bR)) {
               if (!$$3.f()) {
                  return cxg.j;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof cwe $$6)) {
                  return cxg.j;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? czu.a($$3, $$2) : cxg.j;
   }

   @Override
   public dcf<dbc> a() {
      return dcf.c;
   }
}
