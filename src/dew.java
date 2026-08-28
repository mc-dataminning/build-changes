import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class dew extends der {
   private static final Map<dag, dcy.a> d = Map.of(
      dao.vg,
      dcy.a.b,
      dao.qh,
      dcy.a.e,
      dao.tq,
      dcy.a.c,
      dao.vv,
      dcy.a.d,
      dao.vw,
      dcy.a.d,
      dao.vz,
      dcy.a.d,
      dao.vx,
      dcy.a.d,
      dao.vA,
      dcy.a.d,
      dao.vy,
      dcy.a.d,
      dao.vB,
      dcy.a.d
   );
   private static final dex e = dex.a(dao.pn);
   private static final dex f = dex.a(dao.sg);
   private static final dex g = dex.a(dao.qi);

   public dew(deo $$0) {
      super($$0);
   }

   public boolean a(dep $$0, dkj $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;
         boolean $$4 = false;
         boolean $$5 = false;
         boolean $$6 = false;

         for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
            dak $$8 = $$0.a($$7);
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
                  if (!($$8.h() instanceof czj)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public dak a(dep $$0, ji.a $$1) {
      dcy.a $$2 = dcy.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         dak $$7 = $$0.a($$6);
         if (!$$7.f()) {
            dcy.a $$8 = d.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (f.a($$7)) {
               $$3 = true;
            } else if (e.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof czj $$9) {
               $$5.add($$9.a().f());
            }
         }
      }

      dak $$10 = new dak(dao.vF);
      $$10.b(kl.ai, new dcy($$2, $$5, IntList.of(), $$4, $$3));
      return $$10;
   }

   @Override
   public dfl<dew> a() {
      return dfl.h;
   }
}
