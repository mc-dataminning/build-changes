public class cyb {
   public static btq a(dhp $$0, cqi $$1, btp $$2) {
      $$1.c($$2);
      return btq.c;
   }

   public static cxy a(cxy $$0, cqi $$1, cxy $$2, boolean $$3) {
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

   public static cxy a(cxy $$0, cqi $$1, cxy $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cmn $$0, Iterable<cxy> $$1) {
      dhp $$2 = $$0.dV();
      if (!$$2.C) {
         $$1.forEach($$2x -> $$2.b(new cmn($$2, $$0.dA(), $$0.dC(), $$0.dG(), $$2x)));
      }
   }
}
