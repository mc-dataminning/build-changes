import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class cxs extends cxo {
   private static final cxt a = cxt.a(ctt.tX, ctt.pt, ctt.si, ctt.ul, ctt.um, ctt.up, ctt.un, ctt.uq, ctt.uo, ctt.ur);
   private static final cxt b = cxt.a(ctt.oy);
   private static final cxt c = cxt.a(ctt.qY);
   private static final Map<ctl, cwj.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ctt.tX, cwj.a.b);
      $$0.put(ctt.pt, cwj.a.e);
      $$0.put(ctt.si, cwj.a.c);
      $$0.put(ctt.ul, cwj.a.d);
      $$0.put(ctt.um, cwj.a.d);
      $$0.put(ctt.up, cwj.a.d);
      $$0.put(ctt.un, cwj.a.d);
      $$0.put(ctt.uq, cwj.a.d);
      $$0.put(ctt.uo, cwj.a.d);
      $$0.put(ctt.ur, cwj.a.d);
   });
   private static final cxt e = cxt.a(ctt.pu);

   public cxs(cxm $$0) {
      super($$0);
   }

   public boolean a(cpl $$0, daz $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         ctq $$8 = $$0.a($$7);
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
               if (!($$8.g() instanceof csk)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public ctq a(cpl $$0, iz.a $$1) {
      cwj.a $$2 = cwj.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         ctq $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if (a.a($$7)) {
               $$2 = d.get($$7.g());
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.g() instanceof csk) {
               $$5.add(((csk)$$7.g()).c().f());
            }
         }
      }

      ctq $$8 = new ctq(ctt.uv);
      $$8.b(kb.S, new cwj($$2, $$5, IntList.of(), $$4, $$3));
      return $$8;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public ctq a(iz.a $$0) {
      return new ctq(ctt.uv);
   }

   @Override
   public cya<?> ap_() {
      return cya.h;
   }
}
