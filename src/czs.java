import com.google.common.collect.Lists;
import java.util.List;

public class czs extends dab {
   public czs(czy $$0) {
      super($$0);
   }

   public boolean a(czz $$0, dej $$1) {
      cvs $$2 = cvs.k;
      List<cvs> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvs $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axe.bD)) {
               if (!$$2.f()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.h() instanceof cun)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.f() && !$$3.isEmpty();
   }

   public cvs a(czz $$0, jq.a $$1) {
      List<cun> $$2 = Lists.newArrayList();
      cvs $$3 = cvs.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvs $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(axe.bD)) {
               if (!$$3.f()) {
                  return cvs.k;
               }

               $$3 = $$5.u();
            } else {
               if (!($$5.h() instanceof cun $$6)) {
                  return cvs.k;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.f() && !$$2.isEmpty() ? cyk.a($$3, $$2) : cvs.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public dap<?> ar_() {
      return dap.c;
   }
}
