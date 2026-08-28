public class cue {
   public static bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      $$1.c($$2);
      return bqh.b($$1.b($$2));
   }

   public static cuc a(cuc $$0, cmk $$1, cuc $$2, boolean $$3) {
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

   public static cuc a(cuc $$0, cmk $$1, cuc $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(ciu $$0, Iterable<cuc> $$1) {
      dcf $$2 = $$0.dQ();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new ciu($$2, $$0.dv(), $$0.dx(), $$0.dB(), $$2x)));
      }
   }
}
