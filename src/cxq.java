import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class cxq extends cxm {
   private static final cxr a = cxr.a(ctr.tX, ctr.pt, ctr.si, ctr.ul, ctr.um, ctr.up, ctr.un, ctr.uq, ctr.uo, ctr.ur);
   private static final cxr b = cxr.a(ctr.oy);
   private static final cxr c = cxr.a(ctr.qY);
   private static final Map<ctj, cwh.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ctr.tX, cwh.a.b);
      $$0.put(ctr.pt, cwh.a.e);
      $$0.put(ctr.si, cwh.a.c);
      $$0.put(ctr.ul, cwh.a.d);
      $$0.put(ctr.um, cwh.a.d);
      $$0.put(ctr.up, cwh.a.d);
      $$0.put(ctr.un, cwh.a.d);
      $$0.put(ctr.uq, cwh.a.d);
      $$0.put(ctr.uo, cwh.a.d);
      $$0.put(ctr.ur, cwh.a.d);
   });
   private static final cxr e = cxr.a(ctr.pu);

   public cxq(cxk $$0) {
      super($$0);
   }

   public boolean a(cpj $$0, dax $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         cto $$8 = $$0.a($$7);
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
               if (!($$8.g() instanceof csi)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cto a(cpj $$0, iz.a $$1) {
      cwh.a $$2 = cwh.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cto $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if (a.a($$7)) {
               $$2 = d.get($$7.g());
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.g() instanceof csi) {
               $$5.add(((csi)$$7.g()).c().f());
            }
         }
      }

      cto $$8 = new cto(ctr.uv);
      $$8.b(kb.S, new cwh($$2, $$5, IntList.of(), $$4, $$3));
      return $$8;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cto a(iz.a $$0) {
      return new cto(ctr.uv);
   }

   @Override
   public cxy<?> ao_() {
      return cxy.h;
   }
}
