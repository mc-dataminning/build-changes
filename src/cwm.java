import com.google.common.collect.Lists;
import java.util.List;

public class cwm extends cvy {
   public cwm(cvw $$0) {
      super($$0);
   }

   public boolean a(cnx $$0, czu $$1) {
      List<csd> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         csd $$4 = $$0.a($$3);
         if (!$$4.d()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               csd $$5 = $$2.get(0);
               if (!$$4.a($$5.f()) || $$5.G() != 1 || $$4.G() != 1 || !$$5.f().s()) {
                  return false;
               }
            }
         }
      }

      return $$2.size() == 2;
   }

   public csd a(cnx $$0, jj $$1) {
      List<csd> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         csd $$4 = $$0.a($$3);
         if (!$$4.d()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               csd $$5 = $$2.get(0);
               if (!$$4.a($$5.f()) || $$5.G() != 1 || $$4.G() != 1 || !$$5.f().s()) {
                  return csd.i;
               }
            }
         }
      }

      if ($$2.size() == 2) {
         csd $$6 = $$2.get(0);
         csd $$7 = $$2.get(1);
         if ($$6.a($$7.f()) && $$6.G() == 1 && $$7.G() == 1 && $$6.f().s()) {
            cry $$8 = $$6.f();
            int $$9 = $$8.r() - $$6.m();
            int $$10 = $$8.r() - $$7.m();
            int $$11 = $$9 + $$10 + $$8.r() * 5 / 100;
            int $$12 = $$8.r() - $$11;
            if ($$12 < 0) {
               $$12 = 0;
            }

            csd $$13 = new csd($$6.f());
            $$13.b($$12);
            cxu $$14 = cxo.b($$6);
            cxu $$15 = cxo.b($$7);
            cxo.a($$13, $$3x -> $$1.d(ld.u).s().filter(cxn::c).forEach($$3xx -> {
                  int $$4 = Math.max($$14.a($$3xx), $$15.a($$3xx));
                  if ($$4 > 0) {
                     $$3.b($$3xx, $$4);
                  }
               }));
            return $$13;
         }
      }

      return csd.i;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cwk<?> ao_() {
      return cwk.o;
   }
}
