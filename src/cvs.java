public class cvs {
   public static brp a(deg $$0, cnu $$1, bro $$2) {
      $$1.c($$2);
      return brp.c;
   }

   public static cvp a(cvp $$0, cnu $$1, cvp $$2, boolean $$3) {
      boolean $$4 = $$1.fQ();
      if ($$3 && $$4) {
         if (!$$1.gc().i($$2)) {
            $$1.gc().f($$2);
         }

         return $$0;
      } else {
         $$0.a(1, $$1);
         if ($$0.f()) {
            return $$2;
         } else {
            if (!$$1.gc().f($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static cvp a(cvp $$0, cnu $$1, cvp $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cke $$0, Iterable<cvp> $$1) {
      deg $$2 = $$0.dS();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new cke($$2, $$0.dx(), $$0.dz(), $$0.dD(), $$2x)));
      }
   }
}
