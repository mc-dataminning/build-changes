import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class cyr extends cyn {
   private static final cys a = cys.a(cus.tX, cus.pt, cus.si, cus.ul, cus.um, cus.up, cus.un, cus.uq, cus.uo, cus.ur);
   private static final cys b = cys.a(cus.oy);
   private static final cys c = cys.a(cus.qY);
   private static final Map<cuk, cxi.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cus.tX, cxi.a.b);
      $$0.put(cus.pt, cxi.a.e);
      $$0.put(cus.si, cxi.a.c);
      $$0.put(cus.ul, cxi.a.d);
      $$0.put(cus.um, cxi.a.d);
      $$0.put(cus.up, cxi.a.d);
      $$0.put(cus.un, cxi.a.d);
      $$0.put(cus.uq, cxi.a.d);
      $$0.put(cus.uo, cxi.a.d);
      $$0.put(cus.ur, cxi.a.d);
   });
   private static final cys e = cys.a(cus.pu);

   public cyr(cyl $$0) {
      super($$0);
   }

   public boolean a(cqk $$0, dby $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         cup $$8 = $$0.a($$7);
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
               if (!($$8.g() instanceof ctj)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cup a(cqk $$0, jk.a $$1) {
      cxi.a $$2 = cxi.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cup $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if (a.a($$7)) {
               $$2 = d.get($$7.g());
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.g() instanceof ctj) {
               $$5.add(((ctj)$$7.g()).c().f());
            }
         }
      }

      cup $$8 = new cup(cus.uv);
      $$8.b(km.T, new cxi($$2, $$5, IntList.of(), $$4, $$3));
      return $$8;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cup a(jk.a $$0) {
      return new cup(cus.uv);
   }

   @Override
   public cyz<?> ao_() {
      return cyz.h;
   }
}
