import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class dcg extends dcb {
   private static final Map<cxu, dak.a> c = Map.of(
      cyc.uZ,
      dak.a.b,
      cyc.qc,
      dak.a.e,
      cyc.tj,
      dak.a.c,
      cyc.vo,
      dak.a.d,
      cyc.vp,
      dak.a.d,
      cyc.vs,
      dak.a.d,
      cyc.vq,
      dak.a.d,
      cyc.vt,
      dak.a.d,
      cyc.vr,
      dak.a.d,
      cyc.vu,
      dak.a.d
   );
   private static final dch d = dch.a(cyc.pi);
   private static final dch e = dch.a(cyc.rZ);
   private static final dch f = dch.a(cyc.qd);

   public dcg(dby $$0) {
      super($$0);
   }

   public boolean a(dbz $$0, dhp $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;
         boolean $$4 = false;
         boolean $$5 = false;
         boolean $$6 = false;

         for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
            cxy $$8 = $$0.a($$7);
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
                  if (!($$8.h() instanceof cww)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public cxy a(dbz $$0, ju.a $$1) {
      dak.a $$2 = dak.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cxy $$7 = $$0.a($$6);
         if (!$$7.f()) {
            dak.a $$8 = c.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (e.a($$7)) {
               $$3 = true;
            } else if (d.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cww $$9) {
               $$5.add($$9.b().f());
            }
         }
      }

      cxy $$10 = new cxy(cyc.vy);
      $$10.b(kx.ag, new dak($$2, $$5, IntList.of(), $$4, $$3));
      return $$10;
   }

   @Override
   public dcv<dcg> a() {
      return dcv.h;
   }
}
