import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dej extends def {
   private static final del d = del.a(dac.vF);

   public dej(dec $$0) {
      super($$0);
   }

   public boolean a(ded $$0, djx $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czy $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cyx) {
                  $$2 = true;
               } else {
                  if (!d.a($$5)) {
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

   public czy a(ded $$0, jh.a $$1) {
      IntList $$2 = new IntArrayList();
      czy $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czy $$5 = $$0.a($$4);
         if ($$5.h() instanceof cyx $$7) {
            $$2.add($$7.a().f());
         } else if (d.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kk.ai, dcm.a, $$2, dcm::a);
         return $$3;
      } else {
         return czy.k;
      }
   }

   @Override
   public dez<dej> a() {
      return dez.i;
   }
}
