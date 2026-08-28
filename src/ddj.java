import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class ddj extends ddf {
   private static final ddl c = ddl.a(czc.vA);

   public ddj(ddc $$0) {
      super($$0);
   }

   public boolean a(ddd $$0, div $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cyy $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cxx) {
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

   public cyy a(ddd $$0, jg.a $$1) {
      IntList $$2 = new IntArrayList();
      cyy $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cyy $$5 = $$0.a($$4);
         if ($$5.h() instanceof cxx $$7) {
            $$2.add($$7.a().f());
         } else if (c.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kj.ai, dbm.a, $$2, dbm::a);
         return $$3;
      } else {
         return cyy.k;
      }
   }

   @Override
   public ddz<ddj> a() {
      return ddz.i;
   }
}
