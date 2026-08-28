public class cus {
   public static bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      $$1.c($$2);
      return bqs.b($$1.b($$2));
   }

   public static cuq a(cuq $$0, cmx $$1, cuq $$2, boolean $$3) {
      boolean $$4 = $$1.fM();
      if ($$3 && $$4) {
         if (!$$1.fZ().i($$2)) {
            $$1.fZ().f($$2);
         }

         return $$0;
      } else {
         $$0.a(1, $$1);
         if ($$0.e()) {
            return $$2;
         } else {
            if (!$$1.fZ().f($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static cuq a(cuq $$0, cmx $$1, cuq $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cjh $$0, Iterable<cuq> $$1) {
      dcw $$2 = $$0.dP();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new cjh($$2, $$0.du(), $$0.dw(), $$0.dA(), $$2x)));
      }
   }
}
