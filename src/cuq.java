public class cuq {
   public static bqu<cuo> a(dbx $$0, cmw $$1, bqs $$2) {
      $$1.c($$2);
      return bqu.b($$1.b($$2));
   }

   public static cuo a(cuo $$0, cmw $$1, cuo $$2, boolean $$3) {
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

   public static cuo a(cuo $$0, cmw $$1, cuo $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cjg $$0, Iterable<cuo> $$1) {
      dbx $$2 = $$0.dP();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new cjg($$2, $$0.du(), $$0.dw(), $$0.dA(), $$2x)));
      }
   }
}
