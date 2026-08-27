import com.google.common.collect.Lists;
import java.util.List;

public class cvc extends cvk {
   public cvc(cvi $$0) {
      super($$0);
   }

   public boolean a(cnm $$0, czg $$1) {
      crs $$2 = crs.i;
      List<crs> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crs $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(avm.ba)) {
               if (!$$2.d()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.f() instanceof cqm)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.d() && !$$3.isEmpty();
   }

   public crs a(cnm $$0, jb $$1) {
      List<cqm> $$2 = Lists.newArrayList();
      crs $$3 = crs.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crs $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(avm.ba)) {
               if (!$$3.d()) {
                  return crs.i;
               }

               $$3 = $$5.r();
            } else {
               if (!($$5.f() instanceof cqm $$6)) {
                  return crs.i;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.d() && !$$2.isEmpty() ? cuf.a($$3, $$2) : crs.i;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cvw<?> ao_() {
      return cvw.c;
   }
}
