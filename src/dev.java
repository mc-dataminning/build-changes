import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dev extends der {
   private static final dex d = dex.a(dao.vF);

   public dev(deo $$0) {
      super($$0);
   }

   public boolean a(dep $$0, dkj $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            dak $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof czj) {
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

   public dak a(dep $$0, ji.a $$1) {
      IntList $$2 = new IntArrayList();
      dak $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         dak $$5 = $$0.a($$4);
         if ($$5.h() instanceof czj $$7) {
            $$2.add($$7.a().f());
         } else if (d.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kl.ai, dcy.a, $$2, dcy::a);
         return $$3;
      } else {
         return dak.l;
      }
   }

   @Override
   public dfl<dev> a() {
      return dfl.i;
   }
}
