import java.util.ArrayList;
import java.util.List;

public class dcq extends dcz {
   public dcq(dcw $$0) {
      super($$0);
   }

   public boolean a(dcx $$0, dip $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cys $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.a(axi.bO)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$5.h() instanceof cxr)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cys a(dcx $$0, jg.a $$1) {
      List<cxr> $$2 = new ArrayList<>();
      cys $$3 = cys.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cys $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axi.bO)) {
               if (!$$3.f()) {
                  return cys.k;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof cxr $$6)) {
                  return cys.k;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? dbf.a($$3, $$2) : cys.k;
   }

   @Override
   public ddt<dcq> a() {
      return ddt.c;
   }
}
