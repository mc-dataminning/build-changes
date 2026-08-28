import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class cyv extends cyr {
   private static final cyw a = cyw.a(cut.tX, cut.pt, cut.si, cut.ul, cut.um, cut.up, cut.un, cut.uq, cut.uo, cut.ur);
   private static final cyw b = cyw.a(cut.oz);
   private static final cyw c = cyw.a(cut.qY);
   private static final Map<cul, cxl.a> d = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cut.tX, cxl.a.b);
      $$0.put(cut.pt, cxl.a.e);
      $$0.put(cut.si, cxl.a.c);
      $$0.put(cut.ul, cxl.a.d);
      $$0.put(cut.um, cxl.a.d);
      $$0.put(cut.up, cxl.a.d);
      $$0.put(cut.un, cxl.a.d);
      $$0.put(cut.uq, cxl.a.d);
      $$0.put(cut.uo, cxl.a.d);
      $$0.put(cut.ur, cxl.a.d);
   });
   private static final cyw e = cyw.a(cut.pu);

   public cyv(cyo $$0) {
      super($$0);
   }

   public boolean a(cyp $$0, dcw $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
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
               if (!($$8.g() instanceof ctj)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cuq a(cyp $$0, jo.a $$1) {
      cxl.a $$2 = cxl.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cuq $$7 = $$0.a($$6);
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

      cuq $$8 = new cuq(cut.uv);
      $$8.b(kq.U, new cxl($$2, $$5, IntList.of(), $$4, $$3));
      return $$8;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cuq a(jo.a $$0) {
      return new cuq(cut.uv);
   }

   @Override
   public cze<?> at_() {
      return cze.h;
   }
}
