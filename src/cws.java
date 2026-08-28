public class cws {
   public static bsj a(dgi $$0, cox $$1, bsi $$2) {
      $$1.c($$2);
      return bsj.c;
   }

   public static cwp a(cwp $$0, cox $$1, cwp $$2, boolean $$3) {
      boolean $$4 = $$1.fV();
      if ($$3 && $$4) {
         if (!$$1.gi().i($$2)) {
            $$1.gi().f($$2);
         }

         return $$0;
      } else {
         $$0.a(1, $$1);
         if ($$0.f()) {
            return $$2;
         } else {
            if (!$$1.gi().f($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static cwp a(cwp $$0, cox $$1, cwp $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(clb $$0, Iterable<cwp> $$1) {
      dgi $$2 = $$0.dW();
      if (!$$2.C) {
         $$1.forEach($$2x -> $$2.b(new clb($$2, $$0.dB(), $$0.dD(), $$0.dH(), $$2x)));
      }
   }
}
