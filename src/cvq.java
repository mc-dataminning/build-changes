import com.google.common.collect.Lists;
import java.util.List;

public class cvq extends cvy {
   public cvq(cvw $$0) {
      super($$0);
   }

   public boolean a(cnx $$0, czu $$1) {
      csd $$2 = csd.i;
      List<csd> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csd $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(avw.ba)) {
               if (!$$2.d()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.f() instanceof cqx)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.d() && !$$3.isEmpty();
   }

   public csd a(cnx $$0, jj $$1) {
      List<cqx> $$2 = Lists.newArrayList();
      csd $$3 = csd.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csd $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(avw.ba)) {
               if (!$$3.d()) {
                  return csd.i;
               }

               $$3 = $$5.r();
            } else {
               if (!($$5.f() instanceof cqx $$6)) {
                  return csd.i;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.d() && !$$2.isEmpty() ? cut.a($$3, $$2) : csd.i;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cwk<?> ao_() {
      return cwk.c;
   }
}
