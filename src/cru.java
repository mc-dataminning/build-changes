import java.util.stream.Stream;

public class cru {
   public static bog<crs> a(czg $$0, cka $$1, boe $$2) {
      $$1.c($$2);
      return bog.b($$1.b($$2));
   }

   public static crs a(crs $$0, cka $$1, crs $$2, boolean $$3) {
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

   public static crs a(crs $$0, cka $$1, crs $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cgk $$0, Stream<crs> $$1) {
      czg $$2 = $$0.dM();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new cgk($$2, $$0.dr(), $$0.dt(), $$0.dx(), $$2x)));
      }
   }
}
