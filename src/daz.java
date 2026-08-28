import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class daz extends dav {
   private static final dbb c = dbb.a(cwu.vu);

   public daz(das $$0) {
      super($$0);
   }

   public boolean a(dat $$0, dgj $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwq $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cvo) {
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

   public cwq a(dat $$0, jt.a $$1) {
      IntList $$2 = new IntArrayList();
      cwq $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwq $$5 = $$0.a($$4);
         if ($$5.h() instanceof cvo $$7) {
            $$2.add($$7.b().f());
         } else if (c.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kv.ae, czf.a, $$2, czf::a);
         return $$3;
      } else {
         return cwq.j;
      }
   }

   @Override
   public dbp<daz> a() {
      return dbp.i;
   }
}
