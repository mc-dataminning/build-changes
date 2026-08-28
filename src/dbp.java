import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dbp extends dbl {
   private static final dbr c = dbr.a(cxl.vw);

   public dbp(dbi $$0) {
      super($$0);
   }

   public boolean a(dbj $$0, dgz $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxh $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cwf) {
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

   public cxh a(dbj $$0, jt.a $$1) {
      IntList $$2 = new IntArrayList();
      cxh $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxh $$5 = $$0.a($$4);
         if ($$5.h() instanceof cwf $$7) {
            $$2.add($$7.b().f());
         } else if (c.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kv.ag, czu.a, $$2, czu::a);
         return $$3;
      } else {
         return cxh.k;
      }
   }

   @Override
   public dcf<dbp> a() {
      return dcf.i;
   }
}
