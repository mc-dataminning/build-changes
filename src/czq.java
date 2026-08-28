public class czq {
   public static bug a(djm $$0, crm $$1, buf $$2) {
      $$1.c($$2);
      return bug.c;
   }

   public static czn a(czn $$0, crm $$1, czn $$2, boolean $$3) {
      boolean $$4 = $$1.fU();
      if ($$3 && $$4) {
         if (!$$1.gi().j($$2)) {
            $$1.gi().g($$2);
         }

         return $$0;
      } else {
         $$0.a(1, $$1);
         if ($$0.f()) {
            return $$2;
         } else {
            if (!$$1.gi().g($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static czn a(czn $$0, crm $$1, czn $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cnr $$0, Iterable<czn> $$1) {
      djm $$2 = $$0.dU();
      if (!$$2.C) {
         $$1.forEach($$2x -> $$2.b(new cnr($$2, $$0.dz(), $$0.dB(), $$0.dF(), $$2x)));
      }
   }
}
