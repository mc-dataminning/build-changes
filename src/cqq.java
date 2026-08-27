import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class cqq extends cqc {
   public cqq(cqa $$0) {
      super($$0);
   }

   public boolean a(ciz $$0, ctx $$1) {
      List<cng> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cng $$4 = $$0.a($$3);
         if (!$$4.b()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               cng $$5 = $$2.get(0);
               if (!$$4.a($$5.d()) || $$5.L() != 1 || $$4.L() != 1 || !$$5.d().n()) {
                  return false;
               }
            }
         }
      }

      return $$2.size() == 2;
   }

   public cng a(ciz $$0, iu $$1) {
      List<cng> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cng $$4 = $$0.a($$3);
         if (!$$4.b()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               cng $$5 = $$2.get(0);
               if (!$$4.a($$5.d()) || $$5.L() != 1 || $$4.L() != 1 || !$$5.d().n()) {
                  return cng.f;
               }
            }
         }
      }

      if ($$2.size() == 2) {
         cng $$6 = $$2.get(0);
         cng $$7 = $$2.get(1);
         if ($$6.a($$7.d()) && $$6.L() == 1 && $$7.L() == 1 && $$6.d().n()) {
            cnb $$8 = $$6.d();
            int $$9 = $$8.l() - $$6.k();
            int $$10 = $$8.l() - $$7.k();
            int $$11 = $$9 + $$10 + $$8.l() * 5 / 100;
            int $$12 = $$8.l() - $$11;
            if ($$12 < 0) {
               $$12 = 0;
            }

            cng $$13 = new cng($$6.d());
            $$13.b($$12);
            Map<crr, Integer> $$14 = Maps.newHashMap();
            Map<crr, Integer> $$15 = crt.a($$6);
            Map<crr, Integer> $$16 = crt.a($$7);
            kd.f.s().filter(crr::c).forEach($$3x -> {
               int $$4 = Math.max($$15.getOrDefault($$3x, 0), $$16.getOrDefault($$3x, 0));
               if ($$4 > 0) {
                  $$14.put($$3x, $$4);
               }
            });
            if (!$$14.isEmpty()) {
               crt.a($$14, $$13);
            }

            return $$13;
         }
      }

      return cng.f;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cqo<?> at_() {
      return cqo.o;
   }
}
