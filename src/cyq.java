import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class cyq extends cym {
   private static final cyr a = cyr.a(cur.tX, cur.pt, cur.si, cur.ul, cur.um, cur.up, cur.un, cur.uq, cur.uo, cur.ur);
   private static final cyr b = cyr.a(cur.oy);
   private static final cyr c = cyr.a(cur.qY);
   private static final Map<cuj, cxh.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cur.tX, cxh.a.b);
      $$0.put(cur.pt, cxh.a.e);
      $$0.put(cur.si, cxh.a.c);
      $$0.put(cur.ul, cxh.a.d);
      $$0.put(cur.um, cxh.a.d);
      $$0.put(cur.up, cxh.a.d);
      $$0.put(cur.un, cxh.a.d);
      $$0.put(cur.uq, cxh.a.d);
      $$0.put(cur.uo, cxh.a.d);
      $$0.put(cur.ur, cxh.a.d);
   });
   private static final cyr e = cyr.a(cur.pu);

   public cyq(cyk $$0) {
      super($$0);
   }

   public boolean a(cqj $$0, dbx $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
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
               if (!($$8.g() instanceof cti)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cuo a(cqj $$0, jk.a $$1) {
      cxh.a $$2 = cxh.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cuo $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if (a.a($$7)) {
               $$2 = d.get($$7.g());
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.g() instanceof cti) {
               $$5.add(((cti)$$7.g()).c().f());
            }
         }
      }

      cuo $$8 = new cuo(cur.uv);
      $$8.b(km.T, new cxh($$2, $$5, IntList.of(), $$4, $$3));
      return $$8;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cuo a(jk.a $$0) {
      return new cuo(cur.uv);
   }

   @Override
   public cyy<?> ao_() {
      return cyy.h;
   }
}
