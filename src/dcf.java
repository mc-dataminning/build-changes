import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dcf extends dcb {
   private static final dch c = dch.a(cyc.vy);

   public dcf(dby $$0) {
      super($$0);
   }

   public boolean a(dbz $$0, dhp $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxy $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cww) {
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

   public cxy a(dbz $$0, ju.a $$1) {
      IntList $$2 = new IntArrayList();
      cxy $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxy $$5 = $$0.a($$4);
         if ($$5.h() instanceof cww $$7) {
            $$2.add($$7.b().f());
         } else if (c.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kx.ag, dak.a, $$2, dak::a);
         return $$3;
      } else {
         return cxy.k;
      }
   }

   @Override
   public dcv<dcf> a() {
      return dcv.i;
   }
}
