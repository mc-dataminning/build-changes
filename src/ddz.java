import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class ddz extends ddu {
   private static final Map<czj, dcb.a> d = Map.of(
      czr.vg,
      dcb.a.b,
      czr.qh,
      dcb.a.e,
      czr.tq,
      dcb.a.c,
      czr.vv,
      dcb.a.d,
      czr.vw,
      dcb.a.d,
      czr.vz,
      dcb.a.d,
      czr.vx,
      dcb.a.d,
      czr.vA,
      dcb.a.d,
      czr.vy,
      dcb.a.d,
      czr.vB,
      dcb.a.d
   );
   private static final dea e = dea.a(czr.pn);
   private static final dea f = dea.a(czr.sg);
   private static final dea g = dea.a(czr.qi);

   public ddz(ddr $$0) {
      super($$0);
   }

   public boolean a(dds $$0, djm $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;
         boolean $$4 = false;
         boolean $$5 = false;
         boolean $$6 = false;

         for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
            czn $$8 = $$0.a($$7);
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
                  if (!($$8.h() instanceof cym)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public czn a(dds $$0, jh.a $$1) {
      dcb.a $$2 = dcb.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         czn $$7 = $$0.a($$6);
         if (!$$7.f()) {
            dcb.a $$8 = d.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (f.a($$7)) {
               $$3 = true;
            } else if (e.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cym $$9) {
               $$5.add($$9.a().f());
            }
         }
      }

      czn $$10 = new czn(czr.vF);
      $$10.b(kk.ai, new dcb($$2, $$5, IntList.of(), $$4, $$3));
      return $$10;
   }

   @Override
   public deo<ddz> a() {
      return deo.h;
   }
}
