import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class cyp extends cyl {
   private static final cyq a = cyq.a(cuq.tX, cuq.pt, cuq.si, cuq.ul, cuq.um, cuq.up, cuq.un, cuq.uq, cuq.uo, cuq.ur);
   private static final cyq b = cyq.a(cuq.oy);
   private static final cyq c = cyq.a(cuq.qY);
   private static final Map<cui, cxg.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cuq.tX, cxg.a.b);
      $$0.put(cuq.pt, cxg.a.e);
      $$0.put(cuq.si, cxg.a.c);
      $$0.put(cuq.ul, cxg.a.d);
      $$0.put(cuq.um, cxg.a.d);
      $$0.put(cuq.up, cxg.a.d);
      $$0.put(cuq.un, cxg.a.d);
      $$0.put(cuq.uq, cxg.a.d);
      $$0.put(cuq.uo, cxg.a.d);
      $$0.put(cuq.ur, cxg.a.d);
   });
   private static final cyq e = cyq.a(cuq.pu);

   public cyp(cyj $$0) {
      super($$0);
   }

   public boolean a(cqi $$0, dbw $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         cun $$8 = $$0.a($$7);
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

   public cun a(cqi $$0, jk.a $$1) {
      cxg.a $$2 = cxg.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cun $$7 = $$0.a($$6);
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

      cun $$8 = new cun(cuq.uv);
      $$8.b(km.S, new cxg($$2, $$5, IntList.of(), $$4, $$3));
      return $$8;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cun a(jk.a $$0) {
      return new cun(cuq.uv);
   }

   @Override
   public cyx<?> ap_() {
      return cyx.h;
   }
}
