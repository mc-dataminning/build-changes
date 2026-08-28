public class cyv {
   public static bty a(dip $$0, cqs $$1, btx $$2) {
      $$1.c($$2);
      return bty.c;
   }

   public static cys a(cys $$0, cqs $$1, cys $$2, boolean $$3) {
      boolean $$4 = $$1.fU();
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

   public static cys a(cys $$0, cqs $$1, cys $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cmx $$0, Iterable<cys> $$1) {
      dip $$2 = $$0.dV();
      if (!$$2.C) {
         $$1.forEach($$2x -> $$2.b(new cmx($$2, $$0.dA(), $$0.dC(), $$0.dG(), $$2x)));
      }
   }
}
