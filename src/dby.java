import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class dby extends dbt {
   private static final Map<cxk, dad.a> c = Map.of(
      cxs.uM,
      dad.a.b,
      cxs.pP,
      dad.a.e,
      cxs.sW,
      dad.a.c,
      cxs.vb,
      dad.a.d,
      cxs.vc,
      dad.a.d,
      cxs.vf,
      dad.a.d,
      cxs.vd,
      dad.a.d,
      cxs.vg,
      dad.a.d,
      cxs.ve,
      dad.a.d,
      cxs.vh,
      dad.a.d
   );
   private static final dbz d = dbz.a(cxs.oV);
   private static final dbz e = dbz.a(cxs.rM);
   private static final dbz f = dbz.a(cxs.pQ);

   public dby(dbq $$0) {
      super($$0);
   }

   public boolean a(dbr $$0, dhh $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;
         boolean $$4 = false;
         boolean $$5 = false;
         boolean $$6 = false;

         for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
            cxo $$8 = $$0.a($$7);
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
                  if (!($$8.h() instanceof cwm)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public cxo a(dbr $$0, js.a $$1) {
      dad.a $$2 = dad.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cxo $$7 = $$0.a($$6);
         if (!$$7.f()) {
            dad.a $$8 = c.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (e.a($$7)) {
               $$3 = true;
            } else if (d.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cwm $$9) {
               $$5.add($$9.b().f());
            }
         }
      }

      cxo $$10 = new cxo(cxs.vl);
      $$10.b(ku.ae, new dad($$2, $$5, IntList.of(), $$4, $$3));
      return $$10;
   }

   @Override
   public dcn<dby> a() {
      return dcn.h;
   }
}
