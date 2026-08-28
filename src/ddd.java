import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class ddd extends dcz {
   private static final ddf c = ddf.a(cyw.vy);

   public ddd(dcw $$0) {
      super($$0);
   }

   public boolean a(dcx $$0, dip $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cys $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cxr) {
                  $$2 = true;
               } else {
                  if (!c.a($$5)) {
                     return false;
                  }

                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cys a(dcx $$0, jg.a $$1) {
      IntList $$2 = new IntArrayList();
      cys $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cys $$5 = $$0.a($$4);
         if ($$5.h() instanceof cxr $$7) {
            $$2.add($$7.a().f());
         } else if (c.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kj.ai, dbg.a, $$2, dbg::a);
         return $$3;
      } else {
         return cys.k;
      }
   }

   @Override
   public ddt<ddd> a() {
      return ddt.i;
   }
}
