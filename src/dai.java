import com.google.common.collect.Lists;
import java.util.List;

public class dai extends dar {
   public dai(dao $$0) {
      super($$0);
   }

   public boolean a(dap $$0, dfm $$1) {
      cwm $$2 = cwm.k;
      List<cwm> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwm $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axl.bQ)) {
               if (!$$2.f()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.h() instanceof cvk)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.f() && !$$3.isEmpty();
   }

   public cwm a(dap $$0, js.a $$1) {
      List<cvk> $$2 = Lists.newArrayList();
      cwm $$3 = cwm.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwm $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axl.bQ)) {
               if (!$$3.f()) {
                  return cwm.k;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof cvk $$6)) {
                  return cwm.k;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? cza.a($$3, $$2) : cwm.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public dbf<?> ap_() {
      return dbf.c;
   }
}
