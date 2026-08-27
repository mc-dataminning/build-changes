import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class cmf extends clt {
   public cmf(aer $$0, clr $$1) {
      super($$0, $$1);
   }

   public boolean a(ces $$0, cpm $$1) {
      List<ciy> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         ciy $$4 = $$0.a($$3);
         if (!$$4.b()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               ciy $$5 = $$2.get(0);
               if (!$$4.a($$5.d()) || $$5.L() != 1 || $$4.L() != 1 || !$$5.d().o()) {
                  return false;
               }
            }
         }
      }

      return $$2.size() == 2;
   }

   public ciy a(ces $$0, hs $$1) {
      List<ciy> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         ciy $$4 = $$0.a($$3);
         if (!$$4.b()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               ciy $$5 = $$2.get(0);
               if (!$$4.a($$5.d()) || $$5.L() != 1 || $$4.L() != 1 || !$$5.d().o()) {
                  return ciy.b;
               }
            }
         }
      }

      if ($$2.size() == 2) {
         ciy $$6 = $$2.get(0);
         ciy $$7 = $$2.get(1);
         if ($$6.a($$7.d()) && $$6.L() == 1 && $$7.L() == 1 && $$6.d().o()) {
            cit $$8 = $$6.d();
            int $$9 = $$8.n() - $$6.k();
            int $$10 = $$8.n() - $$7.k();
            int $$11 = $$9 + $$10 + $$8.n() * 5 / 100;
            int $$12 = $$8.n() - $$11;
            if ($$12 < 0) {
               $$12 = 0;
            }

            ciy $$13 = new ciy($$6.d());
            $$13.b($$12);
            Map<cnf, Integer> $$14 = Maps.newHashMap();
            Map<cnf, Integer> $$15 = cnh.a($$6);
            Map<cnf, Integer> $$16 = cnh.a($$7);
            jb.g.s().filter(cnf::c).forEach($$3x -> {
               int $$4 = Math.max($$15.getOrDefault($$3x, 0), $$16.getOrDefault($$3x, 0));
               if ($$4 > 0) {
                  $$14.put($$3x, $$4);
               }
            });
            if (!$$14.isEmpty()) {
               cnh.a($$14, $$13);
            }

            return $$13;
         }
      }

      return ciy.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cmd<?> aj_() {
      return cmd.o;
   }
}
