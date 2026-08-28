import com.google.common.collect.Lists;
import java.util.List;

public class czp extends czy {
   public czp(czv $$0) {
      super($$0);
   }

   public boolean a(czw $$0, deg $$1) {
      cvp $$2 = cvp.k;
      List<cvp> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvp $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axc.bD)) {
               if (!$$2.f()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.h() instanceof cuk)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.f() && !$$3.isEmpty();
   }

   public cvp a(czw $$0, jp.a $$1) {
      List<cuk> $$2 = Lists.newArrayList();
      cvp $$3 = cvp.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvp $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axc.bD)) {
               if (!$$3.f()) {
                  return cvp.k;
               }

               $$3 = $$5.u();
            } else {
               if (!($$5.h() instanceof cuk $$6)) {
                  return cvp.k;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? cyh.a($$3, $$2) : cvp.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public dam<?> aq_() {
      return dam.c;
   }
}
