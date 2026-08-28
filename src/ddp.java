import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class ddp extends ddk {
   private static final Map<cyz, dbr.a> c = Map.of(
      czh.vg,
      dbr.a.b,
      czh.qh,
      dbr.a.e,
      czh.tq,
      dbr.a.c,
      czh.vv,
      dbr.a.d,
      czh.vw,
      dbr.a.d,
      czh.vz,
      dbr.a.d,
      czh.vx,
      dbr.a.d,
      czh.vA,
      dbr.a.d,
      czh.vy,
      dbr.a.d,
      czh.vB,
      dbr.a.d
   );
   private static final ddq d = ddq.a(czh.pn);
   private static final ddq e = ddq.a(czh.sg);
   private static final ddq f = ddq.a(czh.qi);

   public ddp(ddh $$0) {
      super($$0);
   }

   public boolean a(ddi $$0, dja $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;
         boolean $$4 = false;
         boolean $$5 = false;
         boolean $$6 = false;

         for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
            czd $$8 = $$0.a($$7);
            if (!$$8.f()) {
               if (c.containsKey($$8.h())) {
                  if ($$4) {
                     return false;
                  }

                  $$4 = true;
               } else if (e.a($$8)) {
                  if ($$6) {
                     return false;
                  }

                  $$6 = true;
               } else if (d.a($$8)) {
                  if ($$5) {
                     return false;
                  }

                  $$5 = true;
               } else if (f.a($$8)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$8.h() instanceof cyc)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public czd a(ddi $$0, jg.a $$1) {
      dbr.a $$2 = dbr.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         czd $$7 = $$0.a($$6);
         if (!$$7.f()) {
            dbr.a $$8 = c.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (e.a($$7)) {
               $$3 = true;
            } else if (d.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cyc $$9) {
               $$5.add($$9.a().f());
            }
         }
      }

      czd $$10 = new czd(czh.vF);
      $$10.b(kj.ai, new dbr($$2, $$5, IntList.of(), $$4, $$3));
      return $$10;
   }

   @Override
   public dee<ddp> a() {
      return dee.h;
   }
}
