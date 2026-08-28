import com.google.common.collect.Lists;
import java.util.List;

public class cya extends cyi {
   public cya(cyg $$0) {
      super($$0);
   }

   public boolean a(cqf $$0, dbt $$1) {
      cuk $$2 = cuk.l;
      List<cuk> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuk $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(awu.by)) {
               if (!$$2.e()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.g() instanceof cte)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.e() && !$$3.isEmpty();
   }

   public cuk a(cqf $$0, jk.a $$1) {
      List<cte> $$2 = Lists.newArrayList();
      cuk $$3 = cuk.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuk $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(awu.by)) {
               if (!$$3.e()) {
                  return cuk.l;
               }

               $$3 = $$5.s();
            } else {
               if (!($$5.g() instanceof cte $$6)) {
                  return cuk.l;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.e() && !$$2.isEmpty() ? cxc.a($$3, $$2) : cuk.l;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyu<?> ap_() {
      return cyu.c;
   }
}
