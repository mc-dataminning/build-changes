import java.util.ArrayList;
import java.util.List;

public class dbl extends dbu {
   public dbl(dbr $$0) {
      super($$0);
   }

   public boolean a(dbs $$0, dhi $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxp $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.a(ayd.bR)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$5.h() instanceof cwn)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cxp a(dbs $$0, js.a $$1) {
      List<cwn> $$2 = new ArrayList<>();
      cxp $$3 = cxp.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxp $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(ayd.bR)) {
               if (!$$3.f()) {
                  return cxp.j;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof cwn $$6)) {
                  return cxp.j;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? dad.a($$3, $$2) : cxp.j;
   }

   @Override
   public dco<dbl> a() {
      return dco.c;
   }
}
