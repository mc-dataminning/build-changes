import com.google.common.collect.Lists;
import java.util.List;

public class cyd extends cyl {
   public cyd(cyj $$0) {
      super($$0);
   }

   public boolean a(cqi $$0, dbw $$1) {
      cun $$2 = cun.l;
      List<cun> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cun $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(awx.by)) {
               if (!$$2.e()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.g() instanceof cth)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.e() && !$$3.isEmpty();
   }

   public cun a(cqi $$0, jk.a $$1) {
      List<cth> $$2 = Lists.newArrayList();
      cun $$3 = cun.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cun $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(awx.by)) {
               if (!$$3.e()) {
                  return cun.l;
               }

               $$3 = $$5.s();
            } else {
               if (!($$5.g() instanceof cth $$6)) {
                  return cun.l;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.e() && !$$2.isEmpty() ? cxf.a($$3, $$2) : cun.l;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyx<?> ap_() {
      return cyx.c;
   }
}
