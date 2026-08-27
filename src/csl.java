import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class csl extends crx {
   public csl(crv $$0) {
      super($$0);
   }

   public boolean a(ckv $$0, cvr $$1) {
      List<cpd> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cpd $$4 = $$0.a($$3);
         if (!$$4.b()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               cpd $$5 = $$2.get(0);
               if (!$$4.a($$5.d()) || $$5.M() != 1 || $$4.M() != 1 || !$$5.d().n()) {
                  return false;
               }
            }
         }
      }

      return $$2.size() == 2;
   }

   public cpd a(ckv $$0, iw $$1) {
      List<cpd> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cpd $$4 = $$0.a($$3);
         if (!$$4.b()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               cpd $$5 = $$2.get(0);
               if (!$$4.a($$5.d()) || $$5.M() != 1 || $$4.M() != 1 || !$$5.d().n()) {
                  return cpd.h;
               }
            }
         }
      }

      if ($$2.size() == 2) {
         cpd $$6 = $$2.get(0);
         cpd $$7 = $$2.get(1);
         if ($$6.a($$7.d()) && $$6.M() == 1 && $$7.M() == 1 && $$6.d().n()) {
            coy $$8 = $$6.d();
            int $$9 = $$8.l() - $$6.l();
            int $$10 = $$8.l() - $$7.l();
            int $$11 = $$9 + $$10 + $$8.l() * 5 / 100;
            int $$12 = $$8.l() - $$11;
            if ($$12 < 0) {
               $$12 = 0;
            }

            cpd $$13 = new cpd($$6.d());
            $$13.b($$12);
            Map<ctm, Integer> $$14 = Maps.newHashMap();
            Map<ctm, Integer> $$15 = ctn.a($$6);
            Map<ctm, Integer> $$16 = ctn.a($$7);
            kf.f.s().filter(ctm::c).forEach($$3x -> {
               int $$4 = Math.max($$15.getOrDefault($$3x, 0), $$16.getOrDefault($$3x, 0));
               if ($$4 > 0) {
                  $$14.put($$3x, $$4);
               }
            });
            if (!$$14.isEmpty()) {
               ctn.a($$14, $$13);
            }

            return $$13;
         }
      }

      return cpd.h;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public csj<?> at_() {
      return csj.o;
   }
}
