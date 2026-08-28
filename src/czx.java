import com.google.common.collect.Lists;
import java.util.List;

public class czx extends dag {
   public czx(dad $$0) {
      super($$0);
   }

   public boolean a(dae $$0, dfb $$1) {
      cwb $$2 = cwb.k;
      List<cwb> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwb $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axj.bP)) {
               if (!$$2.f()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.h() instanceof cuz)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.f() && !$$3.isEmpty();
   }

   public cwb a(dae $$0, js.a $$1) {
      List<cuz> $$2 = Lists.newArrayList();
      cwb $$3 = cwb.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwb $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axj.bP)) {
               if (!$$3.f()) {
                  return cwb.k;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof cuz $$6)) {
                  return cwb.k;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? cyp.a($$3, $$2) : cwb.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public dau<?> aq_() {
      return dau.c;
   }
}
