import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class cym extends cyi {
   private static final cyn a = cyn.a(cun.tX, cun.pt, cun.si, cun.ul, cun.um, cun.up, cun.un, cun.uq, cun.uo, cun.ur);
   private static final cyn b = cyn.a(cun.oy);
   private static final cyn c = cyn.a(cun.qY);
   private static final Map<cuf, cxd.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cun.tX, cxd.a.b);
      $$0.put(cun.pt, cxd.a.e);
      $$0.put(cun.si, cxd.a.c);
      $$0.put(cun.ul, cxd.a.d);
      $$0.put(cun.um, cxd.a.d);
      $$0.put(cun.up, cxd.a.d);
      $$0.put(cun.un, cxd.a.d);
      $$0.put(cun.uq, cxd.a.d);
      $$0.put(cun.uo, cxd.a.d);
      $$0.put(cun.ur, cxd.a.d);
   });
   private static final cyn e = cyn.a(cun.pu);

   public cym(cyg $$0) {
      super($$0);
   }

   public boolean a(cqf $$0, dbt $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         cuk $$8 = $$0.a($$7);
         if (!$$8.e()) {
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
               if (!($$8.g() instanceof cte)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cuk a(cqf $$0, jk.a $$1) {
      cxd.a $$2 = cxd.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cuk $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if (a.a($$7)) {
               $$2 = d.get($$7.g());
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.g() instanceof cte) {
               $$5.add(((cte)$$7.g()).c().f());
            }
         }
      }

      cuk $$8 = new cuk(cun.uv);
      $$8.b(km.S, new cxd($$2, $$5, IntList.of(), $$4, $$3));
      return $$8;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cuk a(jk.a $$0) {
      return new cuk(cun.uv);
   }

   @Override
   public cyu<?> ap_() {
      return cyu.h;
   }
}
