import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class del extends deh {
   private static final den d = den.a(dae.vF);

   public del(dee $$0) {
      super($$0);
   }

   public boolean a(def $$0, djz $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            daa $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cyz) {
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

   public daa a(def $$0, ji.a $$1) {
      IntList $$2 = new IntArrayList();
      daa $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         daa $$5 = $$0.a($$4);
         if ($$5.h() instanceof cyz $$7) {
            $$2.add($$7.a().f());
         } else if (d.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kl.ai, dco.a, $$2, dco::a);
         return $$3;
      } else {
         return daa.k;
      }
   }

   @Override
   public dfb<del> a() {
      return dfb.i;
   }
}
