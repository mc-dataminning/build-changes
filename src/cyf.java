import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class cyf extends cyb {
   private static final cyg a = cyg.a(cug.tX, cug.pt, cug.si, cug.ul, cug.um, cug.up, cug.un, cug.uq, cug.uo, cug.ur);
   private static final cyg b = cyg.a(cug.oz);
   private static final cyg c = cyg.a(cug.qY);
   private static final Map<cty, cwv.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cug.tX, cwv.a.b);
      $$0.put(cug.pt, cwv.a.e);
      $$0.put(cug.si, cwv.a.c);
      $$0.put(cug.ul, cwv.a.d);
      $$0.put(cug.um, cwv.a.d);
      $$0.put(cug.up, cwv.a.d);
      $$0.put(cug.un, cwv.a.d);
      $$0.put(cug.uq, cwv.a.d);
      $$0.put(cug.uo, cwv.a.d);
      $$0.put(cug.ur, cwv.a.d);
   });
   private static final cyg e = cyg.a(cug.pu);

   public cyf(cxy $$0) {
      super($$0);
   }

   public boolean a(cxz $$0, dcg $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
         cud $$8 = $$0.a($$7);
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
               if (!($$8.g() instanceof csx)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cud a(cxz $$0, jl.a $$1) {
      cwv.a $$2 = cwv.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cud $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if (a.a($$7)) {
               $$2 = d.get($$7.g());
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.g() instanceof csx) {
               $$5.add(((csx)$$7.g()).c().f());
            }
         }
      }

      cud $$8 = new cud(cug.uv);
      $$8.b(kn.T, new cwv($$2, $$5, IntList.of(), $$4, $$3));
      return $$8;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cud a(jl.a $$0) {
      return new cud(cug.uv);
   }

   @Override
   public cyo<?> ap_() {
      return cyo.h;
   }
}
