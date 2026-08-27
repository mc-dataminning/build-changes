import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class cqh extends cpt {
   public cqh(cpr $$0) {
      super($$0);
   }

   public boolean a(ciq $$0, cto $$1) {
      List<cmx> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cmx $$4 = $$0.a($$3);
         if (!$$4.b()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               cmx $$5 = $$2.get(0);
               if (!$$4.a($$5.d()) || $$5.L() != 1 || $$4.L() != 1 || !$$5.d().o()) {
                  return false;
               }
            }
         }
      }

      return $$2.size() == 2;
   }

   public cmx a(ciq $$0, iu $$1) {
      List<cmx> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cmx $$4 = $$0.a($$3);
         if (!$$4.b()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               cmx $$5 = $$2.get(0);
               if (!$$4.a($$5.d()) || $$5.L() != 1 || $$4.L() != 1 || !$$5.d().o()) {
                  return cmx.f;
               }
            }
         }
      }

      if ($$2.size() == 2) {
         cmx $$6 = $$2.get(0);
         cmx $$7 = $$2.get(1);
         if ($$6.a($$7.d()) && $$6.L() == 1 && $$7.L() == 1 && $$6.d().o()) {
            cms $$8 = $$6.d();
            int $$9 = $$8.n() - $$6.k();
            int $$10 = $$8.n() - $$7.k();
            int $$11 = $$9 + $$10 + $$8.n() * 5 / 100;
            int $$12 = $$8.n() - $$11;
            if ($$12 < 0) {
               $$12 = 0;
            }

            cmx $$13 = new cmx($$6.d());
            $$13.b($$12);
            Map<cri, Integer> $$14 = Maps.newHashMap();
            Map<cri, Integer> $$15 = crk.a($$6);
            Map<cri, Integer> $$16 = crk.a($$7);
            kd.f.s().filter(cri::c).forEach($$3x -> {
               int $$4 = Math.max($$15.getOrDefault($$3x, 0), $$16.getOrDefault($$3x, 0));
               if ($$4 > 0) {
                  $$14.put($$3x, $$4);
               }
            });
            if (!$$14.isEmpty()) {
               crk.a($$14, $$13);
            }

            return $$13;
         }
      }

      return cmx.f;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cqf<?> ar_() {
      return cqf.o;
   }
}
