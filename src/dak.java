import java.util.ArrayList;
import java.util.List;

public class dak extends dat {
   public dak(daq $$0) {
      super($$0);
   }

   public boolean a(dar $$0, dgh $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwo $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.a(awy.bO)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$5.h() instanceof cvm)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cwo a(dar $$0, jt.a $$1) {
      List<cvm> $$2 = new ArrayList<>();
      cwo $$3 = cwo.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwo $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(awy.bO)) {
               if (!$$3.f()) {
                  return cwo.j;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof cvm $$6)) {
                  return cwo.j;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? czc.a($$3, $$2) : cwo.j;
   }

   @Override
   public dbn<dak> a() {
      return dbn.c;
   }
}
