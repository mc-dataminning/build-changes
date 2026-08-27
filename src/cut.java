import com.google.common.collect.Lists;
import java.util.List;

public class cut extends cvb {
   public cut(cuz $$0) {
      super($$0);
   }

   public boolean a(cnf $$0, cyx $$1) {
      crj $$2 = crj.i;
      List<crj> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crj $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(avk.ba)) {
               if (!$$2.d()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.f() instanceof cqd)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.d() && !$$3.isEmpty();
   }

   public crj a(cnf $$0, iz $$1) {
      List<cqd> $$2 = Lists.newArrayList();
      crj $$3 = crj.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crj $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(avk.ba)) {
               if (!$$3.d()) {
                  return crj.i;
               }

               $$3 = $$5.r();
            } else {
               if (!($$5.f() instanceof cqd $$6)) {
                  return crj.i;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.d() && !$$2.isEmpty() ? ctw.a($$3, $$2) : crj.i;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cvn<?> ap_() {
      return cvn.c;
   }
}
