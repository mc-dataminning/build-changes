import com.google.common.collect.Lists;
import java.util.List;

public class csx extends ctf {
   public csx(ctd $$0) {
      super($$0);
   }

   public boolean a(cme $$0, cwz $$1) {
      cqk $$2 = cqk.h;
      List<cqk> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqk $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(auv.ba)) {
               if (!$$2.b()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.d() instanceof cpc)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.b() && !$$3.isEmpty();
   }

   public cqk a(cme $$0, iz $$1) {
      List<cpc> $$2 = Lists.newArrayList();
      cqk $$3 = cqk.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqk $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(auv.ba)) {
               if (!$$3.b()) {
                  return cqk.h;
               }

               $$3 = $$5.q();
            } else {
               if (!($$5.d() instanceof cpc $$6)) {
                  return cqk.h;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.b() && !$$2.isEmpty() ? cpd.a($$3, $$2) : cqk.h;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public ctr<?> ar_() {
      return ctr.c;
   }
}
