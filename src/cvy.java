import com.google.common.collect.Lists;
import java.util.List;

public class cvy extends cvk {
   public cvy(cvi $$0) {
      super($$0);
   }

   public boolean a(cnm $$0, czg $$1) {
      List<crs> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         crs $$4 = $$0.a($$3);
         if (!$$4.d()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               crs $$5 = $$2.get(0);
               if (!$$4.a($$5.f()) || $$5.G() != 1 || $$4.G() != 1 || !$$5.f().s()) {
                  return false;
               }
            }
         }
      }

      return $$2.size() == 2;
   }

   public crs a(cnm $$0, jb $$1) {
      List<crs> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         crs $$4 = $$0.a($$3);
         if (!$$4.d()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               crs $$5 = $$2.get(0);
               if (!$$4.a($$5.f()) || $$5.G() != 1 || $$4.G() != 1 || !$$5.f().s()) {
                  return crs.i;
               }
            }
         }
      }

      if ($$2.size() == 2) {
         crs $$6 = $$2.get(0);
         crs $$7 = $$2.get(1);
         if ($$6.a($$7.f()) && $$6.G() == 1 && $$7.G() == 1 && $$6.f().s()) {
            crn $$8 = $$6.f();
            int $$9 = $$8.r() - $$6.m();
            int $$10 = $$8.r() - $$7.m();
            int $$11 = $$9 + $$10 + $$8.r() * 5 / 100;
            int $$12 = $$8.r() - $$11;
            if ($$12 < 0) {
               $$12 = 0;
            }

            crs $$13 = new crs($$6.f());
            $$13.b($$12);
            cxg $$14 = cxa.b($$6);
            cxg $$15 = cxa.b($$7);
            cxa.a($$13, $$3x -> $$1.d(ku.u).s().filter(cwz::c).forEach($$3xx -> {
                  int $$4 = Math.max($$14.a($$3xx), $$15.a($$3xx));
                  if ($$4 > 0) {
                     $$3.b($$3xx, $$4);
                  }
               }));
            return $$13;
         }
      }

      return crs.i;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cvw<?> ao_() {
      return cvw.o;
   }
}
