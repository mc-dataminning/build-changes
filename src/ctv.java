import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;

public class ctv extends cth {
   public ctv(ctf $$0) {
      super($$0);
   }

   public boolean a(cmg $$0, cxb $$1) {
      List<cqm> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cqm $$4 = $$0.a($$3);
         if (!$$4.b()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               cqm $$5 = $$2.get(0);
               if (!$$4.a($$5.d()) || $$5.M() != 1 || $$4.M() != 1 || !$$5.d().p()) {
                  return false;
               }
            }
         }
      }

      return $$2.size() == 2;
   }

   public cqm a(cmg $$0, iz $$1) {
      List<cqm> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cqm $$4 = $$0.a($$3);
         if (!$$4.b()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               cqm $$5 = $$2.get(0);
               if (!$$4.a($$5.d()) || $$5.M() != 1 || $$4.M() != 1 || !$$5.d().p()) {
                  return cqm.h;
               }
            }
         }
      }

      if ($$2.size() == 2) {
         cqm $$6 = $$2.get(0);
         cqm $$7 = $$2.get(1);
         if ($$6.a($$7.d()) && $$6.M() == 1 && $$7.M() == 1 && $$6.d().p()) {
            cqh $$8 = $$6.d();
            int $$9 = $$8.o() - $$6.l();
            int $$10 = $$8.o() - $$7.l();
            int $$11 = $$9 + $$10 + $$8.o() * 5 / 100;
            int $$12 = $$8.o() - $$11;
            if ($$12 < 0) {
               $$12 = 0;
            }

            cqm $$13 = new cqm($$6.d());
            $$13.b($$12);
            Map<cuw, Integer> $$14 = cux.a($$6);
            Map<cuw, Integer> $$15 = cux.a($$7);
            ki.f.s().filter(cuw::c).forEach($$3x -> {
               int $$4 = Math.max($$14.getOrDefault($$3x, 0), $$15.getOrDefault($$3x, 0));
               if ($$4 > 0) {
                  $$13.a($$3x, $$4);
               }
            });
            return $$13;
         }
      }

      return cqm.h;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public ctt<?> ar_() {
      return ctt.o;
   }
}
