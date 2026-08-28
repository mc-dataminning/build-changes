import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class dbz extends dbu {
   private static final Map<cxl, dae.a> c = Map.of(
      cxt.uM,
      dae.a.b,
      cxt.pP,
      dae.a.e,
      cxt.sW,
      dae.a.c,
      cxt.vb,
      dae.a.d,
      cxt.vc,
      dae.a.d,
      cxt.vf,
      dae.a.d,
      cxt.vd,
      dae.a.d,
      cxt.vg,
      dae.a.d,
      cxt.ve,
      dae.a.d,
      cxt.vh,
      dae.a.d
   );
   private static final dca d = dca.a(cxt.oV);
   private static final dca e = dca.a(cxt.rM);
   private static final dca f = dca.a(cxt.pQ);

   public dbz(dbr $$0) {
      super($$0);
   }

   public boolean a(dbs $$0, dhi $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;
         boolean $$4 = false;
         boolean $$5 = false;
         boolean $$6 = false;

         for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
            cxp $$8 = $$0.a($$7);
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
                  if (!($$8.h() instanceof cwn)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public cxp a(dbs $$0, js.a $$1) {
      dae.a $$2 = dae.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cxp $$7 = $$0.a($$6);
         if (!$$7.f()) {
            dae.a $$8 = c.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (e.a($$7)) {
               $$3 = true;
            } else if (d.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cwn $$9) {
               $$5.add($$9.b().f());
            }
         }
      }

      cxp $$10 = new cxp(cxt.vl);
      $$10.b(ku.ae, new dae($$2, $$5, IntList.of(), $$4, $$3));
      return $$10;
   }

   @Override
   public dco<dbz> a() {
      return dco.h;
   }
}
