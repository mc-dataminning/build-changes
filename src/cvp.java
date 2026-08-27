import com.google.common.collect.Lists;
import java.util.List;

public class cvp extends cvb {
   public cvp(cuz $$0) {
      super($$0);
   }

   public boolean a(cnf $$0, cyx $$1) {
      List<crj> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         crj $$4 = $$0.a($$3);
         if (!$$4.d()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               crj $$5 = $$2.get(0);
               if (!$$4.a($$5.f()) || $$5.G() != 1 || $$4.G() != 1 || !$$5.f().s()) {
                  return false;
               }
            }
         }
      }

      return $$2.size() == 2;
   }

   public crj a(cnf $$0, iz $$1) {
      List<crj> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         crj $$4 = $$0.a($$3);
         if (!$$4.d()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               crj $$5 = $$2.get(0);
               if (!$$4.a($$5.f()) || $$5.G() != 1 || $$4.G() != 1 || !$$5.f().s()) {
                  return crj.i;
               }
            }
         }
      }

      if ($$2.size() == 2) {
         crj $$6 = $$2.get(0);
         crj $$7 = $$2.get(1);
         if ($$6.a($$7.f()) && $$6.G() == 1 && $$7.G() == 1 && $$6.f().s()) {
            cre $$8 = $$6.f();
            int $$9 = $$8.r() - $$6.m();
            int $$10 = $$8.r() - $$7.m();
            int $$11 = $$9 + $$10 + $$8.r() * 5 / 100;
            int $$12 = $$8.r() - $$11;
            if ($$12 < 0) {
               $$12 = 0;
            }

            crj $$13 = new crj($$6.f());
            $$13.b($$12);
            cwx $$14 = cwr.b($$6);
            cwx $$15 = cwr.b($$7);
            cwr.a($$13, $$3x -> $$1.d(ks.t).s().filter(cwq::c).forEach($$3xx -> {
                  int $$4 = Math.max($$14.a($$3xx), $$15.a($$3xx));
                  if ($$4 > 0) {
                     $$3.b($$3xx, $$4);
                  }
               }));
            return $$13;
         }
      }

      return crj.i;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cvn<?> ap_() {
      return cvn.o;
   }
}
