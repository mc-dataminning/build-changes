import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class cyu extends cyq {
   private static final cyv a = cyv.a(cuk.vz, cuk.qM, cuk.tF, cuk.vW, cuk.vX, cuk.wa, cuk.vY, cuk.wb, cuk.vZ, cuk.wc);
   private static final cyv b = cyv.a(cuk.pO);
   private static final cyv c = cyv.a(cuk.sv);
   private static final Map<cuc, cxj.a> d = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cuk.vz, cxj.a.b);
      $$0.put(cuk.qM, cxj.a.e);
      $$0.put(cuk.tF, cxj.a.c);
      $$0.put(cuk.vW, cxj.a.d);
      $$0.put(cuk.vX, cxj.a.d);
      $$0.put(cuk.wa, cxj.a.d);
      $$0.put(cuk.vY, cxj.a.d);
      $$0.put(cuk.wb, cxj.a.d);
      $$0.put(cuk.vZ, cxj.a.d);
      $$0.put(cuk.wc, cxj.a.d);
   });
   private static final cyv e = cyv.a(cuk.qN);

   public cyu(cyo $$0) {
      super($$0);
   }

   public boolean a(cpw $$0, dca $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         cuh $$8 = $$0.a($$7);
         if (!$$8.d()) {
            if (a.a($$8)) {
               if ($$4) {
                  return false;
               }

               $$4 = true;
            } else if (c.a($$8)) {
               if ($$6) {
                  return false;
               }

               $$6 = true;
            } else if (b.a($$8)) {
               if ($$5) {
                  return false;
               }

               $$5 = true;
            } else if (e.a($$8)) {
               if ($$2) {
                  return false;
               }

               $$2 = true;
            } else {
               if (!($$8.f() instanceof csz)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cuh a(cpw $$0, jc.a $$1) {
      cxj.a $$2 = cxj.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cuh $$7 = $$0.a($$6);
         if (!$$7.d()) {
            if (a.a($$7)) {
               $$2 = d.get($$7.f());
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.f() instanceof csz) {
               $$5.add(((csz)$$7.f()).c().f());
            }
         }
      }

      cuh $$8 = new cuh(cuk.wg);
      $$8.b(ke.S, new cxj($$2, $$5, IntList.of(), $$4, $$3));
      return $$8;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cuh a(jc.a $$0) {
      return new cuh(cuk.wg);
   }

   @Override
   public cze<?> ao_() {
      return cze.i;
   }
}
