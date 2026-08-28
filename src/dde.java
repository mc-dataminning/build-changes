import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class dde extends dcz {
   private static final Map<cyo, dbg.a> c = Map.of(
      cyw.uZ,
      dbg.a.b,
      cyw.qc,
      dbg.a.e,
      cyw.tj,
      dbg.a.c,
      cyw.vo,
      dbg.a.d,
      cyw.vp,
      dbg.a.d,
      cyw.vs,
      dbg.a.d,
      cyw.vq,
      dbg.a.d,
      cyw.vt,
      dbg.a.d,
      cyw.vr,
      dbg.a.d,
      cyw.vu,
      dbg.a.d
   );
   private static final ddf d = ddf.a(cyw.pi);
   private static final ddf e = ddf.a(cyw.rZ);
   private static final ddf f = ddf.a(cyw.qd);

   public dde(dcw $$0) {
      super($$0);
   }

   public boolean a(dcx $$0, dip $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;
         boolean $$4 = false;
         boolean $$5 = false;
         boolean $$6 = false;

         for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
            cys $$8 = $$0.a($$7);
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
                  if (!($$8.h() instanceof cxr)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public cys a(dcx $$0, jg.a $$1) {
      dbg.a $$2 = dbg.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cys $$7 = $$0.a($$6);
         if (!$$7.f()) {
            dbg.a $$8 = c.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (e.a($$7)) {
               $$3 = true;
            } else if (d.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cxr $$9) {
               $$5.add($$9.a().f());
            }
         }
      }

      cys $$10 = new cys(cyw.vy);
      $$10.b(kj.ai, new dbg($$2, $$5, IntList.of(), $$4, $$3));
      return $$10;
   }

   @Override
   public ddt<dde> a() {
      return ddt.h;
   }
}
