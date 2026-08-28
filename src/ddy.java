import java.util.ArrayList;
import java.util.List;

public class ddy extends deh {
   public ddy(dee $$0) {
      super($$0);
   }

   public boolean a(def $$0, djz $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            daa $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.a(axo.bQ)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$5.h() instanceof cyz)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public daa a(def $$0, ji.a $$1) {
      List<cyz> $$2 = new ArrayList<>();
      daa $$3 = daa.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         daa $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axo.bQ)) {
               if (!$$3.f()) {
                  return daa.k;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof cyz $$6)) {
                  return daa.k;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? dcn.a($$3, $$2) : daa.k;
   }

   @Override
   public dfb<ddy> a() {
      return dfb.c;
   }
}
