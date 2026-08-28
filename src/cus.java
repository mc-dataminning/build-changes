public class cus {
   public static bqw<cuq> a(dbz $$0, cmy $$1, bqu $$2) {
      $$1.c($$2);
      return bqw.b($$1.b($$2));
   }

   public static cuq a(cuq $$0, cmy $$1, cuq $$2, boolean $$3) {
      boolean $$4 = $$1.fP();
      if ($$3 && $$4) {
         if (!$$1.gc().i($$2)) {
            $$1.gc().f($$2);
         }

         return $$0;
      } else {
         $$0.a(1, $$1);
         if ($$0.e()) {
            return $$2;
         } else {
            if (!$$1.gc().f($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static cuq a(cuq $$0, cmy $$1, cuq $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cji $$0, Iterable<cuq> $$1) {
      dbz $$2 = $$0.dP();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new cji($$2, $$0.du(), $$0.dw(), $$0.dA(), $$2x)));
      }
   }
}
