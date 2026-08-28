import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class dao extends dak {
   private static final Map<cwb, cyu.a> a = Map.of(
      cwj.uo,
      cyu.a.b,
      cwj.pu,
      cyu.a.e,
      cwj.sz,
      cyu.a.c,
      cwj.uD,
      cyu.a.d,
      cwj.uE,
      cyu.a.d,
      cwj.uH,
      cyu.a.d,
      cwj.uF,
      cyu.a.d,
      cwj.uI,
      cyu.a.d,
      cwj.uG,
      cyu.a.d,
      cwj.uJ,
      cyu.a.d
   );
   private static final dap b = dap.a(cwj.oA);
   private static final dap c = dap.a(cwj.rp);
   private static final dap d = dap.a(cwj.pv);

   public dao(dah $$0) {
      super($$0);
   }

   public boolean a(dai $$0, dff $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
         cwf $$8 = $$0.a($$7);
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
               if (!($$8.h() instanceof cvd)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cwf a(dai $$0, js.a $$1) {
      cyu.a $$2 = cyu.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cwf $$7 = $$0.a($$6);
         if (!$$7.f()) {
            cyu.a $$8 = a.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cvd) {
               $$5.add(((cvd)$$7.h()).b().f());
            }
         }
      }

      cwf $$9 = new cwf(cwj.uN);
      $$9.b(ku.ae, new cyu($$2, $$5, IntList.of(), $$4, $$3));
      return $$9;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cwf a(js.a $$0) {
      return new cwf(cwj.uN);
   }

   @Override
   public day<?> aq_() {
      return day.h;
   }
}
