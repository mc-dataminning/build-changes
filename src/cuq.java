public class cuq {
   public static bqr<cuo> a(dcu $$0, cmv $$1, bqp $$2) {
      $$1.c($$2);
      return bqr.b($$1.b($$2));
   }

   public static cuo a(cuo $$0, cmv $$1, cuo $$2, boolean $$3) {
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

   public static cuo a(cuo $$0, cmv $$1, cuo $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cjf $$0, Iterable<cuo> $$1) {
      dcu $$2 = $$0.dQ();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new cjf($$2, $$0.dv(), $$0.dx(), $$0.dB(), $$2x)));
      }
   }
}
