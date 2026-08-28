import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class cys extends cyo {
   private static final cyt a = cyt.a(cut.tX, cut.pt, cut.si, cut.ul, cut.um, cut.up, cut.un, cut.uq, cut.uo, cut.ur);
   private static final cyt b = cyt.a(cut.oy);
   private static final cyt c = cyt.a(cut.qY);
   private static final Map<cul, cxj.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cut.tX, cxj.a.b);
      $$0.put(cut.pt, cxj.a.e);
      $$0.put(cut.si, cxj.a.c);
      $$0.put(cut.ul, cxj.a.d);
      $$0.put(cut.um, cxj.a.d);
      $$0.put(cut.up, cxj.a.d);
      $$0.put(cut.un, cxj.a.d);
      $$0.put(cut.uq, cxj.a.d);
      $$0.put(cut.uo, cxj.a.d);
      $$0.put(cut.ur, cxj.a.d);
   });
   private static final cyt e = cyt.a(cut.pu);

   public cys(cym $$0) {
      super($$0);
   }

   public boolean a(cql $$0, dbz $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         cuq $$8 = $$0.a($$7);
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
               if (!($$8.g() instanceof ctk)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cuq a(cql $$0, jk.a $$1) {
      cxj.a $$2 = cxj.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cuq $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if (a.a($$7)) {
               $$2 = d.get($$7.g());
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.g() instanceof ctk) {
               $$5.add(((ctk)$$7.g()).c().f());
            }
         }
      }

      cuq $$8 = new cuq(cut.uv);
      $$8.b(km.T, new cxj($$2, $$5, IntList.of(), $$4, $$3));
      return $$8;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cuq a(jk.a $$0) {
      return new cuq(cut.uv);
   }

   @Override
   public cza<?> ao_() {
      return cza.h;
   }
}
