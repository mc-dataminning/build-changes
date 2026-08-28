import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class dac extends czy {
   private static final Map<cvk, cyi.a> a = Map.of(
      cvt.tY,
      cyi.a.b,
      cvt.pu,
      cyi.a.e,
      cvt.sj,
      cyi.a.c,
      cvt.un,
      cyi.a.d,
      cvt.uo,
      cyi.a.d,
      cvt.ur,
      cyi.a.d,
      cvt.up,
      cyi.a.d,
      cvt.us,
      cyi.a.d,
      cvt.uq,
      cyi.a.d,
      cvt.ut,
      cyi.a.d
   );
   private static final dad b = dad.a(cvt.oA);
   private static final dad c = dad.a(cvt.qZ);
   private static final dad d = dad.a(cvt.pv);

   public dac(czv $$0) {
      super($$0);
   }

   public boolean a(czw $$0, deg $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
         cvp $$8 = $$0.a($$7);
         if (!$$8.f()) {
            if (a.containsKey($$8.h())) {
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
            } else if (d.a($$8)) {
               if ($$2) {
                  return false;
               }

               $$2 = true;
            } else {
               if (!($$8.h() instanceof cuk)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cvp a(czw $$0, jp.a $$1) {
      cyi.a $$2 = cyi.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cvp $$7 = $$0.a($$6);
         if (!$$7.f()) {
            cyi.a $$8 = a.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cuk) {
               $$5.add(((cuk)$$7.h()).c().f());
            }
         }
      }

      cvp $$9 = new cvp(cvt.ux);
      $$9.b(kr.Z, new cyi($$2, $$5, IntList.of(), $$4, $$3));
      return $$9;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cvp a(jp.a $$0) {
      return new cvp(cvt.ux);
   }

   @Override
   public dam<?> aq_() {
      return dam.h;
   }
}
