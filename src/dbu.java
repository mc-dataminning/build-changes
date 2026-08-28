import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class dbu extends dbq {
   private static final Map<cxg, czz.a> c = Map.of(
      cxo.uM,
      czz.a.b,
      cxo.pP,
      czz.a.e,
      cxo.sW,
      czz.a.c,
      cxo.vb,
      czz.a.d,
      cxo.vc,
      czz.a.d,
      cxo.vf,
      czz.a.d,
      cxo.vd,
      czz.a.d,
      cxo.vg,
      czz.a.d,
      cxo.ve,
      czz.a.d,
      cxo.vh,
      czz.a.d
   );
   private static final dbv d = dbv.a(cxo.oV);
   private static final dbv e = dbv.a(cxo.rM);
   private static final dbv f = dbv.a(cxo.pQ);

   public dbu(dbn $$0) {
      super($$0);
   }

   public boolean a(dbo $$0, dha $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
         cxk $$8 = $$0.a($$7);
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
               if (!($$8.h() instanceof cwi)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cxk a(dbo $$0, js.a $$1) {
      czz.a $$2 = czz.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cxk $$7 = $$0.a($$6);
         if (!$$7.f()) {
            czz.a $$8 = c.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (e.a($$7)) {
               $$3 = true;
            } else if (d.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cwi) {
               $$5.add(((cwi)$$7.h()).b().f());
            }
         }
      }

      cxk $$9 = new cxk(cxo.vl);
      $$9.b(ku.ae, new czz($$2, $$5, IntList.of(), $$4, $$3));
      return $$9;
   }

   @Override
   public dci<dbu> a() {
      return dci.h;
   }
}
