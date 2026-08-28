import java.util.ArrayList;
import java.util.List;

public class dei extends der {
   public dei(deo $$0) {
      super($$0);
   }

   public boolean a(dep $$0, dkj $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            dak $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.a(axv.bQ)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$5.h() instanceof czj)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public dak a(dep $$0, ji.a $$1) {
      List<czj> $$2 = new ArrayList<>();
      dak $$3 = dak.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         dak $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axv.bQ)) {
               if (!$$3.f()) {
                  return dak.l;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof czj $$6)) {
                  return dak.l;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? dcx.a($$3, $$2) : dak.l;
   }

   @Override
   public dfl<dei> a() {
      return dfl.c;
   }
}
