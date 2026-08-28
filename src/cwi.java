public class cwi {
   public static bsh a(dff $$0, cor $$1, bsg $$2) {
      $$1.c($$2);
      return bsh.c;
   }

   public static cwf a(cwf $$0, cor $$1, cwf $$2, boolean $$3) {
      boolean $$4 = $$1.fY();
      if ($$3 && $$4) {
         if (!$$1.gl().i($$2)) {
            $$1.gl().f($$2);
         }

         return $$0;
      } else {
         $$0.a(1, $$1);
         if ($$0.f()) {
            return $$2;
         } else {
            if (!$$1.gl().f($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static cwf a(cwf $$0, cor $$1, cwf $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(ckz $$0, Iterable<cwf> $$1) {
      dff $$2 = $$0.dY();
      if (!$$2.C) {
         $$1.forEach($$2x -> $$2.b(new ckz($$2, $$0.dD(), $$0.dF(), $$0.dJ(), $$2x)));
      }
   }
}
