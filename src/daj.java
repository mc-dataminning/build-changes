import java.util.ArrayList;
import java.util.List;

public class daj extends das {
   public daj(dap $$0) {
      super($$0);
   }

   public boolean a(daq $$0, dgg $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwn $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.a(awx.bO)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$5.h() instanceof cvl)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cwn a(daq $$0, jt.a $$1) {
      List<cvl> $$2 = new ArrayList<>();
      cwn $$3 = cwn.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwn $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(awx.bO)) {
               if (!$$3.f()) {
                  return cwn.j;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof cvl $$6)) {
                  return cwn.j;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? czb.a($$3, $$2) : cwn.j;
   }

   @Override
   public dbm<daj> a() {
      return dbm.c;
   }
}
