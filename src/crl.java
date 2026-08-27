import java.util.stream.Stream;

public class crl {
   public static bob<crj> a(cyx $$0, cjt $$1, bnz $$2) {
      $$1.c($$2);
      return bob.b($$1.b($$2));
   }

   public static crj a(crj $$0, cjt $$1, crj $$2, boolean $$3) {
      boolean $$4 = $$1.fM();
      if ($$3 && $$4) {
         if (!$$1.fZ().h($$2)) {
            $$1.fZ().e($$2);
         }

         return $$0;
      } else {
         $$0.a(1, $$1);
         if ($$0.d()) {
            return $$2;
         } else {
            if (!$$1.fZ().e($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static crj a(crj $$0, cjt $$1, crj $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cgd $$0, Stream<crj> $$1) {
      cyx $$2 = $$0.dM();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new cgd($$2, $$0.dr(), $$0.dt(), $$0.dx(), $$2x)));
      }
   }
}
