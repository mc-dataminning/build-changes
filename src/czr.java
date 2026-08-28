import com.google.common.collect.Lists;
import java.util.List;

public class czr extends daa {
   public czr(czx $$0) {
      super($$0);
   }

   public boolean a(czy $$0, dev $$1) {
      cvx $$2 = cvx.k;
      List<cvx> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvx $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axi.bM)) {
               if (!$$2.f()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.h() instanceof cuv)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.f() && !$$3.isEmpty();
   }

   public cvx a(czy $$0, jr.a $$1) {
      List<cuv> $$2 = Lists.newArrayList();
      cvx $$3 = cvx.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvx $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axi.bM)) {
               if (!$$3.f()) {
                  return cvx.k;
               }

               $$3 = $$5.v();
            } else {
               if (!($$5.h() instanceof cuv $$6)) {
                  return cvx.k;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? cyj.a($$3, $$2) : cvx.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public dao<?> ar_() {
      return dao.c;
   }
}
