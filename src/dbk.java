import java.util.ArrayList;
import java.util.List;

public class dbk extends dbt {
   public dbk(dbq $$0) {
      super($$0);
   }

   public boolean a(dbr $$0, dhh $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxo $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.a(ayd.bR)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$5.h() instanceof cwm)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cxo a(dbr $$0, js.a $$1) {
      List<cwm> $$2 = new ArrayList<>();
      cxo $$3 = cxo.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxo $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(ayd.bR)) {
               if (!$$3.f()) {
                  return cxo.j;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof cwm $$6)) {
                  return cxo.j;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? dac.a($$3, $$2) : cxo.j;
   }

   @Override
   public dcn<dbk> a() {
      return dcn.c;
   }
}
