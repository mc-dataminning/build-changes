import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class ddy extends ddu {
   private static final dea d = dea.a(czr.vF);

   public ddy(ddr $$0) {
      super($$0);
   }

   public boolean a(dds $$0, djm $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czn $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cym) {
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

   public czn a(dds $$0, jh.a $$1) {
      IntList $$2 = new IntArrayList();
      czn $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czn $$5 = $$0.a($$4);
         if ($$5.h() instanceof cym $$7) {
            $$2.add($$7.a().f());
         } else if (d.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kk.ai, dcb.a, $$2, dcb::a);
         return $$3;
      } else {
         return czn.k;
      }
   }

   @Override
   public deo<ddy> a() {
      return deo.i;
   }
}
