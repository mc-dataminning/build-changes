import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dby extends dbu {
   private static final dca c = dca.a(cxt.vl);

   public dby(dbr $$0) {
      super($$0);
   }

   public boolean a(dbs $$0, dhi $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxp $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cwn) {
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

   public cxp a(dbs $$0, js.a $$1) {
      IntList $$2 = new IntArrayList();
      cxp $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxp $$5 = $$0.a($$4);
         if ($$5.h() instanceof cwn $$7) {
            $$2.add($$7.b().f());
         } else if (c.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(ku.ae, dae.a, $$2, dae::a);
         return $$3;
      } else {
         return cxp.j;
      }
   }

   @Override
   public dco<dby> a() {
      return dco.i;
   }
}
