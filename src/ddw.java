import java.util.ArrayList;
import java.util.List;

public class ddw extends def {
   public ddw(dec $$0) {
      super($$0);
   }

   public boolean a(ded $$0, djx $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czy $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.a(axm.bP)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$5.h() instanceof cyx)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public czy a(ded $$0, jh.a $$1) {
      List<cyx> $$2 = new ArrayList<>();
      czy $$3 = czy.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czy $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axm.bP)) {
               if (!$$3.f()) {
                  return czy.k;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof cyx $$6)) {
                  return czy.k;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? dcl.a($$3, $$2) : czy.k;
   }

   @Override
   public dez<ddw> a() {
      return dez.c;
   }
}
