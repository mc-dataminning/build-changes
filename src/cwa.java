public class cwa {
   public static bry a(dev $$0, coh $$1, brx $$2) {
      $$1.c($$2);
      return bry.c;
   }

   public static cvx a(cvx $$0, coh $$1, cvx $$2, boolean $$3) {
      boolean $$4 = $$1.fX();
      if ($$3 && $$4) {
         if (!$$1.gk().i($$2)) {
            $$1.gk().f($$2);
         }

         return $$0;
      } else {
         $$0.a(1, $$1);
         if ($$0.f()) {
            return $$2;
         } else {
            if (!$$1.gk().f($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static cvx a(cvx $$0, coh $$1, cvx $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(ckq $$0, Iterable<cvx> $$1) {
      dev $$2 = $$0.dX();
      if (!$$2.C) {
         $$1.forEach($$2x -> $$2.b(new ckq($$2, $$0.dC(), $$0.dE(), $$0.dI(), $$2x)));
      }
   }
}
