import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class daw extends das {
   private static final day c = day.a(cwr.vu);

   public daw(dap $$0) {
      super($$0);
   }

   public boolean a(daq $$0, dgg $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwn $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cvl) {
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

   public cwn a(daq $$0, jt.a $$1) {
      IntList $$2 = new IntArrayList();
      cwn $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwn $$5 = $$0.a($$4);
         if ($$5.h() instanceof cvl $$7) {
            $$2.add($$7.b().f());
         } else if (c.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kv.ae, czc.a, $$2, czc::a);
         return $$3;
      } else {
         return cwn.j;
      }
   }

   @Override
   public dbm<daw> a() {
      return dbm.i;
   }
}
