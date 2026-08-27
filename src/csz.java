import com.google.common.collect.Lists;
import java.util.List;

public class csz extends cth {
   public csz(ctf $$0) {
      super($$0);
   }

   public boolean a(cmg $$0, cxb $$1) {
      cqm $$2 = cqm.h;
      List<cqm> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqm $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(auv.ba)) {
               if (!$$2.b()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.d() instanceof cpe)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.b() && !$$3.isEmpty();
   }

   public cqm a(cmg $$0, iz $$1) {
      List<cpe> $$2 = Lists.newArrayList();
      cqm $$3 = cqm.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqm $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(auv.ba)) {
               if (!$$3.b()) {
                  return cqm.h;
               }

               $$3 = $$5.q();
            } else {
               if (!($$5.d() instanceof cpe $$6)) {
                  return cqm.h;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.b() && !$$2.isEmpty() ? cpf.a($$3, $$2) : cqm.h;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public ctt<?> ar_() {
      return ctt.c;
   }
}
