import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class cmd extends clr {
   public cmd(aep $$0, clp $$1) {
      super($$0, $$1);
   }

   public boolean a(ceq $$0, cpk $$1) {
      List<ciw> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         ciw $$4 = $$0.a($$3);
         if (!$$4.b()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               ciw $$5 = $$2.get(0);
               if (!$$4.a($$5.d()) || $$5.L() != 1 || $$4.L() != 1 || !$$5.d().o()) {
                  return false;
               }
            }
         }
      }

      return $$2.size() == 2;
   }

   public ciw a(ceq $$0, ht $$1) {
      List<ciw> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         ciw $$4 = $$0.a($$3);
         if (!$$4.b()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               ciw $$5 = $$2.get(0);
               if (!$$4.a($$5.d()) || $$5.L() != 1 || $$4.L() != 1 || !$$5.d().o()) {
                  return ciw.b;
               }
            }
         }
      }

      if ($$2.size() == 2) {
         ciw $$6 = $$2.get(0);
         ciw $$7 = $$2.get(1);
         if ($$6.a($$7.d()) && $$6.L() == 1 && $$7.L() == 1 && $$6.d().o()) {
            cir $$8 = $$6.d();
            int $$9 = $$8.n() - $$6.k();
            int $$10 = $$8.n() - $$7.k();
            int $$11 = $$9 + $$10 + $$8.n() * 5 / 100;
            int $$12 = $$8.n() - $$11;
            if ($$12 < 0) {
               $$12 = 0;
            }

            ciw $$13 = new ciw($$6.d());
            $$13.b($$12);
            Map<cnd, Integer> $$14 = Maps.newHashMap();
            Map<cnd, Integer> $$15 = cnf.a($$6);
            Map<cnd, Integer> $$16 = cnf.a($$7);
            jc.g.s().filter(cnd::c).forEach($$3x -> {
               int $$4 = Math.max($$15.getOrDefault($$3x, 0), $$16.getOrDefault($$3x, 0));
               if ($$4 > 0) {
                  $$14.put($$3x, $$4);
               }
            });
            if (!$$14.isEmpty()) {
               cnf.a($$14, $$13);
            }

            return $$13;
         }
      }

      return ciw.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cmb<?> aj_() {
      return cmb.o;
   }
}
