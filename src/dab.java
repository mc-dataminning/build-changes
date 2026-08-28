import com.google.common.collect.Lists;
import java.util.List;

public class dab extends dak {
   public dab(dah $$0) {
      super($$0);
   }

   public boolean a(dai $$0, dff $$1) {
      cwf $$2 = cwf.k;
      List<cwf> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwf $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axm.bQ)) {
               if (!$$2.f()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.h() instanceof cvd)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.f() && !$$3.isEmpty();
   }

   public cwf a(dai $$0, js.a $$1) {
      List<cvd> $$2 = Lists.newArrayList();
      cwf $$3 = cwf.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwf $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axm.bQ)) {
               if (!$$3.f()) {
                  return cwf.k;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof cvd $$6)) {
                  return cwf.k;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? cyt.a($$3, $$2) : cwf.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public day<?> aq_() {
      return day.c;
   }
}
