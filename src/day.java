import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class day extends dau {
   private static final dba c = dba.a(cwt.vu);

   public day(dar $$0) {
      super($$0);
   }

   public boolean a(das $$0, dgi $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwp $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cvn) {
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

   public cwp a(das $$0, jt.a $$1) {
      IntList $$2 = new IntArrayList();
      cwp $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwp $$5 = $$0.a($$4);
         if ($$5.h() instanceof cvn $$7) {
            $$2.add($$7.b().f());
         } else if (c.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kv.ae, cze.a, $$2, cze::a);
         return $$3;
      } else {
         return cwp.j;
      }
   }

   @Override
   public dbo<day> a() {
      return dbo.i;
   }
}
