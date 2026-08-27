import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class coz extends cok {
   public coz(coh $$0) {
      super($$0);
   }

   public boolean a(chh $$0, csf $$1) {
      List<clo> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         clo $$4 = $$0.a($$3);
         if (!$$4.b()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               clo $$5 = $$2.get(0);
               if (!$$4.a($$5.d()) || $$5.L() != 1 || $$4.L() != 1 || !$$5.d().o()) {
                  return false;
               }
            }
         }
      }

      return $$2.size() == 2;
   }

   public clo a(chh $$0, it $$1) {
      List<clo> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         clo $$4 = $$0.a($$3);
         if (!$$4.b()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               clo $$5 = $$2.get(0);
               if (!$$4.a($$5.d()) || $$5.L() != 1 || $$4.L() != 1 || !$$5.d().o()) {
                  return clo.b;
               }
            }
         }
      }

      if ($$2.size() == 2) {
         clo $$6 = $$2.get(0);
         clo $$7 = $$2.get(1);
         if ($$6.a($$7.d()) && $$6.L() == 1 && $$7.L() == 1 && $$6.d().o()) {
            clj $$8 = $$6.d();
            int $$9 = $$8.n() - $$6.k();
            int $$10 = $$8.n() - $$7.k();
            int $$11 = $$9 + $$10 + $$8.n() * 5 / 100;
            int $$12 = $$8.n() - $$11;
            if ($$12 < 0) {
               $$12 = 0;
            }

            clo $$13 = new clo($$6.d());
            $$13.b($$12);
            Map<cpz, Integer> $$14 = Maps.newHashMap();
            Map<cpz, Integer> $$15 = cqb.a($$6);
            Map<cpz, Integer> $$16 = cqb.a($$7);
            kc.g.s().filter(cpz::c).forEach($$3x -> {
               int $$4 = Math.max($$15.getOrDefault($$3x, 0), $$16.getOrDefault($$3x, 0));
               if ($$4 > 0) {
                  $$14.put($$3x, $$4);
               }
            });
            if (!$$14.isEmpty()) {
               cqb.a($$14, $$13);
            }

            return $$13;
         }
      }

      return clo.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cox<?> as_() {
      return cox.o;
   }
}
