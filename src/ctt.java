import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;

public class ctt extends ctf {
   public ctt(ctd $$0) {
      super($$0);
   }

   public boolean a(cme $$0, cwz $$1) {
      List<cqk> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cqk $$4 = $$0.a($$3);
         if (!$$4.b()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               cqk $$5 = $$2.get(0);
               if (!$$4.a($$5.d()) || $$5.M() != 1 || $$4.M() != 1 || !$$5.d().p()) {
                  return false;
               }
            }
         }
      }

      return $$2.size() == 2;
   }

   public cqk a(cme $$0, iz $$1) {
      List<cqk> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cqk $$4 = $$0.a($$3);
         if (!$$4.b()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               cqk $$5 = $$2.get(0);
               if (!$$4.a($$5.d()) || $$5.M() != 1 || $$4.M() != 1 || !$$5.d().p()) {
                  return cqk.h;
               }
            }
         }
      }

      if ($$2.size() == 2) {
         cqk $$6 = $$2.get(0);
         cqk $$7 = $$2.get(1);
         if ($$6.a($$7.d()) && $$6.M() == 1 && $$7.M() == 1 && $$6.d().p()) {
            cqf $$8 = $$6.d();
            int $$9 = $$8.o() - $$6.l();
            int $$10 = $$8.o() - $$7.l();
            int $$11 = $$9 + $$10 + $$8.o() * 5 / 100;
            int $$12 = $$8.o() - $$11;
            if ($$12 < 0) {
               $$12 = 0;
            }

            cqk $$13 = new cqk($$6.d());
            $$13.b($$12);
            Map<cuu, Integer> $$14 = cuv.a($$6);
            Map<cuu, Integer> $$15 = cuv.a($$7);
            ki.f.s().filter(cuu::c).forEach($$3x -> {
               int $$4 = Math.max($$14.getOrDefault($$3x, 0), $$15.getOrDefault($$3x, 0));
               if ($$4 > 0) {
                  $$13.a($$3x, $$4);
               }
            });
            return $$13;
         }
      }

      return cqk.h;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public ctr<?> ar_() {
      return ctr.o;
   }
}
