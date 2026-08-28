public class dan {
   public static bvc a(dkj $$0, csi $$1, bvb $$2) {
      $$1.c($$2);
      return bvc.c;
   }

   public static dak a(dak $$0, csi $$1, dak $$2, boolean $$3) {
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

   public static dak a(dak $$0, csi $$1, dak $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(coo $$0, Iterable<dak> $$1) {
      dkj $$2 = $$0.dV();
      if (!$$2.C) {
         $$1.forEach($$2x -> $$2.b(new coo($$2, $$0.dA(), $$0.dC(), $$0.dG(), $$2x)));
      }
   }
}
