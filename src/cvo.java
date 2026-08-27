import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class cvo extends cvk {
   private static final cvp a = cvp.a(crv.tW, crv.ps, crv.sh, crv.uj, crv.uk, crv.un, crv.ul, crv.uo, crv.um, crv.up);
   private static final cvp b = cvp.a(crv.ox);
   private static final cvp c = cvp.a(crv.qX);
   private static final Map<crn, cug.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(crv.tW, cug.a.b);
      $$0.put(crv.ps, cug.a.e);
      $$0.put(crv.sh, cug.a.c);
      $$0.put(crv.uj, cug.a.d);
      $$0.put(crv.uk, cug.a.d);
      $$0.put(crv.un, cug.a.d);
      $$0.put(crv.ul, cug.a.d);
      $$0.put(crv.uo, cug.a.d);
      $$0.put(crv.um, cug.a.d);
      $$0.put(crv.up, cug.a.d);
   });
   private static final cvp e = cvp.a(crv.pt);

   public cvo(cvi $$0) {
      super($$0);
   }

   public boolean a(cnm $$0, czg $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         crs $$8 = $$0.a($$7);
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
               if (!($$8.f() instanceof cqm)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public crs a(cnm $$0, jb $$1) {
      cug.a $$2 = cug.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         crs $$7 = $$0.a($$6);
         if (!$$7.d()) {
            if (a.a($$7)) {
               $$2 = d.get($$7.f());
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.f() instanceof cqm) {
               $$5.add(((cqm)$$7.f()).c().f());
            }
         }
      }

      crs $$8 = new crs(crv.ut);
      $$8.b(jr.J, new cug($$2, $$5, IntList.of(), $$4, $$3));
      return $$8;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public crs a(jb $$0) {
      return new crs(crv.ut);
   }

   @Override
   public cvw<?> ao_() {
      return cvw.h;
   }
}
