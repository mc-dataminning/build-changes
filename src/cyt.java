import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class cyt extends cyp {
   private static final cyu a = cyu.a(cur.tX, cur.pt, cur.si, cur.ul, cur.um, cur.up, cur.un, cur.uq, cur.uo, cur.ur);
   private static final cyu b = cyu.a(cur.oz);
   private static final cyu c = cyu.a(cur.qY);
   private static final Map<cuj, cxj.a> d = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cur.tX, cxj.a.b);
      $$0.put(cur.pt, cxj.a.e);
      $$0.put(cur.si, cxj.a.c);
      $$0.put(cur.ul, cxj.a.d);
      $$0.put(cur.um, cxj.a.d);
      $$0.put(cur.up, cxj.a.d);
      $$0.put(cur.un, cxj.a.d);
      $$0.put(cur.uq, cxj.a.d);
      $$0.put(cur.uo, cxj.a.d);
      $$0.put(cur.ur, cxj.a.d);
   });
   private static final cyu e = cyu.a(cur.pu);

   public cyt(cym $$0) {
      super($$0);
   }

   public boolean a(cyn $$0, dcu $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
         cuo $$8 = $$0.a($$7);
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
               if (!($$8.g() instanceof cth)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cuo a(cyn $$0, jo.a $$1) {
      cxj.a $$2 = cxj.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cuo $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if (a.a($$7)) {
               $$2 = d.get($$7.g());
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.g() instanceof cth) {
               $$5.add(((cth)$$7.g()).c().f());
            }
         }
      }

      cuo $$8 = new cuo(cur.uv);
      $$8.b(kq.U, new cxj($$2, $$5, IntList.of(), $$4, $$3));
      return $$8;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cuo a(jo.a $$0) {
      return new cuo(cur.uv);
   }

   @Override
   public czc<?> ap_() {
      return czc.h;
   }
}
