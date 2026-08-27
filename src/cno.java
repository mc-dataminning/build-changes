import com.google.common.collect.Lists;
import java.util.List;

public class cno extends cnx {
   public cno(cnu $$0) {
      super($$0);
   }

   public boolean a(cgu $$0, crs $$1) {
      clb $$2 = clb.b;
      List<clb> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clb $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cjt) {
               if (!$$2.b()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.d() instanceof cjq)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.b() && !$$3.isEmpty();
   }

   public clb a(cgu $$0, ip $$1) {
      List<cjq> $$2 = Lists.newArrayList();
      clb $$3 = clb.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clb $$5 = $$0.a($$4);
         if (!$$5.b()) {
            ckw $$6 = $$5.d();
            if ($$6 instanceof cjt) {
               if (!$$3.b()) {
                  return clb.b;
               }

               $$3 = $$5.p();
            } else {
               if (!($$6 instanceof cjq)) {
                  return clb.b;
               }

               $$2.add((cjq)$$6);
            }
         }
      }

      return !$$3.b() && !$$2.isEmpty() ? cjt.a($$3, $$2) : clb.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public coj<?> aq_() {
      return coj.c;
   }
}
