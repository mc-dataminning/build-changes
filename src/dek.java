import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class dek extends def {
   private static final Map<czu, dcm.a> d = Map.of(
      dac.vg,
      dcm.a.b,
      dac.qh,
      dcm.a.e,
      dac.tq,
      dcm.a.c,
      dac.vv,
      dcm.a.d,
      dac.vw,
      dcm.a.d,
      dac.vz,
      dcm.a.d,
      dac.vx,
      dcm.a.d,
      dac.vA,
      dcm.a.d,
      dac.vy,
      dcm.a.d,
      dac.vB,
      dcm.a.d
   );
   private static final del e = del.a(dac.pn);
   private static final del f = del.a(dac.sg);
   private static final del g = del.a(dac.qi);

   public dek(dec $$0) {
      super($$0);
   }

   public boolean a(ded $$0, djx $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;
         boolean $$4 = false;
         boolean $$5 = false;
         boolean $$6 = false;

         for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
            czy $$8 = $$0.a($$7);
            if (!$$8.f()) {
               if (d.containsKey($$8.h())) {
                  if ($$4) {
                     return false;
                  }

                  $$4 = true;
               } else if (f.a($$8)) {
                  if ($$6) {
                     return false;
                  }

                  $$6 = true;
               } else if (e.a($$8)) {
                  if ($$5) {
                     return false;
                  }

                  $$5 = true;
               } else if (g.a($$8)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$8.h() instanceof cyx)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public czy a(ded $$0, jh.a $$1) {
      dcm.a $$2 = dcm.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         czy $$7 = $$0.a($$6);
         if (!$$7.f()) {
            dcm.a $$8 = d.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (f.a($$7)) {
               $$3 = true;
            } else if (e.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cyx $$9) {
               $$5.add($$9.a().f());
            }
         }
      }

      czy $$10 = new czy(dac.vF);
      $$10.b(kk.ai, new dcm($$2, $$5, IntList.of(), $$4, $$3));
      return $$10;
   }

   @Override
   public dez<dek> a() {
      return dez.h;
   }
}
