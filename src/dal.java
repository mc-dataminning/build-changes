import java.util.ArrayList;
import java.util.List;

public class dal extends dau {
   public dal(dar $$0) {
      super($$0);
   }

   public boolean a(das $$0, dgi $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwp $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.a(awy.bP)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$5.h() instanceof cvn)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cwp a(das $$0, jt.a $$1) {
      List<cvn> $$2 = new ArrayList<>();
      cwp $$3 = cwp.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwp $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(awy.bP)) {
               if (!$$3.f()) {
                  return cwp.j;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof cvn $$6)) {
                  return cwp.j;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? czd.a($$3, $$2) : cwp.j;
   }

   @Override
   public dbo<dal> a() {
      return dbo.c;
   }
}
