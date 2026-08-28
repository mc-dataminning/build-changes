import java.util.ArrayList;
import java.util.List;

public class dcw extends ddf {
   public dcw(ddc $$0) {
      super($$0);
   }

   public boolean a(ddd $$0, div $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cyy $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.a(axk.bO)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$5.h() instanceof cxx)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cyy a(ddd $$0, jg.a $$1) {
      List<cxx> $$2 = new ArrayList<>();
      cyy $$3 = cyy.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cyy $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axk.bO)) {
               if (!$$3.f()) {
                  return cyy.k;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof cxx $$6)) {
                  return cyy.k;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? dbl.a($$3, $$2) : cyy.k;
   }

   @Override
   public ddz<dcw> a() {
      return ddz.c;
   }
}
