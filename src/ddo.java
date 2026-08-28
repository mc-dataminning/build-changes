import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class ddo extends ddk {
   private static final ddq c = ddq.a(czh.vF);

   public ddo(ddh $$0) {
      super($$0);
   }

   public boolean a(ddi $$0, dja $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czd $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cyc) {
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

   public czd a(ddi $$0, jg.a $$1) {
      IntList $$2 = new IntArrayList();
      czd $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czd $$5 = $$0.a($$4);
         if ($$5.h() instanceof cyc $$7) {
            $$2.add($$7.a().f());
         } else if (c.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kj.ai, dbr.a, $$2, dbr::a);
         return $$3;
      } else {
         return czd.k;
      }
   }

   @Override
   public dee<ddo> a() {
      return dee.i;
   }
}
