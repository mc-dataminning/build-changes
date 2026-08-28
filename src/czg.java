public class czg {
   public static bud a(dja $$0, crc $$1, buc $$2) {
      $$1.c($$2);
      return bud.c;
   }

   public static czd a(czd $$0, crc $$1, czd $$2, boolean $$3) {
      boolean $$4 = $$1.fV();
      if ($$3 && $$4) {
         if (!$$1.gj().j($$2)) {
            $$1.gj().g($$2);
         }

         return $$0;
      } else {
         $$0.a(1, $$1);
         if ($$0.f()) {
            return $$2;
         } else {
            if (!$$1.gj().g($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static czd a(czd $$0, crc $$1, czd $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cnh $$0, Iterable<czd> $$1) {
      dja $$2 = $$0.dV();
      if (!$$2.C) {
         $$1.forEach($$2x -> $$2.b(new cnh($$2, $$0.dA(), $$0.dC(), $$0.dG(), $$2x)));
      }
   }
}
