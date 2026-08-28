import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class dak extends dag {
   private static final Map<cvx, cyq.a> a = Map.of(
      cwf.tY,
      cyq.a.b,
      cwf.pu,
      cyq.a.e,
      cwf.sj,
      cyq.a.c,
      cwf.un,
      cyq.a.d,
      cwf.uo,
      cyq.a.d,
      cwf.ur,
      cyq.a.d,
      cwf.up,
      cyq.a.d,
      cwf.us,
      cyq.a.d,
      cwf.uq,
      cyq.a.d,
      cwf.ut,
      cyq.a.d
   );
   private static final dal b = dal.a(cwf.oA);
   private static final dal c = dal.a(cwf.qZ);
   private static final dal d = dal.a(cwf.pv);

   public dak(dad $$0) {
      super($$0);
   }

   public boolean a(dae $$0, dfb $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
         cwb $$8 = $$0.a($$7);
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
               if (!($$8.h() instanceof cuz)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cwb a(dae $$0, js.a $$1) {
      cyq.a $$2 = cyq.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cwb $$7 = $$0.a($$6);
         if (!$$7.f()) {
            cyq.a $$8 = a.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cuz) {
               $$5.add(((cuz)$$7.h()).b().f());
            }
         }
      }

      cwb $$9 = new cwb(cwf.ux);
      $$9.b(ku.ae, new cyq($$2, $$5, IntList.of(), $$4, $$3));
      return $$9;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cwb a(js.a $$0) {
      return new cwb(cwf.ux);
   }

   @Override
   public dau<?> aq_() {
      return dau.h;
   }
}
