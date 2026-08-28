public class cut {
   public static bqx<cur> a(dca $$0, cmz $$1, bqv $$2) {
      $$1.c($$2);
      return bqx.b($$1.b($$2));
   }

   public static cur a(cur $$0, cmz $$1, cur $$2, boolean $$3) {
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

   public static cur a(cur $$0, cmz $$1, cur $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cjj $$0, Iterable<cur> $$1) {
      dca $$2 = $$0.dP();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new cjj($$2, $$0.du(), $$0.dw(), $$0.dA(), $$2x)));
      }
   }
}
