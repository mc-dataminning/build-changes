import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class cvf extends cvb {
   private static final cvg a = cvg.a(crm.tW, crm.ps, crm.sh, crm.uj, crm.uk, crm.un, crm.ul, crm.uo, crm.um, crm.up);
   private static final cvg b = cvg.a(crm.ox);
   private static final cvg c = cvg.a(crm.qX);
   private static final Map<cre, ctx.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(crm.tW, ctx.a.b);
      $$0.put(crm.ps, ctx.a.e);
      $$0.put(crm.sh, ctx.a.c);
      $$0.put(crm.uj, ctx.a.d);
      $$0.put(crm.uk, ctx.a.d);
      $$0.put(crm.un, ctx.a.d);
      $$0.put(crm.ul, ctx.a.d);
      $$0.put(crm.uo, ctx.a.d);
      $$0.put(crm.um, ctx.a.d);
      $$0.put(crm.up, ctx.a.d);
   });
   private static final cvg e = cvg.a(crm.pt);

   public cvf(cuz $$0) {
      super($$0);
   }

   public boolean a(cnf $$0, cyx $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         crj $$8 = $$0.a($$7);
         if (!$$8.d()) {
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
               if (!($$8.f() instanceof cqd)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public crj a(cnf $$0, iz $$1) {
      ctx.a $$2 = ctx.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         crj $$7 = $$0.a($$6);
         if (!$$7.d()) {
            if (a.a($$7)) {
               $$2 = d.get($$7.f());
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.f() instanceof cqd) {
               $$5.add(((cqd)$$7.f()).c().f());
            }
         }
      }

      crj $$8 = new crj(crm.ut);
      $$8.b(jp.J, new ctx($$2, $$5, IntList.of(), $$4, $$3));
      return $$8;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public crj a(iz $$0) {
      return new crj(crm.ut);
   }

   @Override
   public cvn<?> ap_() {
      return cvn.h;
   }
}
