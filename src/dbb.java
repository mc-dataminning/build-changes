public class dbb extends dau {
   public dbb(dar $$0) {
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
               if ($$5.b(kv.L)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cwt.vi)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cwp a(das $$0, jt.a $$1) {
      int $$2 = 0;
      cwp $$3 = cwp.j;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwp $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.b(kv.L)) {
               if (!$$3.f()) {
                  return cwp.j;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwt.vi)) {
                  return cwp.j;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : cwp.j;
   }

   @Override
   public dbo<dbb> a() {
      return dbo.e;
   }
}
