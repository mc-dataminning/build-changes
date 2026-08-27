import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class cwc extends cvy {
   private static final cwd a = cwd.a(csg.tX, csg.pt, csg.si, csg.ul, csg.um, csg.up, csg.un, csg.uq, csg.uo, csg.ur);
   private static final cwd b = cwd.a(csg.oy);
   private static final cwd c = cwd.a(csg.qY);
   private static final Map<cry, cuu.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(csg.tX, cuu.a.b);
      $$0.put(csg.pt, cuu.a.e);
      $$0.put(csg.si, cuu.a.c);
      $$0.put(csg.ul, cuu.a.d);
      $$0.put(csg.um, cuu.a.d);
      $$0.put(csg.up, cuu.a.d);
      $$0.put(csg.un, cuu.a.d);
      $$0.put(csg.uq, cuu.a.d);
      $$0.put(csg.uo, cuu.a.d);
      $$0.put(csg.ur, cuu.a.d);
   });
   private static final cwd e = cwd.a(csg.pu);

   public cwc(cvw $$0) {
      super($$0);
   }

   public boolean a(cnx $$0, czu $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         csd $$8 = $$0.a($$7);
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
               if (!($$8.f() instanceof cqx)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public csd a(cnx $$0, jj $$1) {
      cuu.a $$2 = cuu.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         csd $$7 = $$0.a($$6);
         if (!$$7.d()) {
            if (a.a($$7)) {
               $$2 = d.get($$7.f());
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.f() instanceof cqx) {
               $$5.add(((cqx)$$7.f()).c().f());
            }
         }
      }

      csd $$8 = new csd(csg.uv);
      $$8.b(jz.J, new cuu($$2, $$5, IntList.of(), $$4, $$3));
      return $$8;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public csd a(jj $$0) {
      return new csd(csg.uv);
   }

   @Override
   public cwk<?> ao_() {
      return cwk.h;
   }
}
