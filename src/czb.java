public class czb {
   public static bub a(div $$0, cqy $$1, bua $$2) {
      $$1.c($$2);
      return bub.c;
   }

   public static cyy a(cyy $$0, cqy $$1, cyy $$2, boolean $$3) {
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

   public static cyy a(cyy $$0, cqy $$1, cyy $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cnd $$0, Iterable<cyy> $$1) {
      div $$2 = $$0.dV();
      if (!$$2.C) {
         $$1.forEach($$2x -> $$2.b(new cnd($$2, $$0.dA(), $$0.dC(), $$0.dG(), $$2x)));
      }
   }
}
