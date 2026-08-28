import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class dae extends daa {
   private static final Map<cvt, cyk.a> a = Map.of(
      cwb.tY,
      cyk.a.b,
      cwb.pu,
      cyk.a.e,
      cwb.sj,
      cyk.a.c,
      cwb.un,
      cyk.a.d,
      cwb.uo,
      cyk.a.d,
      cwb.ur,
      cyk.a.d,
      cwb.up,
      cyk.a.d,
      cwb.us,
      cyk.a.d,
      cwb.uq,
      cyk.a.d,
      cwb.ut,
      cyk.a.d
   );
   private static final daf b = daf.a(cwb.oA);
   private static final daf c = daf.a(cwb.qZ);
   private static final daf d = daf.a(cwb.pv);

   public dae(czx $$0) {
      super($$0);
   }

   public boolean a(czy $$0, dev $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
         cvx $$8 = $$0.a($$7);
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
               if (!($$8.h() instanceof cuv)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cvx a(czy $$0, jr.a $$1) {
      cyk.a $$2 = cyk.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cvx $$7 = $$0.a($$6);
         if (!$$7.f()) {
            cyk.a $$8 = a.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cuv) {
               $$5.add(((cuv)$$7.h()).c().f());
            }
         }
      }

      cvx $$9 = new cvx(cwb.ux);
      $$9.b(kt.ad, new cyk($$2, $$5, IntList.of(), $$4, $$3));
      return $$9;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cvx a(jr.a $$0) {
      return new cvx(cwb.ux);
   }

   @Override
   public dao<?> ar_() {
      return dao.h;
   }
}
