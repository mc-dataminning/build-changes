import java.util.stream.Stream;

public class cqo {
   public static bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      $$1.c($$2);
      return bne.b($$1.b($$2));
   }

   public static cqm a(cqm $$0, ciu $$1, cqm $$2, boolean $$3) {
      boolean $$4 = $$1.fM();
      if ($$3 && $$4) {
         if (!$$1.fZ().h($$2)) {
            $$1.fZ().e($$2);
         }

         return $$0;
      } else {
         $$0.a(1, $$1);
         if ($$0.b()) {
            return $$2;
         } else {
            if (!$$1.fZ().e($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static cqm a(cqm $$0, ciu $$1, cqm $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cfe $$0, Stream<cqm> $$1) {
      cxb $$2 = $$0.dM();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new cfe($$2, $$0.dr(), $$0.dt(), $$0.dx(), $$2x)));
      }
   }
}
