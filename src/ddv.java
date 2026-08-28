import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class ddv extends ddr {
   private static final ddx d = ddx.a(czo.vF);

   public ddv(ddo $$0) {
      super($$0);
   }

   public boolean a(ddp $$0, djh $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czk $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cyj) {
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

   public czk a(ddp $$0, jh.a $$1) {
      IntList $$2 = new IntArrayList();
      czk $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czk $$5 = $$0.a($$4);
         if ($$5.h() instanceof cyj $$7) {
            $$2.add($$7.a().f());
         } else if (d.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kk.ai, dby.a, $$2, dby::a);
         return $$3;
      } else {
         return czk.k;
      }
   }

   @Override
   public del<ddv> a() {
      return del.i;
   }
}
