import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class daf extends dab {
   private static final Map<cvn, cyl.a> a = Map.of(
      cvw.tY,
      cyl.a.b,
      cvw.pu,
      cyl.a.e,
      cvw.sj,
      cyl.a.c,
      cvw.un,
      cyl.a.d,
      cvw.uo,
      cyl.a.d,
      cvw.ur,
      cyl.a.d,
      cvw.up,
      cyl.a.d,
      cvw.us,
      cyl.a.d,
      cvw.uq,
      cyl.a.d,
      cvw.ut,
      cyl.a.d
   );
   private static final dag b = dag.a(cvw.oA);
   private static final dag c = dag.a(cvw.qZ);
   private static final dag d = dag.a(cvw.pv);

   public daf(czy $$0) {
      super($$0);
   }

   public boolean a(czz $$0, dej $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
         cvs $$8 = $$0.a($$7);
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
               if (!($$8.h() instanceof cun)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cvs a(czz $$0, jq.a $$1) {
      cyl.a $$2 = cyl.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cvs $$7 = $$0.a($$6);
         if (!$$7.f()) {
            cyl.a $$8 = a.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cun) {
               $$5.add(((cun)$$7.h()).c().f());
            }
         }
      }

      cvs $$9 = new cvs(cvw.ux);
      $$9.b(ks.Z, new cyl($$2, $$5, IntList.of(), $$4, $$3));
      return $$9;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cvs a(jq.a $$0) {
      return new cvs(cvw.ux);
   }

   @Override
   public dap<?> ar_() {
      return dap.h;
   }
}
