import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dax extends dat {
   private static final daz c = daz.a(cws.vu);

   public dax(daq $$0) {
      super($$0);
   }

   public boolean a(dar $$0, dgh $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwo $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cvm) {
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

   public cwo a(dar $$0, jt.a $$1) {
      IntList $$2 = new IntArrayList();
      cwo $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwo $$5 = $$0.a($$4);
         if ($$5.h() instanceof cvm $$7) {
            $$2.add($$7.b().f());
         } else if (c.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kv.ae, czd.a, $$2, czd::a);
         return $$3;
      } else {
         return cwo.j;
      }
   }

   @Override
   public dbn<dax> a() {
      return dbn.i;
   }
}
