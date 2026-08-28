import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class cye extends cya {
   private static final cyf a = cyf.a(cuf.tX, cuf.pt, cuf.si, cuf.ul, cuf.um, cuf.up, cuf.un, cuf.uq, cuf.uo, cuf.ur);
   private static final cyf b = cyf.a(cuf.oz);
   private static final cyf c = cyf.a(cuf.qY);
   private static final Map<ctx, cwu.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cuf.tX, cwu.a.b);
      $$0.put(cuf.pt, cwu.a.e);
      $$0.put(cuf.si, cwu.a.c);
      $$0.put(cuf.ul, cwu.a.d);
      $$0.put(cuf.um, cwu.a.d);
      $$0.put(cuf.up, cwu.a.d);
      $$0.put(cuf.un, cwu.a.d);
      $$0.put(cuf.uq, cwu.a.d);
      $$0.put(cuf.uo, cwu.a.d);
      $$0.put(cuf.ur, cwu.a.d);
   });
   private static final cyf e = cyf.a(cuf.pu);

   public cye(cxx $$0) {
      super($$0);
   }

   public boolean a(cxy $$0, dcf $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
         cuc $$8 = $$0.a($$7);
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
               if (!($$8.g() instanceof csw)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cuc a(cxy $$0, jl.a $$1) {
      cwu.a $$2 = cwu.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cuc $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if (a.a($$7)) {
               $$2 = d.get($$7.g());
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.g() instanceof csw) {
               $$5.add(((csw)$$7.g()).c().f());
            }
         }
      }

      cuc $$8 = new cuc(cuf.uv);
      $$8.b(kn.T, new cwu($$2, $$5, IntList.of(), $$4, $$3));
      return $$8;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cuc a(jl.a $$0) {
      return new cuc(cuf.uv);
   }

   @Override
   public cyn<?> ap_() {
      return cyn.h;
   }
}
