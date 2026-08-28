public class cur {
   public static bqv<cup> a(dby $$0, cmx $$1, bqt $$2) {
      $$1.c($$2);
      return bqv.b($$1.b($$2));
   }

   public static cup a(cup $$0, cmx $$1, cup $$2, boolean $$3) {
      boolean $$4 = $$1.fP();
      if ($$3 && $$4) {
         if (!$$1.gc().i($$2)) {
            $$1.gc().f($$2);
         }

         return $$0;
      } else {
         $$0.a(1, $$1);
         if ($$0.e()) {
            return $$2;
         } else {
            if (!$$1.gc().f($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static cup a(cup $$0, cmx $$1, cup $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cjh $$0, Iterable<cup> $$1) {
      dby $$2 = $$0.dP();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new cjh($$2, $$0.du(), $$0.dw(), $$0.dA(), $$2x)));
      }
   }
}
