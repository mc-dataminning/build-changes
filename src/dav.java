import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class dav extends dar {
   private static final Map<cwi, czb.a> a = Map.of(
      cwq.uo,
      czb.a.b,
      cwq.pu,
      czb.a.e,
      cwq.sz,
      czb.a.c,
      cwq.uD,
      czb.a.d,
      cwq.uE,
      czb.a.d,
      cwq.uH,
      czb.a.d,
      cwq.uF,
      czb.a.d,
      cwq.uI,
      czb.a.d,
      cwq.uG,
      czb.a.d,
      cwq.uJ,
      czb.a.d
   );
   private static final daw b = daw.a(cwq.oA);
   private static final daw c = daw.a(cwq.rp);
   private static final daw d = daw.a(cwq.pv);

   public dav(dao $$0) {
      super($$0);
   }

   public boolean a(dap $$0, dfm $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
         cwm $$8 = $$0.a($$7);
         if (!$$8.f()) {
            if (a.containsKey($$8.h())) {
               if ($$4) {
                  return false;
               }

               $$4 = true;
            } else if (c.a($$8)) {
               if ($$6) {
                  return false;
               }

               $$6 = true;
            } else if (b.a($$8)) {
               if ($$5) {
                  return false;
               }

               $$5 = true;
            } else if (d.a($$8)) {
               if ($$2) {
                  return false;
               }

               $$2 = true;
            } else {
               if (!($$8.h() instanceof cvk)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cwm a(dap $$0, js.a $$1) {
      czb.a $$2 = czb.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cwm $$7 = $$0.a($$6);
         if (!$$7.f()) {
            czb.a $$8 = a.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (c.a($$7)) {
               $$3 = true;
            } else if (b.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cvk) {
               $$5.add(((cvk)$$7.h()).b().f());
            }
         }
      }

      cwm $$9 = new cwm(cwq.uN);
      $$9.b(ku.ae, new czb($$2, $$5, IntList.of(), $$4, $$3));
      return $$9;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cwm a(js.a $$0) {
      return new cwm(cwq.uN);
   }

   @Override
   public dbf<?> ap_() {
      return dbf.h;
   }
}
