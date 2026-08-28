public class cwt {
   public static bsl a(dgj $$0, coy $$1, bsk $$2) {
      $$1.c($$2);
      return bsl.c;
   }

   public static cwq a(cwq $$0, coy $$1, cwq $$2, boolean $$3) {
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

   public static cwq a(cwq $$0, coy $$1, cwq $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cld $$0, Iterable<cwq> $$1) {
      dgj $$2 = $$0.dV();
      if (!$$2.C) {
         $$1.forEach($$2x -> $$2.b(new cld($$2, $$0.dA(), $$0.dC(), $$0.dG(), $$2x)));
      }
   }
}
