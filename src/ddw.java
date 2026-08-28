import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class ddw extends ddr {
   private static final Map<czg, dby.a> d = Map.of(
      czo.vg,
      dby.a.b,
      czo.qh,
      dby.a.e,
      czo.tq,
      dby.a.c,
      czo.vv,
      dby.a.d,
      czo.vw,
      dby.a.d,
      czo.vz,
      dby.a.d,
      czo.vx,
      dby.a.d,
      czo.vA,
      dby.a.d,
      czo.vy,
      dby.a.d,
      czo.vB,
      dby.a.d
   );
   private static final ddx e = ddx.a(czo.pn);
   private static final ddx f = ddx.a(czo.sg);
   private static final ddx g = ddx.a(czo.qi);

   public ddw(ddo $$0) {
      super($$0);
   }

   public boolean a(ddp $$0, djh $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;
         boolean $$4 = false;
         boolean $$5 = false;
         boolean $$6 = false;

         for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
            czk $$8 = $$0.a($$7);
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
                  if (!($$8.h() instanceof cyj)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public czk a(ddp $$0, jh.a $$1) {
      dby.a $$2 = dby.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         czk $$7 = $$0.a($$6);
         if (!$$7.f()) {
            dby.a $$8 = d.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (f.a($$7)) {
               $$3 = true;
            } else if (e.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cyj $$9) {
               $$5.add($$9.a().f());
            }
         }
      }

      czk $$10 = new czk(czo.vF);
      $$10.b(kk.ai, new dby($$2, $$5, IntList.of(), $$4, $$3));
      return $$10;
   }

   @Override
   public del<ddw> a() {
      return del.h;
   }
}
